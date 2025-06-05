package lessonExercise7;

public class Logic {

    public int operators(String operator, int first, int second) {
        int result = 0;

        switch (operator) {
            case "+":
                result = addition(first, second);
                break;
            case "-":
                result = subtraction(first, second);
                break;
            case "*":
                result = multiplication(first, second);
                break;
            case "/":
                result = division(first, second);
                break;
            default:
                System.out.println("Error, invalid operation!");
                break;
        }
        return result;
    }

    public int addition(int first, int second) {
        return first + second;
    }

    public int subtraction(int first, int second) {
        return first - second;
    }

    public int multiplication(int first, int second) {
        return first * second;
    }

    public int division(int first, int second) {
        return first / second;
    }
}
