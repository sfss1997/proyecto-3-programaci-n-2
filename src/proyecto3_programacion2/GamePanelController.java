/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3_programacion2;

import Logic.Cell;
import Logic.Logic;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javax.swing.Timer;

/**
 * FXML Controller class
 *
 * @author fabian
 */
public class GamePanelController implements Initializable {

    private GridPane gridPane;
    private Cell cell[][];
    private Logic logic;
    
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
        this.cell[1][1].setImageView(new ImageView("/Images/right2.gif"));
        addKeyAction();
    }    
    
    private void createGridPane(){
        this.anchorTest.getChildren().clear();

            this.cell = new Cell[8][8];
            this.gridPane = new GridPane();

            //Crea el GridPane
            this.gridPane = this.logic.createGridPane(8, 8, this.cell);

            //Añade el GridPane al AnchorPane
            this.anchorTest = this.logic.addGridPaneToAnchorPane(this.anchorTest, this.gridPane);
            
            
            
    }
    
    public void addKeyAction(){
        this.gridPane.setOnKeyPressed(e ->{
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
                } else if (e.getCode() == KeyCode.A){
                    System.out.println("AAAAAAAAAA");
                }
        });
                
            
//        addKeyAction(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent ke) {
////                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                int key = e.getKeyCode();
//                if (key == KeyEvent.VK_LEFT) {
//
//                } else if (key == KeyEvent.VK_RIGHT) {
//                    cell[1][2].setImageView(new ImageView("/Images/right2.gif"));
//                    cell[1][1].setImageView(new ImageView("/Images/fondonegro.png"));
//                } else if (key == KeyEvent.VK_UP) {
//
//                } else if (key == KeyEvent.VK_DOWN) {
//
//                }
//            }
//
//            @Override
//            public void keyReleased(KeyEvent ke) {
////                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        });

    }



    @FXML
    private void x(ActionEvent event) {
        cell[1][2].setImageView(new ImageView("/Images/right2.gif"));
                    cell[1][1].setImageView(new ImageView("/Images/fondonegro.png"));
    }
    
}
