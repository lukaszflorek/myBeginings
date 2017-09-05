public class Greedy {
    private static int totalOfGreedy;
    private static int totalOfCakesPerDay;
    private int eatingTime;
    private int cakePerDay;

    public int getCakePerDay() {
        return cakePerDay;
    }
    public void setCakePerDay(int cakePerDay) {
        this.cakePerDay = cakePerDay;
    }
    public void setEatingTime(int eatingTime) {
        this.eatingTime = eatingTime;
    }
    public int getEatingTime() {
        return eatingTime;
    }
    public static int getTotalOfGreedy() {
        return totalOfGreedy;
    }
    public static void setTotalOfGreedy(int totalOfGreedy) {
        Greedy.totalOfGreedy = totalOfGreedy;
    }
    public static int getTotalOfCakesPerDay() {
        return totalOfCakesPerDay;
    }
    public static void addTotalOfCakesPerDay(int totalOfCakesPerDay) {
        Greedy.totalOfCakesPerDay += totalOfCakesPerDay;
    }
}
