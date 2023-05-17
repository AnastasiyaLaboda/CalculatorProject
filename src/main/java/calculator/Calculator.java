package calculator;

public class Calculator {
    public static double addNumbers(double number1, double number2) {
        return number1 + number2;
    }

    public static double subtractNumbers(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiplyNumbers(double number1, double number2) {
        return number1 * number2;
    }

    public static double divideNumbers(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("ERROR! You can't divide by zero");
            //System.out.println("ERROR! You can't divide by zero");
        }
        return number1 / number2;
    }
}
