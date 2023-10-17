package com.company.service;

public class CalculatorService {
    public double sum(double a, double b) {
        double result = a + b;
        return result;
    }

    public double minus(double a, double b) {
        double result = a - b;
        return result;
    }

    public double multiply(double a, double b) {
        return  a * b;
    }

    public double divide(double a, double b) {
        if (checkForZero(a,b)) {
            System.out.println("error 0");
        }else {
            return a / b;
        }
        return -1;

    }
    public double percent(double full,double target) {
        if (checkForZero(full, target)) {
            System.out.println("error 0");
        }else {
            return (100 * target) / full;
        }
        return -1;
    }
    public boolean checkForZero(double a, double b) {
        if (a == 0 || b == 0) {
            return true;
        }
        return false;
    }
}

