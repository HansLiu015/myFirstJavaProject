package calculator;

public class Calculator {

    private int first;

    private int second;

    public Calculator(int firstNumber, int secondNumber) {
        this.first = firstNumber;
        this.second = secondNumber;
    }

    public int getSum() {
        return first + second;
    }

    public int getSub() {
        return first - second;
    }

    public int getMult() {
        return first * second;
    }

    public double getDiv() {
        return (double) first / second;
    }
}
