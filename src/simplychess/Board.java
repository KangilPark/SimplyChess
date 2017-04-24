
package simplychess;


public class Board {
    private final int WIDTH = 7;
    private final int HEIGHT = 7;
    private final Tile[][] board;
    
    //constructs 8x8 board object, contains 2d array of tiles
    public Board(){
        this.board = new Tile[WIDTH][HEIGHT];
    }
    
    public void initBoard(){
        
    }
}
