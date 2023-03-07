package Homework1;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        calculation(getNumber(), getOperator(), getNumber());
    }

    public static double getNumber() {
        System.out.println("Enter number");
        double number;
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            System.out.println("Something is wrong. Try again");
            scanner.next();
            number = getNumber();
        }
        return number;
    }

    public static char getOperator() {
        System.out.println("Enter operator (+, -, *, /)");
        char operator;
        if (scanner.hasNext()) {
            operator = scanner.next().charAt(0);
        } else {
            System.out.println("Enter the correct operator and try again");
            operator = getOperator();
        }
        return operator;
    }

    public static void calculation(double number1, char operator, double number2) {
        switch (operator) {
            case '+':
                System.out.println("Result: " + (number1 + number2) + "\n");
                break;
            case '-':
                System.out.println("Result: " + (number1 - number2) + "\n");
                break;
            case '*':
                System.out.println("Result: " + (number1 * number2) + "\n");
                break;
            case '/':
                System.out.println("Result: " + (number1 / number2) + "\n");
                break;
            default:
                System.out.println("Error! Enter correct operator\n");
        }
    }
}
