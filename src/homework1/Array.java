package homework1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Olga Kramska on 26-Feb-16.
 */
public class Array {
    private double[] arr;

    public Array(int size) {
        arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (Math.random() * 5);
        }
    }

    public double findMaxSum() {
        double[] sumArr = new double[arr.length / 2];
        for (int i = 0; i < arr.length / 2; i++) {
            sumArr[i] = arr[i] + arr[(arr.length - 1) - i];
        }

        double maxSum = sumArr[0];
        for (double aSumArr : sumArr) {
            if (maxSum < aSumArr) {
                maxSum = aSumArr;
            }
        }
        return maxSum;
    }

    @Override
    public String toString() {
        return "Array{" +
                Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args) {
        System.out.print("Enter an array length (n): ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Array a = new Array(n);
        System.out.println(a.toString());
        System.out.println("\n" + "Maximum of sums (a[i] + a[n-i]) is " + a.findMaxSum());
    }
}