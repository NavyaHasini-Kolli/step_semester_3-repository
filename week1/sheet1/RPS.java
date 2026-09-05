import java.util.Scanner;
import java.util.Random;

public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] moves = {"Rock", "Paper", "Scissors"};

        System.out.print("Enter number of rounds: ");
        int rounds = sc.nextInt();

        int wins = 0;
        int losses = 0;
        int draws = 0;

        for (int i = 1; i <= rounds; i++) {
            System.out.print("Round " + i + " - Enter your move: ");
            String player = sc.next();

            int randomIndex = rand.nextInt(3);
            String computer = moves[randomIndex];

            String result;

            if (player.equalsIgnoreCase(computer)) {
                result = "Draw";
                draws = draws + 1;
            } else if (player.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissors")) {
                result = "Player Wins";
                wins = wins + 1;
            } else if (player.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Paper")) {
                result = "Player Wins";
                wins = wins + 1;
            } else if (player.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")) {
                result = "Player Wins";
                wins = wins + 1;
            } else {
                result = "Computer Wins";
                losses = losses + 1;
            }

            System.out.println("Computer chose: " + computer + " -> " + result);
        }

        double winPercent = (wins * 100.0) / rounds;

        System.out.println("Wins: " + wins + " | Losses: " + losses + " | Draws: " + draws + " | Win % = " + winPercent);
    }
}