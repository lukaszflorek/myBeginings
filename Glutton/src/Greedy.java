    class Greedy {
    private static int totalOfGreedy;
    private static int totalOfCakesPerDay;
    private int eatingTime;
    private int cakePerDay;

    int getCakePerDay() {
        return cakePerDay;
    }
    void setCakePerDay(int cakePerDay) {
        this.cakePerDay = cakePerDay;
    }
    void setEatingTime(int eatingTime) {
        this.eatingTime = eatingTime;
    }
    int getEatingTime() {
        return eatingTime;
    }
    static int getTotalOfGreedy() {
        return totalOfGreedy;
    }
    static void setTotalOfGreedy(int totalOfGreedy) {
        Greedy.totalOfGreedy = totalOfGreedy;
    }
    static int getTotalOfCakesPerDay() {
        return totalOfCakesPerDay;
    }
    static void setTotalOfCakesPerDay(int totalOfCakesPerDay) {
        Greedy.totalOfCakesPerDay = totalOfCakesPerDay;
    }
    static void addTotalOfCakesPerDay(int totalOfCakesPerDayAdd) {
        Greedy.totalOfCakesPerDay += totalOfCakesPerDayAdd;
    }
}
