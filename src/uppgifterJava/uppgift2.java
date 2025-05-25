package uppgifterJava;

import java.util.Scanner;

public class uppgift2 {

    public static void main(String[] args) {
        /*2. En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
             försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
             Försäljningssumman ska läsas in.*/

        double basicSalary = 8000;
        double salesAmount;
        double salaryTotal;
        double salary = 0.09;
        int months;
        String totalMonths = "månader";

        System.out.print("Hur många månader arbetade du: ");
        Scanner scan = new Scanner(System.in);
        months = scan.nextInt();

        System.out.print("Vad är försäljningssumman: ");
        scan = new Scanner(System.in);
        salesAmount = scan.nextDouble();

        salaryTotal = basicSalary * months + salesAmount * salary;

        if (months == 1) {
            totalMonths = "månad";
        }
        System.out.println("Din lön under " + months + " " + totalMonths + " är: " + salaryTotal);
    }
}
