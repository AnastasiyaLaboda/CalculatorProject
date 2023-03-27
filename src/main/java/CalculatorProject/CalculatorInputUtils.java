package CalculatorProject;

import java.util.Scanner;

public class CalculatorInputUtils {
    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        String userInput = scanner.nextLine();
        while (!userInput.matches("-?\\d+(\\.\\d+)?")) {
            System.out.println("Something is wrong. Enter number again");
            userInput = String.valueOf(getNumber());
        }
        return Double.parseDouble(userInput);
    }

    public static String getOperator() {
        System.out.println("Enter the operator (+, -, *, /)");
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        boolean correctOperator = operator.trim().matches("[+-/*]");
        if (!correctOperator) {
            System.out.println("Wrong operator, try again");
            operator = getOperator();
        }
        return operator;
    }
}
