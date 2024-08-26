package Assignments;

import java.util.Scanner;

public class PartThree {
    public static void sumMajorDiagonal(double[][] m) {
        Scanner input = new Scanner(System.in);

        int rowsCol = m.length;

        System.out.println("Enter a 4−by−4 matrix row by row:");
        for (int i = 0; i < rowsCol; i++) {
            System.out.println("Enter elements for row " + (i + 1) + ":");
            for (int j = 0; j < rowsCol; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        double sum = 0;
        for(int i = 0;i<rowsCol;i++){
            sum += m[i][i];
        }
        System.out.println("Sum of the elements in the major diagonal is :" + sum);
    }
    public static void main(String[] args) {
        System.out.println("Chapter 8:  Programming Exercise 8.29");
        double[][] matrix = new double[4][4];
        sumMajorDiagonal(matrix);
    }

}

