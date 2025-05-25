package lessonExercise2;

public class Pet {

    private String name;    //attribut

    public Pet(String petName) {    //konstruktor
        name = petName;
    }

    public void printName() {
        System.out.println("The pet's name is: " + name);
    }

    public String getName() {
        return name;
    }

}
