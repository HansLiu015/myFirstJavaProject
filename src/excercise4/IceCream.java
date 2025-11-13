package excercise4;

public class IceCream extends Meal {

    public IceCream() {
        price += 20;
    }

    public void serve() {
        System.out.println("In a cone");
    }

    public void kindOfFood() {
        System.out.println("Ice cream");
    }

    public void addSprinkles() {
        System.out.println("Sprinkles added!");
        price += 5;
    }
}
