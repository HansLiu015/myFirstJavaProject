package exercise2;

import java.util.Random;

public class RandomArray {

    public static void main(String[] args) {

        RandomGenerator generator = new RandomGenerator();
        int[] newArray = generator.randomArray();

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
