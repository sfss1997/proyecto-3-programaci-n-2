/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3_programacion2;

import Domain.Difficulty;
import static Domain.Difficulty.Easy;
import static Domain.Difficulty.Hard;
import static Domain.Difficulty.Nightmare;
import static Domain.Difficulty.Normal;
import Logic.ReadFiles;
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
import org.json.simple.parser.ParseException;

/**
 *
 * @author fabian
 */
public class MenuController implements Initializable {
    
    @FXML
    ComboBox difficultyComboBox;
    
    
    ReadFiles readFiles = new ReadFiles();
    
    @FXML
    private void StartButton(ActionEvent event) throws IOException, ParseException {
        System.out.println(readFiles.readJsonFiles(difficultyComboBox.getValue().toString()));
        
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        difficultyComboBox.getItems().addAll(Easy, Normal, Hard,Nightmare);
    }    
    
}
