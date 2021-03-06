/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author hvill
 */
public class Logic {

    public static Cell[][] cell;
    private static int playerRow;
    private static int playerColumn;

    public Logic() {
        init();
    }

    private void init() {
        if (cell == null) {
            this.cell = new Cell[8][7];
            this.playerRow = 3;
            this.playerColumn = 3;
        }
    }

    /**
     * Crea un GridPane.
     *
     * @param rows
     * @param columns
     * @param cell
     * @return Retorna el GridPane
     */
    public GridPane createGridPane() {
        GridPane newGridPane = new GridPane();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                cell[i][j] = new Cell();
                cell[i][j].setRow(i);
                cell[i][j].setColumn(j);
                newGridPane.add(cell[i][j], j, i);
            }
        }
        this.cell[playerRow][playerColumn].setIdAndImageView(2);
        return newGridPane;
    }

    /**
     * Añade un GridPane a un AnchorPane.
     *
     * @param anchorPane
     * @param gridPane
     * @return Retorna el AnchorPane con el GridPane.
     */
    public AnchorPane addGridPaneToAnchorPane(AnchorPane anchorPane, GridPane gridPane) {
        anchorPane.setPrefHeight(gridPane.getPrefHeight());
        anchorPane.setPrefWidth(gridPane.getPrefWidth());
        anchorPane.getChildren().add(gridPane);

        return anchorPane;
    }

    /**
     * Valida si la tecla precionada es un número o no.
     *
     * @param event
     * @return Retorna true si la tecla presionada es un número y un false si no
     * lo es.
     */
    public boolean isNumeric(KeyEvent event) {
        char charType = event.getCharacter().charAt(0);
        if (Character.isDigit(charType)) {
            return true;
        }
        return false;
    }

    public void playerUp() {
        this.cell[this.playerRow][this.playerColumn].setIdAndImageView(0);
        if (this.playerRow > 0 && this.cell[this.playerRow - 1][this.playerColumn].getID() == 0) {
            this.playerRow--;
        }
        this.cell[this.playerRow][this.playerColumn].setIdAndImageView(2);
    }

    public void playerDown() {
        this.cell[this.playerRow][this.playerColumn].setIdAndImageView(0);
        if (playerRow < this.cell.length - 1 && this.cell[this.playerRow + 1][this.playerColumn].getID() == 0) {
            this.playerRow++;
        }
        this.cell[this.playerRow][this.playerColumn].setIdAndImageView(2);
    }

    public void playerLeft() {
        this.cell[this.playerRow][this.playerColumn].setIdAndImageView(0);
        if (this.playerColumn > 0 && this.cell[this.playerRow][this.playerColumn - 1].getID() == 0) {
            this.playerColumn--;
        }
        this.cell[this.playerRow][this.playerColumn].setIdAndImageView(2);
    }

    public void playerRight() {
        this.cell[this.playerRow][this.playerColumn].setIdAndImageView(0);
        if (playerColumn < this.cell[0].length - 1 && this.cell[this.playerRow][this.playerColumn + 1].getID() == 0) {
            this.playerColumn++;
        }
        this.cell[this.playerRow][this.playerColumn].setIdAndImageView(2);
    }

    public void removeEarthUp() {
        if (this.playerRow > 0 && this.cell[this.playerRow - 1][this.playerColumn].getID() == 1) {
            this.cell[this.playerRow - 1][this.playerColumn].setIdAndImageView(0);
        }
    }
    
    public void removeEarthDown(){
        if (playerRow < this.cell.length - 1 && this.cell[this.playerRow + 1][this.playerColumn].getID() == 1) {
            this.cell[this.playerRow + 1][this.playerColumn].setIdAndImageView(0);
        }
    }

    public void removeEarthLeft() {
        if (this.playerColumn > 0 && this.cell[this.playerRow][this.playerColumn - 1].getID() == 1) {
            this.cell[this.playerRow][this.playerColumn - 1].setIdAndImageView(0);
        }
    }

    public void removeEarthRight() {
        if (playerColumn < this.cell[0].length - 1 && this.cell[this.playerRow][this.playerColumn + 1].getID() == 1) {
            this.cell[this.playerRow][this.playerColumn + 1].setIdAndImageView(0);
        }
    }

}
