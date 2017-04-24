/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplychess;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author tyler.jorgensen
 */
public class SimplyChess extends Application {
    
    //Stage/scene dimensions
    final int WIDTH = 800;
    final int HEIGHT = 600;
    final int CENTER_X = WIDTH/2;
    final int CENTER_Y = HEIGHT/2;
    
    //Menu Buttons
    Button start = new Button("Start");
    Button settings = new Button("Settings");
    Button quit = new Button("Quit");
    
    //Settings buttons
    Button backToMenuFromSettings = new Button("Back");
    
    //Game buttons
    Button backToMenuFromGame = new Button("Back");
   
    Pane menuRoot = new Pane();
    Pane gameRoot = new Pane();
    Pane settingsRoot = new Pane();
    
    Scene menuScene = new Scene(menuRoot,WIDTH,HEIGHT);
    Scene settingsScene = new Scene(settingsRoot,WIDTH,HEIGHT);
    Scene gameScene = new Scene(gameRoot,WIDTH,HEIGHT);
    
  
    @Override
    public void start(Stage primaryStage) {
        
        
        //Button events -> Menu
        start.setOnAction(e -> primaryStage.setScene(gameScene));
        settings.setOnAction(e -> primaryStage.setScene(settingsScene));
        quit.setOnAction(e -> primaryStage.close());
        
        //Button events -> Settings
        backToMenuFromSettings.setOnAction(e -> primaryStage.setScene(menuScene));
        
        //Button events -> Game
        backToMenuFromGame.setOnAction(e -> primaryStage.setScene(menuScene));
       
        //Button layout -> Menu
        start.setLayoutX(CENTER_X);start.setLayoutY(CENTER_Y-100);
        settings.setLayoutX(CENTER_X);settings.setLayoutY(CENTER_Y-50);
        quit.setLayoutX(CENTER_X);quit.setLayoutY(CENTER_Y);
        
        //Button layout -> Settings
        backToMenuFromSettings.setLayoutX(CENTER_X);
        backToMenuFromSettings.setLayoutY(CENTER_Y);
        
        //Button layout -> Game
        backToMenuFromGame.setLayoutX(WIDTH-100);
        backToMenuFromGame.setLayoutY(HEIGHT-75);
        
        
        //Adding notes to panes
        menuRoot.getChildren().addAll(start,settings,quit);
        gameRoot.getChildren().addAll(backToMenuFromGame);
        settingsRoot.getChildren().addAll(backToMenuFromSettings);
        
        
        primaryStage.show();
        primaryStage.setTitle("Simply Chess");
        primaryStage.setScene(menuScene);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
