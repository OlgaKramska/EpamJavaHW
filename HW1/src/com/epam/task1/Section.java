package com.epam.task1;

import java.util.Scanner;

/**
 * Created by Olga Kramska on 24-Feb-16.
 */
public class Section {
    private double a;
    private double b;
    private double step;

    public Section(double a, double b, double step) {
        this.a = a;
        this.b = b;
        this.step = step;
    }

    public void printDataTable() {
        if (a > b || step <= 0) {
            System.out.println("Wrong input data");
        } else {
            System.out.println("x \t\t F(x)");
            for (double x = a; x <= b; x += step) {
                double func = Math.tan(2 * x) - 3;
                System.out.println(x + " \t " + func);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter beginning number: ");
        Scanner inA = new Scanner(System.in);
        double a = inA.nextDouble();
        System.out.print("Enter end number: ");
        Scanner inB = new Scanner(System.in);
        double b = inB.nextDouble();
        System.out.print("Enter step: ");
        Scanner inH = new Scanner(System.in);
        double step = inH.nextDouble();
        Section interval = new Section(a, b, step);
        interval.printDataTable();
    }
}
