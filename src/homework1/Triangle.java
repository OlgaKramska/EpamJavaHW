package homework1;

import java.util.Scanner;

/**
 * Created by Olga Kramska on 24-Feb-16.
 */
public class Triangle {
    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculateArea() {
        return (a * b) / 2;
    }

    public double calculatePerimeter() {
        return a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static void main(String[] args) {
        System.out.print("Enter leg length: ");
        Scanner inA = new Scanner(System.in);
        double a = inA.nextDouble();
        System.out.print("Enter leg length: ");
        Scanner inB = new Scanner(System.in);
        double b = inB.nextDouble();
        Triangle rightTriangle = new Triangle(a, b);
        System.out.println("The area of the triangle is " + rightTriangle.calculateArea());
        System.out.println("The perimeter of the triangle is " + rightTriangle.calculatePerimeter());
    }
}
