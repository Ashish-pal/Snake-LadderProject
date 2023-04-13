import java.util.Random;

public class SnakeLadderMain {
    public static void main(String[] args) {
        int playerPosition = 0;
        System.out.println("Snake and Ladder Simulator");
        Random random = new Random();
        int diceNumber = random.nextInt(6) + 1;
        System.out.println(diceNumber);
        int option = random.nextInt(3);
        System.out.print("You got ");
        switch (option) {
            case 0:
                System.out.println("No Play.");
                break;
            case 1:
                System.out.println("a Ladder.");
                break;
            case 2:
                System.out.println("a Snake.");
                break;
        }
    }
}