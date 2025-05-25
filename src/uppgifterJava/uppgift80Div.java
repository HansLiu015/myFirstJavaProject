package uppgifterJava;

public class uppgift80Div {

    private int[] numbers;
    private int gcd;

    public uppgift80Div(int numerator, int denominator) {
        numbers = new int[2];
        this.numbers[0] = numerator;
        this.numbers[1] = denominator;
        this.gcd = 1;
    }

    public int getNumerator() {
        return numbers[0];
    }

    public int getDenominator() {
        return numbers[1];
    }

    public int getGcd() {
        return gcd;
    }

    public void abbreviateFraction() {
        if (numbers[0] % numbers[1] != 0) {
            gcd = numbers[0];
            numbers[1] /= numbers[0];
            numbers[0] /= numbers[0];
        } else if (numbers[1] % numbers[0] != 1) {
            gcd = numbers[1];
            numbers[0] /= numbers[1];
            numbers[1] /= numbers[1];
        }
    }
}
