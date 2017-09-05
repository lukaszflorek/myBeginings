import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class Party {
    private static int numberOfTests;
        public Party() throws FileNotFoundException {
        setNumberOfTests();
        runTests();
    }
    public void setNumberOfTests() throws FileNotFoundException {
        Scanner file = new Scanner(new File("input"));
        this.numberOfTests = file.nextInt();
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
        Scanner file = new Scanner(new File("input"));
        Greedy.setTotalOfGreedy(file.nextInt());
        Greedy greedy[] = new Greedy[Greedy.getTotalOfGreedy()];
        Cakes.setHowManyInTheBox(file.nextInt());
        int i =0;
        while (i <= Greedy.getTotalOfGreedy()) {
            greedy[i] = new Greedy();
            greedy[i].setEatingTime(file.nextInt());
            greedy[i].setCakePerDay(86400/greedy[i].getEatingTime());
            Greedy.addTotalOfCakesPerDay(greedy[i].getCakePerDay());
        }
        Cakes.setHowManyBoxesNeeded(Greedy.getTotalOfCakesPerDay()/Cakes.getHowManyInTheBox());
        file.close();


    }
    public int getNumberOfTests() {
        return numberOfTests;
    }
    public void showResults() {

        out.println(Cakes.getHowManyBoxesNeeded());
    }
}
