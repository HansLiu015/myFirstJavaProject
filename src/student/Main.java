package student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the name of the student: ");
        String name = scan.nextLine();

        System.out.print("What grade is " + name + " in? ");
        int grade = scan.nextInt();

        Student stud1 = new Student(name, grade);

        System.out.print(name + " is in ");
        stud1.printGradeLevel();

        stud1.promote();

        System.out.print("Next year, " + name + " will promote to grade " + stud1.getGrade());
        System.out.print(", and then they will be in ");
        stud1.printGradeLevel();
    }
}
