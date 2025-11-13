package animal;

import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        name = scan.nextLine();
        age = Integer.parseInt(scan.nextLine());

        Frog f1 = new Frog(name, age);

        Dog d1 = new Dog(name, age);

        System.out.println(f1.getName());
        f1.jump();

        System.out.println(d1.getName());
        d1.bark();

        scan.close();
    }
}
