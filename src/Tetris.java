import javax.swing.*;

public class Tetris {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GameForm gameForm = new GameForm();
                gameForm.setTitle("Tetris");
                gameForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gameForm.setSize(1200, 1000); // Ou o tamanho que preferir
                gameForm.setVisible(true);
            }
        });
    }
}