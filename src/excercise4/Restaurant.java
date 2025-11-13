package excercise4;

import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount;
        int totalPrice = 0;
        boolean available = false;
        Meal[] meals;

//        Sausage s = new Sausage();
//        s.order();
//        s.serve();
//
//        Meal m = new Sausage();
//        m.order();
//        m.serve();

        while (true) {
            try {
                System.out.print("How many orders would you like to make? ");
                amount = Integer.parseInt(scan.nextLine());
                meals = new Meal[amount];
                break;
            } catch (Exception e) {
                System.out.println("Please enter a positive integer!");
            }
        }

        while (true) {
            try {
                System.out.println("What would you like to order?");
                System.out.println("[1] Sausage");
                System.out.println("[2] Ice cream");
                for (int i = 0; i < meals.length; i++) {
                    int nr = i+1;
                    System.out.print("Your order [" + nr + "]: ");
                    String choice = (scan.nextLine()).toLowerCase();
                        if (choice.equals("sausage") || choice.equals("1")) {
                            meals[i] = new Sausage();
                            meals[i].kindOfFood();
                            System.out.println("Would you like to add ketchup? Y/N");
                            if (scan.nextLine().equalsIgnoreCase("y")) {
                                ((Sausage) meals[i]).addKetchup();
                            }
                        } else if (choice.equals("ice cream") || choice.equals("2")) {
                            meals[i] = new IceCream();
                            meals[i].kindOfFood();
                            System.out.println("Would you like to add sprinkles? Y/N");
                            if (scan.nextLine().equalsIgnoreCase("y")) {
                                ((IceCream) meals[i]).addSprinkles();
                            }
                        }
                        else {
                            int a = 1/0;
                        }
                }
                break;
            } catch (Exception e) {
                System.out.println("Please chose from our available menu!");
            }
        }

        for (int i = 0; i < meals.length; i++) {
            int nr = i+1;
            meals[i].order();
            System.out.println("Here's your order [" + nr + "]: ");
            meals[i].kindOfFood();
            meals[i].serve();
        }

        for (int i = 0; i < meals.length; i++) {
            totalPrice += meals[i].getPrice();
        }

        System.out.println("The total price is: " + totalPrice);

        scan.close();
    }
}
