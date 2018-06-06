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

    private Cell[][] cell;

    public Logic() {
    }

    /**
     * Crea un GridPane.
     *
     * @param rows
     * @param columns
     * @param cell
     * @return Retorna el GridPane
     */
    public GridPane createGridPane(int rows, int columns, Cell[][] cell) {
        GridPane newGridPane = new GridPane();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                cell[i][j] = new Cell();
                cell[i][j].setRow(i);
                cell[i][j].setColumn(j);
                newGridPane.add(cell[i][j], j, i);
            }
        }
        this.cell = cell;
        newGridPane.setStyle("-fx-cursor : hand");
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

    public void x(KeyEvent e) {
        if (e.getCode() == KeyCode.LEFT) {
            System.out.println("aaaaaa");
        } else if (e.getCode() == KeyCode.RIGHT) {
            System.out.println("aaaaaa");
            cell[1][2].setImageView(new ImageView("/Images/right2.gif"));
            cell[1][1].setImageView(new ImageView("/Images/fondonegro.png"));
            
        } else if (e.getCode() == KeyCode.UP) {
            System.out.println("aaaaaa");
        } else if (e.getCode() == KeyCode.DOWN) {
            System.out.println("aaaaaa");
        } else if (e.getCode() == KeyCode.A) {
            System.out.println("AAAAAAAAAA");
        }
    }

}
