package animal;

public class Frog extends Animal  {

    public Frog(String name, int age) {
        super.name = name;
        super.age = age;
    }

    protected String getName() {
        return name;
    }

    protected void jump() {
        System.out.println("Hop!");
    }
}
