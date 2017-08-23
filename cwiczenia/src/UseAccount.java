import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class UseAccount {
    public static void main(String args[]) {
        Account myAccount = new Account();
        Account momsAccount = new Account();
        Scanner keyboard = new Scanner(in);

        out.println("Enter your account balance:");
        myAccount.setBalance(keyboard.nextDouble());
        myAccount.setAdress("Warszawa");
        myAccount.setName("Jan Kowalski");

        momsAccount.setName("Michalina Kowalska");
        momsAccount.setAdress("Lublin");
        momsAccount.setBalance(15944.00);

        double difference = momsAccount.getBalance() - myAccount.getBalance();

        out.println("You've got " + myAccount.getBalance() + " and your mom's got " + momsAccount.getBalance());
        out.println("The difference is: " + difference);
        myAccount.display();
        out.println();
        momsAccount.display();

    }
}
