package tetris.game;

public class Grid {

    private static final int WIDTH = 10;
    private static final int HEIGHT = 20;
    private int[][] grid;

    public Grid() {
        grid = new int[HEIGHT][WIDTH];
        // Initialize grid with empty cells
        for (int row = 0; row < HEIGHT; row++) {
            for (int col = 0; col < WIDTH; col++) {
                grid[row][col] = 0; // Assuming 0 represents an empty cell
            }
        }
    }

}
