public class Account {
    private String name, adress;
    private double balance;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAdress(String a) {
        adress = a;
    }

    public String getAdress() {
        return adress;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.print(name + " (" + adress + ") has $" + balance);
    }
}
