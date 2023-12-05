public class GameThread extends Thread{

    private  GameArea ga;

    public GameThread(GameArea ga) {
        this.ga = ga;
    }

    public void run(){

        while (true){
            try {
                ga.moveBlockDown();

                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
