package shapes;

import java.util.Scanner;

public class ShapesMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a width and a height(m): ");
        Rectangle rec1 = new Rectangle(scan.nextInt(), scan.nextInt());

        int area = rec1.calculateArea();
        System.out.println("Area of rectangle: " + area + " m2");

        int perimeter = rec1.calculatePerimeter();
        System.out.println("Perimeter of rectangle: " + perimeter + " m");


        for (int i = 0; i < rec1.getHeight(); i++) {
            for (int j = 0; j < rec1.getWidth(); j++) {
                System.out.print("|‾‾");
            }
            System.out.println("|");
        }
        for (int i = 0; i < rec1.getWidth(); i++) {
            System.out.print(" ‾‾");
        }

        if (rec1.isSquare()) {
            System.out.println("\nIt's a square!");
        }

        System.out.print("Enter a radius(m): ");
        Circle cir1 = new Circle(scan.nextDouble());

        double area2 = cir1.calculateArea();
        System.out.println("Area of circle: " + area2 + " m2");

        double circumference = cir1.calculateCircumference();
        System.out.println("Circumference of circle: " + circumference + " m");

        System.out.print("Enter another radius(m): ");
        Circle cir2 = new Circle(scan.nextDouble());

        if (cir1.isBiggerThan(cir2)) {
            System.out.println("The first circle is bigger!");
        }
    }
}
