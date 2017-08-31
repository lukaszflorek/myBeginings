/*
The temperature value is reading from text file and then printed to std_out.
 */

import static java.lang.System.out;
import java.io.*;
import java.util.Scanner;

public class TemperatureMain {
    public static void main(String args[]) throws IOException {
        final String format = "%4.1f %s";
        TemperaturePathFinder path = new TemperaturePathFinder();
        File tempReadings = new File(path.getTempPath());
        Temperature temp = new Temperature();
        Scanner seeker = new Scanner(tempReadings);
        temp.setNumber(seeker.nextDouble());
        //FileReader fileReader = new FileReader(new File(path.getConfigPath()));
        //BufferedReader br = new BufferedReader(fileReader);
        out.println("The temperature is: ");
        out.printf(format, temp.getNumber(), temp.getScale());
        seeker.close();

    }
}
