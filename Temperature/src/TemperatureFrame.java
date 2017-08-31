import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TemperatureFrame extends JFrame {
    public TemperatureFrame() throws IOException {
        TemperaturePathFinder path = new TemperaturePathFinder();
        Scanner file = new Scanner(new File(path.getTempPath()));
        for (int n=1; n <=7;n++) {
            String day = file.nextLine();
            Temperature temperature = new Temperature(file.nextDouble());
            file.nextLine();
            this.addTemperatureToFrame(temperature, day);
        }
        this.setTitle("Temperatures in this Week");
        this.setLayout(new GridLayout(7,2,5,0));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(400, 250);
        this.setVisible(true);
    }
    void addTemperatureToFrame(Temperature temperature, String day) {
        this.add(new JLabel(day));
        this.add(new JLabel(String.valueOf(temperature.getNumber())));
    }
}
