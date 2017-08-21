/**
 * This exercise messes with System.out.print
 * and simple variable math.
 */
public class example1 {
    public static void main(String args[]) {
        System.out.println("This is an example of text");
        int amountOfMoney = 12;
        System.out.print("You've got: ");
        System.out.print(amountOfMoney);
        System.out.print(" $ left.");
        amountOfMoney = amountOfMoney + 10000;
        System.out.println();
        System.out.print("And now you've got: ");
        System.out.print(amountOfMoney);
        System.out.print(" $.");

    }
}
