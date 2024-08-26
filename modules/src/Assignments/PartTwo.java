package Assignments;

import java.util.Scanner;

public class PartTwo {
    public static int reverse (int number){
        StringBuilder rev = new StringBuilder(String.valueOf(number));
        rev.reverse();
        return Integer.parseInt(rev.toString());
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }

    public static void checkifPalindrome() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if(isPalindrome(number)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
    public static void main(String[] args) {
        System.out.println("Chapter 6:  Programming Exercise 6.31");
        System.out.println("Write the methods with the following headers:");
        checkifPalindrome();
    }
}
