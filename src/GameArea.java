import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class GameArea extends JPanel {

    private int gridRows;
    private int gridColumns;
    private int gridCellSize;

    private int test;

    private Block block;

    public GameArea(int columns){

        Border blackline = BorderFactory.createLineBorder(Color.black,1,true);

        this.setBounds(350, 150, 500, 750);
        this.setBackground(Color.gray);
        this.setBorder(blackline);
        this.setVisible(true);

        gridColumns = columns;
        gridCellSize = this.getBounds().width / gridColumns;
        gridRows = this.getBounds().height / gridCellSize;

        spawnBlock();
    }


    public void spawnBlock(){
        // block in the L shape
        block = new Block(new int[][]{ {1,0}, {1,0}, {1,1} }, Color.blue);

        block.spwan(gridColumns);
    }

    public void moveBlockDown(){

        if ( checkBottom() == false) return;
        block.moveDown();
        repaint();

    }

    private boolean checkBottom(){

        if (block.getBottomEdge() == gridRows) {
            return false;
        }
        return true;
    }

    private void drawBlock(Graphics g) {

        int h = block.getHeight();
        int w = block.getWidth();
        Color c = block.getColor();
        int[][] shape = block.getShape();

        for(int row = 0; row < h; row++){
            for(int col = 0; col < w; col++){
                if(shape[row][col] == 1){

                    int x = (block.getX() + col) * gridCellSize;
                    int y = (block.getY() + row) * gridCellSize;

                    g.setColor(c);
                    g.fillRect(x,y, gridCellSize, gridCellSize);
                    g.setColor(Color.black);
                    g.drawRect(x,y, gridCellSize, gridCellSize);
                }
            }
        }
    }



    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        // show the Grid
//        for (int i = 0; i < gridRows; i++){
//            for (int j = 0; j < gridColumns; j++){
//                g.drawRect(j * gridCellSize,i * gridCellSize, gridCellSize, gridCellSize);
//            }
//        }

        drawBlock(g);
    }

}
