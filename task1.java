import java.util.*;
public class SimpleGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        while (true) {
            int number = rand.nextInt(100) + 1; // 1 to 100
            int attempts = 5;
            System.out.println("\nGuess the number between 1 and 100. You have " + attempts + " attempts.");
            while (attempts-- > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                if (guess == number) {
                    System.out.println("Correct!");
                    score++;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }
            }
            System.out.println("The number was: " + number);
            System.out.print("Play again? (yes/no): ");
            String again = sc.next();
            if (!again.equalsIgnoreCase("yes")) break;
        }
        System.out.println("Your score: " + score);
        sc.close();
    }
}
