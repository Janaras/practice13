package com.company.ui;

import java.util.Scanner;

public class ConsoleUi {


    Scanner sc = new Scanner(System.in);
    public void greettings(){
        System.out.println("Hello this is calc app \n" +
                "here you can call your digits with any operations");
    }

    public double takeFirstDigit(){
        double a = sc.nextDouble();
        return a;
    }
    public double takeSecondDigit(){
        double b = sc.nextDouble();
        return b;
    }
    public String takeOperation(){
        String operation = sc.nextLine();
        return operation;
    }
    public void printResult(double res){
        System.out.println(res);

    }
}