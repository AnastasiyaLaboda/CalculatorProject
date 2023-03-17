package CalculatorProject;

import java.util.Scanner;

public class CalculatorInputUtils {
    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);
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
