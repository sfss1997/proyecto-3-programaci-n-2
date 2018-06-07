/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3_programacion2;

import Logic.Cell;
import Logic.Hilo;
import Logic.Logic;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author fabian
 */
public class GamePanelController implements Initializable {

    private GridPane gridPane;
    private Cell cell[][];
    private Logic logic;
    private int playerRow;
    private int playerColumn;

    @FXML
    private AnchorPane anchorTest;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        logic = new Logic();
        createGridPane();
        
        Hilo hilo = new Hilo();
        Thread thread = new Thread((Runnable) hilo);
        thread.start();

        addKeyAction();
    }

    private void createGridPane() {
        this.anchorTest.getChildren().clear();

        this.cell = new Cell[8][8];
        this.gridPane = new GridPane();

        //Crea el GridPane
        this.gridPane = this.logic.createGridPane();

        //Añade el GridPane al AnchorPane
        this.anchorTest = this.logic.addGridPaneToAnchorPane(this.anchorTest, this.gridPane);

    }

    public void addKeyAction() {
        anchorTest.setOnKeyPressed(e ->{
            if(e.getCode() == KeyCode.RIGHT){
                this.logic.playerRight();
            } else if(e.getCode() == KeyCode.LEFT){
                this.logic.playerLeft();
            } else if(e.getCode() == KeyCode.UP){
                this.logic.playerUp();
            } else if(e.getCode() == KeyCode.DOWN){
                this.logic.playerDown();
            }
        });
    }

    @FXML
    private void arriba(ActionEvent event) throws InterruptedException {
        
    }

    @FXML
    private void abajo(ActionEvent event) {
        
    }

    @FXML
    private void izq(ActionEvent event) {
        
    }

    @FXML
    private void der(ActionEvent event) {
        
    }

}
