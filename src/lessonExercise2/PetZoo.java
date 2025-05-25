package lessonExercise2;

import java.util.Scanner;

public class PetZoo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the name of a dog: ");
        Pet dog = new Pet(scan.nextLine());

        System.out.print("Enter the name of a cat: ");
        Pet cat = new Pet(scan.nextLine());

        System.out.print("Enter the name of a capybara: ");
        Pet capybara = new Pet(scan.nextLine());

        //dog.printName();
        //cat.printName();
        //capybara.printName();

        String dogName = dog.getName();
        String catName = cat.getName();
        String capybaraName = capybara.getName();

        for (int i = 0; i < 2; i++) {
            System.out.println(dogName);
            System.out.println(catName);
            System.out.println(capybaraName);
        }

    }
}
