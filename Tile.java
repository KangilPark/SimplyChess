
package simplychess;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Tyler Jorgensen
 */
public class Tile {
    //class attributes
    private final Rectangle r;
    private final int x;
    private final int y;
    private final Color color; //possibly bool/string? dark/light
    
    //Constructor for tile
    public Tile(int x, int y, Color color){
        this.r = new Rectangle();
        this.x = x;
        this.y = y;
        this.color = color; 
    }
    
    /*get methods for attributes*/
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    /*end get methods*/

}
