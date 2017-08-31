import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TemperatureFrame extends JFrame {
    public TemperatureFrame() throws IOException {
        Scanner file = new Scanner(new File("Temperature/temp_table"));
        for (int n=1; n <=7;n++) {
            String day = file.nextLine();
            Temperature temperature = new Temperature(file.nextDouble());
            file.nextLine();
            this.addTemperatureToFrame(temperature, day);
        }
        this.setTitle("Temperatures in this Week");
        this.setLayout(new GridLayout(7,2));
        this.setDefaultCloseOperation(3);
        this.pack();
        this.setVisible(true);
    }
    void addTemperatureToFrame(Temperature temperature, String day) {
        this.add(new JFrame(day));
        this.add(new JLabel(String.valueOf(temperature.getNumber())));
    }
}
