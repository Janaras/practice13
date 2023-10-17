package com.company;

import com.company.service.CalculatorService;
import com.company.ui.ConsoleUi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ConsoleUi consoleUi = new ConsoleUi();
        CalculatorService calculatorService = new CalculatorService();
        Scanner sc = new Scanner(System.in);
        boolean isActive = true;

        while (isActive) {
            consoleUi.greettings();
            double a = consoleUi.takeFirstDigit();
            sc.nextLine();
            String op = consoleUi.takeOperation();
            double b = consoleUi.takeSecondDigit();
            double result = 0;
            switch (op) {
                case "+":
                    result = calculatorService.sum(a, b);
                    break;
                case "-":
                    result = calculatorService.minus(a, b);
                    break;
                case "*":
                    result = calculatorService.multiply(a, b);
                    break;
                case "/":
                    result = calculatorService.divide(a, b);
                    break;
                default:
                    System.out.println("noo");

            }
            consoleUi.printResult(result);

            System.out.println("Do you want to perform another calculation? (yes/no)");
            String anotherCalculation = consoleUi.takeOperation();
            if (!"yes".equalsIgnoreCase(anotherCalculation)) {
                isActive = false;
                System.out.println("Goodbye!");
            }
        }
    }
}
