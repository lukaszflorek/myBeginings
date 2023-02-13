  class Human{
    private int age;
    private int weight;
    private boolean sex;
    //  0 for Male; 0 or Female
    private String name;
    private int height;

      public Human(int age) {
          setAge();
      }

      private int getAge() {
        return this.age;
    }

    private  int getWeight(){
        return this.weight;
    }
    private boolean isMale(){
        return this.sex;
    }
    private String getName(){
        return this.name;
    }
    private int getHeight(){
        return this.height;
    }
    public int setAge(){
       return age = this.age;
    }
}
