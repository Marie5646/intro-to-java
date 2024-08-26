package Assignments;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class ModuleOne {


    public int x;
    public static double footToMeter(double foot){
      return foot * 0.305;
    }

    public static double meterToFoot(double meter){
        return meter * 3.279;
    }

    public static void conversionTest(){
        System.out.printf("%-10s %-10s | %-10s %-10s\n","Feet","Meters","Feet","Meters");
        for (int i = 1 ,j = 20 ;i <= 10 && j <= 65 ; i++,j +=5){
            double meter = Math.abs(footToMeter(i));
            double foot = meterToFoot(i);
            System.out.printf("%-10s %-10s | %-10s %-10s\n", i,meter ,j, foot);
        }
    }

    public static int reverse (int number){
        StringBuilder rev = new StringBuilder(String.valueOf(number));
        rev.reverse();
        return Integer.parseInt(rev.toString());
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }


    public static void sumMajorDiagonal(){
        Scanner input = new Scanner(System.in);

        int rowsCol = 4;
        double[][] matrix = new double[rowsCol][rowsCol];

        System.out.println("Enter the elements of the 4x4 matrix:");
        for (int i = 0; i < rowsCol; i++) {
            System.out.println("Enter elements for row " + (i + 1) + ":");
            for (int j = 0; j < rowsCol; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        double sum = 0;
        for(int i = 0;i<rowsCol;i++){
           sum += matrix[i][i];
        }
        System.out.println(sum);
    }







    public static void main(String[] args) {
        System.out.println("Chapter 6:  Programming Exercise 6.9");
        System.out.println("-----------------------");

        System.out.println("Write a class that contains the following two methods:");
        System.out.println("Meter To Foot");
        System.out.println(meterToFoot(1));
        System.out.println("Foot To Meter");
        System.out.println(footToMeter(1));

        System.out.println("Write a test program that invokes these methods to display the following tables:");
        conversionTest();

        System.out.println("Chapter 6:  Programming Exercise 6.31");
        System.out.println("Reversed Number : " + reverse(3342));
        System.out.println("isPalindrome : " + isPalindrome(44322));

        System.out.println("Chapter 8:  Programming Exercise 8.29");

        sumMajorDiagonal();

    }
}
