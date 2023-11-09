import java.util.Scanner;
import java.util.Random;

public class JackEnPoy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Let's play Rock, Paper, Scissors!");
            String userChoice = getUserChoice(scanner);
            String computerChoice = getComputerChoice(random);
            determineWinner(userChoice, computerChoice);

            System.out.print("Play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Thank you for playing Rock, Paper, Scissors!");
    }

    public static String getUserChoice(Scanner scanner) {
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String userChoice = scanner.next().toLowerCase();

        if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
            return userChoice;
        } else {
            System.out.println("Invalid choice. Please choose 'rock', 'paper', or 'scissors'.");
            return getUserChoice(scanner);
        }
    }

    public static String getComputerChoice(Random random) {
        int computerChoice = random.nextInt(3); // 0 for rock, 1 for paper, 2 for scissors
        String[] choices = {"rock", "paper", "scissors"};
        return choices[computerChoice];
    }

    public static void determineWinner(String userChoice, String computerChoice) {
        System.out.println("Computer's choice: " + computerChoice);
        System.out.println("Your choice: " + userChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
            (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
