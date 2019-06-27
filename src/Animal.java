public class Animal {
    public int age;
    public String gender;
    public int weightInLbs;

    public Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    public void eat() {
        System.out.println("eating ...");
    }

    public void sleeping() {
        System.out.println("sleeping ...");
    }

}
