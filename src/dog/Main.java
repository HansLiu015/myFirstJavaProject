package dog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the name of the dog: ");
        String name = scan.nextLine();

        System.out.print("Enter the dog's breed: ");
        String breed = scan.nextLine();

        Dog dog1 = new Dog(name, breed);

        System.out.print("\n" + dog1.getName() + ": ");
        dog1.bark();

        System.out.print("How old is the dog? ");
        dog1.setAge(scan.nextInt());

        System.out.println("\n" + dog1.getName() + "'s human age equivalent is: " + dog1.getHumanAge() + " years old.");
    }
}
