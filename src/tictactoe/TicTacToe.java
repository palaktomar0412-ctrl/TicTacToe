import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {

        Random rand = new Random();
        int toss = rand.nextInt(2);

        if (toss == 0) {
            System.out.println("Player starts with X- updated");
        } else {
            System.out.println("Computer starts with X");
        }
    }
}