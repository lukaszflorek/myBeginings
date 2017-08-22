/*
  Swich-case conditions with String
 */
import java.util.Scanner;

import static java.lang.System.*;

public class example4 {
    public static void main (String args[]) {
        Scanner keyboard = new Scanner(in);
        out.println("Choose which verse:");
        String verse = keyboard.next();

        switch (verse.toUpperCase()) {
            case "ONE":
                out.println("This is verse one.");
            break;
            case "TWO":
                out.println("This is verse two.");
            break;
            default:
                out.println("That's all.");
        }
    }
}
