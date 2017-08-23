import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class UseAccount {
    public static void main(String args[]) {
        Account myAccount = new Account();
        Account momsAccount = new Account();
        Scanner keyboard = new Scanner(in);

        out.println("Enter your account balance:");
        myAccount.balance = keyboard.nextDouble();
        myAccount.adress = "Warszawa";
        myAccount.name = "Jan Kowalski";

        momsAccount.name = "Michalina Kowalska";
        momsAccount.adress ="Lublin";
        momsAccount.balance = 15944.00;

        double difference = momsAccount.balance - myAccount.balance;

        out.println("You've got " + myAccount.balance + " and your mom's got " + momsAccount.balance);
        out.println("The difference is: " + difference);
    }
}
