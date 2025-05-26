package exercise2;

public class RandomGenerator {

    public int[] randomArray() {
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        int arrayLength = (int) (Math.random() * range) + min;

        int[] randomArray = new int[arrayLength];

        for (int i = 0; i < randomArray.length; i++) {
            int random = (int) (Math.random() * range) + min;
            randomArray[i] = random;
        }

        return randomArray;
    }
}
