/**
 * In this class creates a simple window with title
 */
import javax.swing.JFrame;


public class example3 {
    public static void main(String args[]) {
        JFrame myFrame = new JFrame();
        String frameTitle = "New Frame";

        myFrame.setTitle(frameTitle);
        myFrame.setSize(300, 200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
