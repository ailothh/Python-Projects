import java.util.Random;
import java.util.Scanner;

public class DiceRollSim {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Dice Roll Simulator!");
        System.out.println("-----------------------------------");

        while (true) {
            //Declare Random class
            Random rand = new Random();
            int die1 = rand.nextInt(1, 11);
            int die2 = rand.nextInt(1, 11);
            int total = die1 + die2;
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Total sum: " + total);
            // If sum equals 7 or 11 result equals winner
            if (total == 7 || total == 11) {
                System.out.println("You win!");
            } // Sum of dice roll equals 2, 3, or 12 user is loser
            else if (total == 2 || total == 3 || total == 12) {
                System.out.println("You lose!");
            }
            // Neither winner or loser tell user to roll again
            else {
                System.out.println("Roll again!");
            }
            System.out.println("");
            // Prompt user if they wish to roll again
            System.out.println("Would you like to roll again? (yes/no):");
            String userInput = scanner.nextLine(); // Read user input
            // If user inputs no while loop ends
            if (userInput.equals("no")) {
                break;
            }
        } // End of while loop
        scanner.close();

    }

}
