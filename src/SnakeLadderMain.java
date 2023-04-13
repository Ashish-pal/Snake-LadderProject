import java.util.Random;

public class SnakeLadderMain {
    static final int BOARD_SIZE = 100;
    static final int[] SNAKES = {14, 19, 47, 49, 52, 70, 89, 93, 95, 98};
    static final int[] LADDERS = {5, 9, 19, 28, 40, 51, 63, 71, 80};

    static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
    static int getNextPosition(int currentPosition, int diceValue) {
        int nextPosition = currentPosition + diceValue;
        if (nextPosition > BOARD_SIZE) {
            return currentPosition;
        }
        for (int i = 0; i < SNAKES.length; i++) {
            if (nextPosition == SNAKES[i]) {
                return i + 1;
            }
        }
        for (int i = 0; i < LADDERS.length; i++) {
            if (nextPosition == LADDERS[i]) {
                return i + 1;
            }
        }
        return nextPosition;
    }
    static int getOption() {
        Random random = new Random();
        return random.nextInt(3);
    }
    static int getOptionResult(int option, int currentPosition, int diceValue) {
        switch (option) {
            case 0:
                return currentPosition;
            case 1:
                return getNextPosition(currentPosition + diceValue, 0);
            case 2:
                return getNextPosition(currentPosition - diceValue, 0);
            default:
                return currentPosition;
        }
    }
    public static void main(String[] args) {
        boolean isGameOver = false;
        int diceRollCount = 0;
        int playerPosition = 0;
        System.out.println("Welcome to the game of Snakes and Ladders!");
        while (!isGameOver) {
            int diceValue = rollDice();
            diceRollCount++;
            System.out.println("You rolled a " + diceValue);
            int option = getOption();
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
            playerPosition = getOptionResult(option, playerPosition, diceValue);
            if (playerPosition < 0) {
                playerPosition = 0;
            }
            System.out.println("You are now at position " + playerPosition);
            if (playerPosition == BOARD_SIZE) {
                isGameOver = true;
                System.out.println("Congratulations, you won!");
            }
        }
    }
}