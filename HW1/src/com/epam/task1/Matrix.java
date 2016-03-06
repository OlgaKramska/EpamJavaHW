package com.epam.task1;

import java.util.Scanner;

/**
 * Created by Olga Kramska on 26-Feb-16.
 */
public class Matrix {
    private int[][] matrix;

    public Matrix(int dim) {
        matrix = new int[dim][dim];
    }

    public void fill() {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == ((n - 1) - j)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void print() {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter matrix dimension: ");
        Scanner in = new Scanner(System.in);
        int dim = in.nextInt();
        Matrix matrix = new Matrix(dim);
        matrix.fill();
        matrix.print();
    }
}
