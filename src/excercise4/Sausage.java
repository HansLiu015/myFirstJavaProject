package excercise4;

public class Sausage extends Meal {

    public Sausage() {
        price += 15;
    }

    public void serve() {
        System.out.println("In a bun");
    }

    public void kindOfFood() {
        System.out.println("Sausage");
    }

    public void addKetchup() {
        System.out.println("Ketchup added!");
        price += 2;
    }
}
