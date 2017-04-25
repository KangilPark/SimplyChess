
package simplychess;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Tyler Jorgensen
 */
public class Tile extends Rectangle {
    //class attributes
    private final int WIDTH = 64;
    private final int HEIGHT = 64;

    
    //Constructor for tile
    public Tile(int x, int y){
        this.setX(x); this.setY(y);
        this.setHeight(HEIGHT);this.setWidth(WIDTH);
        this.setLayoutX(x);this.setLayoutY(y);
    }
    
    public void setColor(Color c){
        this.setFill(c);
    }
}
