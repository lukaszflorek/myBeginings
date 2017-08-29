/*
The temperature value is reading from temp_read text file and then printed to std_out.
 */

import static java.lang.System.out;
import java.io.*;
import java.util.Scanner;

public class TemperatureMain {
    public static void main(String args[]) throws FileNotFoundException {
        File tempReadings = new File("Temperature/temp_read");
        Temperature temp = new Temperature();
        Scanner seeker = new Scanner(tempReadings);
        temp.setNumber(seeker.nextDouble());
        out.println("The temperature is: " + temp.getNumber() + " " + temp.getScale());
    }
}
