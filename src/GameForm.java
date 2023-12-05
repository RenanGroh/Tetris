import javax.swing.*;
import java.awt.*;

public class GameForm extends JFrame {

    private GameArea ga;

    public GameForm() {

        ga = (GameArea) this.add(new GameArea(10));
        this.add(ga);
        this.setLayout(null);
        this.setResizable(false);

        startGame();
    }

    public void startGame(){
        new GameThread(ga).start();
    }

}
