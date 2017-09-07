import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.out;

public class Party {
    private static int numberOfTests;
    public Party() throws FileNotFoundException {
        Scanner file = new Scanner(new File("input"));
        checkInput(file);
        setNumberOfTests(file);
        runTests(file);
        file.close();
    }
    public static void checkInput(Scanner file) {
       boolean inputIsComplete;
//       checking method
       if (inputIsComplete = false) {
           out.println("Bad input file");
           System.exit(1);
       }
    }
    public static void setNumberOfTests(Scanner file) throws FileNotFoundException {
        numberOfTests = file.nextInt();

    }
    public void runTests(Scanner file) throws FileNotFoundException {
        int i;
        int numberOfTests = getNumberOfTests();
        for (i=0; i < numberOfTests; i++) {
            Greedy.setTotalOfGreedy(file.nextInt());
            Cakes.setHowManyInTheBox(file.nextInt());
            createData(file);
            showResults();
            Greedy.setTotalOfCakesPerDay(0);
        }
    }
    public void createData(Scanner file) throws FileNotFoundException {
        int totalOfGreedy = Greedy.getTotalOfGreedy();
        Greedy greedy[] = new Greedy[totalOfGreedy];
        int i;
        for (i=0; i < totalOfGreedy; i++) {
            greedy[i] = new Greedy();
            greedy[i].setEatingTime(file.nextInt());
            greedy[i].setCakePerDay(86400/greedy[i].getEatingTime());
            Greedy.addTotalOfCakesPerDay(greedy[i].getCakePerDay());
        }
        if (Greedy.getTotalOfCakesPerDay()%Cakes.getHowManyInTheBox() >0) {
            Cakes.setHowManyBoxesNeeded((Greedy.getTotalOfCakesPerDay() / Cakes.getHowManyInTheBox())+1);
        } else {
            Cakes.setHowManyBoxesNeeded(Greedy.getTotalOfCakesPerDay() / Cakes.getHowManyInTheBox());
        }
    }
    public int getNumberOfTests() {
        return numberOfTests;
    }
    public void showResults() {

        out.println(Cakes.getHowManyBoxesNeeded());
    }
}
