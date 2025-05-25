package javaOopExcercises;

public class Person {

    private String name;
    private int age;

    public Person(String getName, int getAge) {
        this.name = getName;
        this.age = getAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printPerson() {
        System.out.println("The name of the person is " + name);
        System.out.print(" and their age is " + age);
    }
}
