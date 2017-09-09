import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.out;

    class Party {
    private static int numberOfTests;
    Party() throws FileNotFoundException {
        Scanner file = new Scanner(new File("input"));
        checkInput(file);
        setNumberOfTests(file);
        runTests(file);
        file.close();
    }
    /**
     * Checks if input file has correct data in.
     * NOT READY YET
     */
    private static void checkInput(Scanner file) {
       boolean inputIsComplete= true;
//       checking method body
       if (!inputIsComplete) {
           out.println("Bad input file");
           file.close();
           System.exit(1);
       }
    }
    /**
     * Sets the test set number, which is the first int in input file.
     */
    private static void setNumberOfTests(Scanner file) throws FileNotFoundException {
        numberOfTests = file.nextInt();
    }
    /**
     * Gets through sets in file.
     * Sets number of greedy, then amount of cakes in a box.
     */
    private void runTests(Scanner file) throws FileNotFoundException {
        int numberOfTests = getNumberOfTests();
        for (int i=0; i < numberOfTests; i++) {
            Greedy.setTotalOfGreedy(file.nextInt());
            Cakes.setHowManyInTheBox(file.nextInt());
            createData(file);
            showResults();
            Greedy.setTotalOfCakesPerDay(0);
        }
    }
    /**
     * Creates Greedy object array and fills the data.
     * For loop creates greedy objects in array,
     * sets its eating time
     * and cake per day value (which is a number of second in a day divided by eating time).
     * Finally, computes output data - how many boxes needed in particular set test.
     */
    private void createData(Scanner file) throws FileNotFoundException {
        int totalOfGreedy = Greedy.getTotalOfGreedy();
        Greedy greedy[] = new Greedy[totalOfGreedy];
        for (int i=0; i < totalOfGreedy; i++) {
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
    private int getNumberOfTests() {
        return numberOfTests;
    }
    private void showResults() {
        out.println(Cakes.getHowManyBoxesNeeded());
    }
}
