import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.out;

public class Party {
    private static int numberOfTests;
    public Party() throws FileNotFoundException {
        setNumberOfTests();
        Scanner file = new Scanner(new File("input2"));
        Greedy.setTotalOfGreedy(file.nextInt());
        Cakes.setHowManyInTheBox(file.nextInt());
        file.close();
        runTests();
    }
    public static void setNumberOfTests() throws FileNotFoundException {
        Scanner file = new Scanner(new File("input2"));
        numberOfTests = file.nextInt();
        file.close();
    }
    public void runTests() throws FileNotFoundException {
        int i=0;
        while (i <= getNumberOfTests()) {
            createData();
            showResults();
        }
    }
    public void createData() throws FileNotFoundException {

        Greedy greedy[] = new Greedy[Greedy.getTotalOfGreedy()];
        int i =0;
        while (i <= Greedy.getTotalOfGreedy()) {
            Scanner file = new Scanner(new File("input2"));
            greedy[i] = new Greedy();
            greedy[i].setEatingTime(file.nextInt());
            greedy[i].setCakePerDay(86400/greedy[i].getEatingTime());
            Greedy.addTotalOfCakesPerDay(greedy[i].getCakePerDay());
            file.close();
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
