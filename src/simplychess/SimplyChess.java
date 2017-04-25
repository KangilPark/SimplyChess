/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplychess;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author tyler.jorgensen
 */
public class SimplyChess extends Application {
    
    //Stage/scene dimensions
    final int WIDTH = 800;
    final int HEIGHT = 640;
    final int CENTER_X = WIDTH/2;
    final int CENTER_Y = HEIGHT/2;
    
    //Menu Buttons
    ImageButton start = new ImageButton("/resources/play.png");
    ImageButton settings = new ImageButton("/resources/settings.png");
    ImageButton quit = new ImageButton("/resources/quit.png");
    
    //Settings buttons
    Button backToMenuFromSettings = new Button("Back");
    
    //Game buttons
    Button backToMenuFromGame = new Button("Back");
    
    //Pane for all scenes
    Pane menuRoot = new Pane();
    Pane gameRoot = new Pane();
    Pane settingsRoot = new Pane();
    
    //Scenes for each view
    Scene menuScene = new Scene(menuRoot,WIDTH,HEIGHT);
    Scene settingsScene = new Scene(settingsRoot,WIDTH,HEIGHT);
    Scene gameScene = new Scene(gameRoot,WIDTH,HEIGHT);
    
    //Board game object
    Board b = new Board();
    
    //Backgrounds for different scenes
    ImageView gameBackground = new ImageView();
    ImageView menuBackground = new ImageView();
    
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
        start.setLayoutX(CENTER_X+100);start.setLayoutY(CENTER_Y);
        settings.setLayoutX(CENTER_X+100);settings.setLayoutY(CENTER_Y+90);
        quit.setLayoutX(CENTER_X+100);quit.setLayoutY(CENTER_Y+180);
        
        //Button layout -> Settings
        backToMenuFromSettings.setLayoutX(CENTER_X);
        backToMenuFromSettings.setLayoutY(CENTER_Y);
        
        //Button layout -> Game
        backToMenuFromGame.setLayoutX(WIDTH-100);
        backToMenuFromGame.setLayoutY(HEIGHT-75);
        
        //Background image loading
        try{
            gameBackground.setImage(new Image
                    (getClass().getResource("/resources/game_back.PNG").toString()));
            menuBackground.setImage(new Image
                    (getClass().getResource("/resources/menu_back.PNG").toString()));
        }catch(Exception e){
            System.out.println("Bad background image path");
        }
        
        //Adding notes to panes
        menuRoot.getChildren().addAll(menuBackground,start,settings,quit);
        gameRoot.getChildren().addAll(gameBackground,backToMenuFromGame);
        settingsRoot.getChildren().addAll(backToMenuFromSettings);
        
        //Board initilization/drawing
        b.initBoard(gameRoot);
        
        
        primaryStage.setResizable(false);
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
