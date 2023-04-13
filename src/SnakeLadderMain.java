import java.util.Random;

public class SnakeLadderMain {
    public static void main(String[] args) {
        int playerPosition = 0;
        System.out.println("Snake and Ladder Simulator");
        Random random = new Random();
        int diceNumber = random.nextInt(6) + 1;
        System.out.println(diceNumber);
    }
}
