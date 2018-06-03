/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3_programacion2;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author fabian
 */
public class MenuController implements Initializable {
    
    @FXML
    ComboBox difficultyComboBox;
    
    @FXML
    private void StartButton(ActionEvent event) throws IOException {
        System.out.println(difficultyComboBox.getValue().toString());
            
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        difficultyComboBox.getItems().addAll("Easy", "Normal", "Hard","Nightmare");
    }    
    
}
