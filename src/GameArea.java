import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class GameArea extends JPanel {

    private int gridRows;
    private int gridColumns;
    private int gridCellSize;

    private int[][] block = {{1,0},{1,0},{1,1}};



    public GameArea(int columns){

        Border blackline = BorderFactory.createLineBorder(Color.black,1,true);

        this.setBounds(350, 150, 500, 750);
        this.setBackground(Color.gray);
        this.setBorder(blackline);
        this.setVisible(true);

        gridColumns = columns;
        gridCellSize = this.getBounds().width / gridColumns;
        gridRows = this.getBounds().height / gridCellSize;

    }

    private void drawBlock(Graphics g) {
        for(int row = 0; row < block.length; row++){
            for(int col = 0; col < block[0].length; col++){
                if(block[row][col] == 1){
                    g.setColor(Color.red);
                    g.fillRect(col * gridCellSize,row * gridCellSize, gridCellSize, gridCellSize);
                    g.setColor(Color.black);
                    g.drawRect(col * gridCellSize,row * gridCellSize, gridCellSize, gridCellSize);
                }
            }
        }
    }



    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        // Create the Grid
//        for (int i = 0; i < gridRows; i++){
//            for (int j = 0; j < gridColumns; j++){
//                g.drawRect(j * gridCellSize,i * gridCellSize, gridCellSize, gridCellSize);
//            }
//        }

        drawBlock(g);
    }

}
