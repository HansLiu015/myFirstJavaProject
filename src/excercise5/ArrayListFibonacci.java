package excercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        //int[] fibonacci = new int[10];
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();

        fibonacci.add(1);
        fibonacci.add(1);

        for (int i = 2; i < number; i++) {
            fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
        }

        System.out.println(fibonacci.get(number-1));

        scan.close();
    }
}
