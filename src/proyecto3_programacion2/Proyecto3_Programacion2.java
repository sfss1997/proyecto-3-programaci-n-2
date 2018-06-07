/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3_programacion2;

import Domain.Configuration;
import Logic.Logic;
import Logic.ReadFiles;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.json.simple.parser.ParseException;

/**
 *
 * @author fabian
 */
public class Proyecto3_Programacion2 extends Application {

    Logic logic = new Logic();
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GamePanel.fxml"));

        Scene scene = new Scene(root);
        scene.getRoot().requestFocus();
        
        stage.setScene(scene);
        stage.setTitle("Pacman :v");
        stage.setResizable(false);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException {
        launch(args);

//        Configuration configuration = new Configuration();
//        ReadFiles.readJsonFiles();
//        configuration.toString();
    }

}
