package ChapterTwenty;

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
            String myStr = "{[}}";
            String checkIfMatch = isMatching(myStr) ? "MATCHING" : "NOT MATCHING";
            System.out.println(checkIfMatch);

        }














//    (COUNT THE KEYWORDS IN JAVA SOURCE CODE) Revise the program in Listing 21.7. If a keyword is in a comment or in a string, don’t count it. Pass the Java file name from the command line. Assume the Java source code is correct and line comments and paragraph comments do not overlap.


















//    (IMPLEMENT A DOUBLY LINKED LIST) The MyLinkedList class used in Listing 24.5 is a one-way directional linked list that enables one-way traversal of the list. Modify the Node class to add the new data field name previous to refer to the previous node in the list, as follows:
//
//
//    public class Node<E> {
//        E element;
//        Node<E> next;
//        Node<E> previous;
//
//        public Node(E e) {
//            element = e;
//        }
//    }
//    Implement a new class named TwoWayLinkedList that uses a doubly linked list to store elements. Define TwoWayLinkedList to implements MyList. You need to implement all the methods defined in MyLinkedList as well as the methods listIterator() and listIterator(int index). Both return an instance of java.util.ListIterator<E> (see Figure 20.4). The former sets the cursor to the head of the list and the latter to the element at the specified index. Test your new class using this code from https://liveexample.pearsoncmg.com/test/Exercise24_03.txt.



}
