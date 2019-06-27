package class_object_constructor_Application_Run_Time;

public class ZOO {

    public static void main(String[] args) {
        Animal animal = new Animal(12, "M", 23);
        animal.eat();

        Bird bird = new Bird();
        bird.fly();
    }
}
