import java.util.Scanner;
import java.util.Random;
import static java.lang.System.in;
import static java.lang.System.out;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);
        int guessAttempts = 1;
        int randomNumber = new Random().nextInt(6) + 1;
        out.println("Welcome to 'Guess the number' game.");
        out.println("Guess a number (1-6)");
        int inputNumber = keyboard.nextInt();

        while (randomNumber != inputNumber) {
            out.println("Sorry, try again");
            out.println("Guess a number (1-6)");
            inputNumber = keyboard.nextInt();
            guessAttempts ++;
        }
        out.println();
        out.print("Congratulations! You win after " + guessAttempts + " attempt(s)" );
        keyboard.close();
    }
}
