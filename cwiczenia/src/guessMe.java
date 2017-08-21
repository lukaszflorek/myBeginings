import javax.swing.JOptionPane;

public class guessMe {
    public static void main(String args[]) {
        String welcome = "Welcome to Guess Me Game.";
        String userName = JOptionPane.showInputDialog(welcome + " Enter your name:");
        String loose = userName + ", you are an idiot. Game over.";
        String win = userName + ", you are so smart, you've won!";
        String first = "2 and 2 is equal to?";
        String second = "Is it true that 2 times 2 equals 4?";
        if (userName != null) {
            String answer1 = JOptionPane.showInputDialog(first);
            if (answer1.equals("4")) {
                String answer2 = JOptionPane.showInputDialog(second);
                if (answer2.equals("true") || answer2.equals("yes")) {              //TODO NullPointerException
                    JOptionPane.showMessageDialog(null, win);
                } else {
                    JOptionPane.showMessageDialog(null, loose);
                }
            } else {
                JOptionPane.showMessageDialog(null, loose);
        }
        } else {
                JOptionPane.showMessageDialog(null, "Game over");
            }
    }
}
