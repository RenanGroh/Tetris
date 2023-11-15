package tetris.blocks;

public class Tetrimino {

    private int[][] shape;
    private int x, y; // Position on the grid

    // Constructor and methods for different shapes
    public static Tetrimino createLineShape() {
        // Return an instance of Tetrimino with the line shape
        return null;
    }

    // Method to rotate the Tetrimino
    public void rotate() {
        // Rotate the shape
    }

    // Methods to move the Tetrimino
    public void moveDown() { y++; }
    public void moveLeft() { x--; }
    public void moveRight() { x++; }

    // Other utility methods

}
