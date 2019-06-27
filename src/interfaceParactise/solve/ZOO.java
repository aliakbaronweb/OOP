package interfaceParactise.solve;

public class ZOO {

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow(3, "F", 10);
        sparrow.fly();

        Chicken chicken = new Chicken(1, "M", 7);
        chicken.fly(); // solve the problem
    }
}
