import java.awt.*;

public class Block {

    private int[][] shape;
    private Color color;
    // This variables are the offset of the left line of the game screen
    private int x, y;


   //region Constructor
    public Block(int[][] shape, Color color) {
        this.shape = shape;
        this.color = color;

    }
    //endregion

    public void spwan(int gridWidth){
        y = 0 - getHeight();

        x = (gridWidth - getWidth()) / 2 ;
    }

    //region Getters
    public int[][] getShape() { return shape; }
    public Color getColor() { return color; }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getHeight(){ return shape.length; }
    public int getWidth(){ return shape[0].length; }
    //endregion

    public void moveDown(){ y++; }
    public void moveLeft(){ x--; }
    public void moveRight(){ x++; }

    public int getBottomEdge() { return y + getHeight(); }

}
