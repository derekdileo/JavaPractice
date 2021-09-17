/*
 * "Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing."
 * Write a method that, given a sentence like the one above,
 * along with the position of an opening parenthesis,
 * finds the corresponding closing parenthesis.
 *   */

public class Parenthesis {

    // String variable to keep test clean
    public static String validString1 = "(Max)";
    public static String invalidString1 = "(Max";
    public static String validString2 = "Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";
    public static String invalidString2 = "Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";

    public static void main(String[] args) {

        // Short Test
        System.out.println(findParen(0, validString1) == 4);
        System.out.println(findParen(0, invalidString1) == -1);

        // Long Test
        System.out.println(findParen(10, validString2) == 79);
        System.out.println(findParen(10, invalidString2) == -1);

    }

    // As method traverses string, a counter increments with each traversal
    // Second counter to track open and closed parentheses. When counter == 0, index is found. Return first counter
    public static int findParen(int indexOpen, String str) {
        int count = 0;
        for(int i = indexOpen; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                count++;
            }
            if(str.charAt(i) == ')') {
                count--;
                if(count == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
