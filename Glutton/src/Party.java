import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.out;

public class Party {
    private static int numberOfTests;
    public Party() throws FileNotFoundException {
        Scanner file = new Scanner(new File("input2"));
        setNumberOfTests(file);
        Greedy.setTotalOfGreedy(file.nextInt());
        Cakes.setHowManyInTheBox(file.nextInt());
        runTests(file);
        file.close();
    }
    public static void setNumberOfTests(Scanner file) throws FileNotFoundException {
        numberOfTests = file.nextInt();

    }
    public void runTests(Scanner file) throws FileNotFoundException {
        int i=0;
        while (i <= getNumberOfTests()) {
            createData(file);
            showResults();
        }
    }
    public void createData(Scanner file) throws FileNotFoundException {
        Greedy greedy[] = new Greedy[Greedy.getTotalOfGreedy()];
        int i =0;
        while (i <= Greedy.getTotalOfGreedy()) {
            greedy[i] = new Greedy();
            greedy[i].setEatingTime(file.nextInt());
            greedy[i].setCakePerDay(86400/greedy[i].getEatingTime());
            Greedy.addTotalOfCakesPerDay(greedy[i].getCakePerDay());
        }
        Cakes.setHowManyBoxesNeeded(Greedy.getTotalOfCakesPerDay()/Cakes.getHowManyInTheBox());

    }
    public int getNumberOfTests() {
        return numberOfTests;
    }
    public void showResults() {

        out.println(Cakes.getHowManyBoxesNeeded());
    }
}
