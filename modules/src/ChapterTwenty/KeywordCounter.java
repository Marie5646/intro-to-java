package ChapterTwenty;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KeywordCounter {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Java source file: ");
        String filename = input.nextLine();

        File file = new File(filename);
        if (file.exists()) {
            System.out.println(STR."The number of keywords in \{filename} is \{countKeywords(file)}");
        } else {
            System.out.println("File " + filename + " does not exist");
        }
        input.close();
    }

    public static int countKeywords(File file) throws Exception {
        String[] keywordString = {"abstract", "assert", "boolean", "break", "byte",
                "case", "catch", "char", "class", "const", "continue", "default",
                "do", "double", "else", "enum", "extends", "for", "final", "finally",
                "float", "goto", "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private", "protected",
                "public", "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "try", "void",
                "volatile", "while", "true", "false", "null"};

        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));
        int count = 0;

        Scanner input = new Scanner(file);


        while (input.hasNextLine()) {
            String line = input.nextLine();
            boolean inStringLiteral = false;
            StringBuilder theWord = new StringBuilder();

            int comment = line.indexOf("//");
            if (comment != -1) {
                line = line.substring(0, comment);
            }

            for (int i = 0; i < line.length(); i++) {

                if (line.charAt(i) == '"') {
                    inStringLiteral = !inStringLiteral;
                    if (inStringLiteral) {
                        continue;
                    } else {
                        String word = theWord.toString().trim();
                        if (keywordSet.contains(word) && !word.isEmpty()) {
                            count++;
                        }
                        theWord.setLength(0);
                    }
                }

                if (inStringLiteral) {
                    continue;
                }

                char c = line.charAt(i);
                if (Character.isWhitespace(c)) {
                    if (!theWord.isEmpty()) {
                        String word = theWord.toString().trim();
                        if (keywordSet.contains(word) && !word.isEmpty()) {
                            count++;
                        }
                        theWord.setLength(0);
                    }
                } else {
                    theWord.append(c);
                }
            }


            String lastWord = theWord.toString().trim();
                if (keywordSet.contains(lastWord) && !lastWord.isEmpty()) {
                    count++;
                }
            }
            input.close();

            return count;
        }
    }
