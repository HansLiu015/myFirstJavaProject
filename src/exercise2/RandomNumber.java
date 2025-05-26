package exercise2;

public class RandomNumber {

    public static void main(String[] args) {

        int min = 1;
        int max = 100;
        int range = max - min + 1;

        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            System.out.println(rand);
        }
    }
}
