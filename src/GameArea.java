import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class GameArea extends JPanel {

    private int gridRows;
    private int gridColumns;
    private int gridCellSize;



    public GameArea(int columns){

        Border blackline = BorderFactory.createLineBorder(Color.black,1,true);

        this.setBounds(100, 50, 100, 100);
        this.setBackground(Color.gray);
        this.setBorder(blackline);
        this.setVisible(true);

        gridColumns = columns;
        gridCellSize = this.getBounds().width / gridColumns;
        gridRows = this.getBounds().height / gridCellSize;

    }



    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < gridColumns; i++){
            g.drawRect(i * gridCellSize,0, gridCellSize, gridCellSize);
        }

    }

}
