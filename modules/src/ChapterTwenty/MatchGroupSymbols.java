package ChapterTwenty;

import java.util.Scanner;
import java.util.Stack;

public class MatchGroupSymbols {

//    A Java program contains various pairs of grouping symbols, such as:
//
//    Parentheses: ( and )
//
//    Braces: { and }
//
//    Brackets: [ and ]
//
//    Note the grouping symbols cannot overlap. For example, (a{b)} is illegal. Write a program to check whether a Java source-code file has correct pairs of grouping symbols. Pass the source-code file name as a command-line argument.


    public static boolean isMatching(String srcCode) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < srcCode.length(); i++) {
            if (srcCode.charAt(i) == '[' || srcCode.charAt(i) == '{' || srcCode.charAt(i) == '(') {
                stack.push(String.valueOf(srcCode.charAt(i)));
            } else if (srcCode.charAt(i) == ']' || srcCode.charAt(i) == '}' || srcCode.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop().charAt(0);

                if ((srcCode.charAt(i) == ']' && top != '[') ||
                        (srcCode.charAt(i) == '}' && top != '{') ||
                        (srcCode.charAt(i) == ')' && top != '(')) {
                    return false;


                }
            }
            return stack.isEmpty();

        }
        return false;
    }


        public static void main (String[]args){
            Scanner myScan = new Scanner(System.in);
            System.out.println("Enter a string that includes symbols such as [,{ ,( ,) ,},]: ");
            String userInput = myScan.nextLine();
            String checkIfMatch = isMatching(userInput) ? "MATCHING" : "NOT MATCHING";
            System.out.println(checkIfMatch);

        }


































}
