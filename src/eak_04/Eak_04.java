/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eak_04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author egeubai
 */
public class Eak_04 extends Application {
    
    
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("eak_01");
        stage.setResizable(false);    
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
