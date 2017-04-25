
package simplychess;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class Board {
    private final int X_DIMENSION = 8;
    private final int Y_DIMENSION = 8;
    private final Tile[][] board;
    
    //constructs 8x8 board object, contains 2d array of tiles
    public Board(){
        this.board = new Tile[X_DIMENSION][Y_DIMENSION];
       
    }
    
    public void initBoard(Pane p){
        int xCt = 0;
        int yCt = 0;
        
        for (int x = 32;x<32*9;x+=32){
            System.out.println("X Count"+xCt); //Test statement for X Counter for board dimensions
            yCt = 0;
            for (int y = 32;y<32*9;y+=32){
                System.out.println("Y Count"+yCt); //Test statement for Y Counter for board dimensions
                Tile t = new Tile(x,y);
                
                //Setting color of tiles
                boolean evenRow = xCt % 2 == 0;
                boolean evenColumn = yCt % 2 == 0;
                if (evenRow == evenColumn){
                    t.setColor(Color.BURLYWOOD);
                } else {
                    t.setColor(Color.PERU);
                }
                        
                this.board[xCt][yCt] = t;
                p.getChildren().add(t);
                System.out.println("Tile X Coordinate = " + t.getX() + " / Tile Y Coordinate = "+ t.getY());
                yCt++;
            }
            xCt++;
        }
    }
    
    public Tile getTile(int x, int y){
        return this.board[x][y];
    }
}
