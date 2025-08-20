import java.util.Random;
import java.util.Scanner;

public class New2 {
    public static void main(String[] args) {
        String[] game = {"Rock", "Papers", "Scissors"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Ask user for input
            System.out.print("\nEnter your choice (Rock, Papers, Scissors) or 'q' to quit: ");
            String choice = scanner.nextLine();

            // Exit condition
            if (choice.equalsIgnoreCase("q")) {
                System.out.println("Thanks for playing! Goodbye");
                break;
            }

            // Generate computer choice
            int randomIndex = random.nextInt(game.length);
            String randomGuess = game[randomIndex];

            // Show choices
            System.out.println("You chose: " + choice);
            System.out.println("Computer chose: " + randomGuess);

            // Determine winner
            if(choice.equals("Rock") && randomGuess.equals("Scissors")) {
                System.out.println("You Won");
            }
            else if(choice.equals("Scissors") && randomGuess.equals("Papers")) {
                System.out.println("You Won");
            }
            else if(choice.equals("Papers") && randomGuess.equals("Rock")) {
                System.out.println("You Won");
            }
            else if(choice.equals(randomGuess)) {
                System.out.println("It's a Draw");
            }
            else {
                System.out.println("You Lose");
            }
        }

        scanner.close();
    }
}
