package javaOopExcercises;

import java.util.Scanner;

public class PersonRegister {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the name and age of the first person: ");
        Person p1 = new Person(scan.nextLine(), scan.nextInt());

        System.out.print("Enter the name and age of the second person: ");
        Person p2 = new Person(scan.nextLine(), scan.nextInt());

        p1.printPerson();
        p2.printPerson();
    }
}
