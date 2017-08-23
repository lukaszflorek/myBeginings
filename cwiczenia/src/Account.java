public class Account {
    String name, adress;
    double balance;

    public void display() {
        System.out.print(name + " (" + adress + ") has $" + balance);
    }
}
