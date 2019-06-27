package inheritance;

public class ZOO {

    public static void main(String[] args) {
        Animal animal = new Animal(12, "M", 23);
        animal.eat();

        Bird bird = new Bird(3, "F", 10);
        bird.fly();
    }
}
