package animal;

public class Dog extends Animal {

//    protected String name;
//    protected int age;

    protected Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected void bark() {
        System.out.println("Woof!");
    }
}
