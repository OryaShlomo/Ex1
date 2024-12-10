package assignments.ex1;

import java.util.Scanner;

/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */
public class Ex1 {
    public static int chartoInt(char num) {
        int ans = -1;
        char[] arr1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'b'};
        for (int i = 0; i < (arr1.length); i++) {
            if (arr1[i] == num) {
                ans = num;
            }
        }
        return ans;
    }
    /**
     * Convert the given number (num) to a decimal representation (as int).
     * It the given number is not in a valid format returns -1.
     * @param num a String representing a number in basis [2,16]
     * @return
     */
    public static int number2Int(String num) {
        int ans = -1;
        // add your code here
        if (isNumber(num)){
            
        }

        ////////////////////
        return ans;
    }
    /**
     * This static function checks if the given String (g) is in a valid "number" format.
     * @param a a String representing a number
     * @return true iff the given String is in a number format
     */
    public static boolean isNumber(String a) {
        boolean ans = true;
        // add your code here
        // char h = 0;
        for(int i =0; i < a.length(); i++){
            if (chartoInt(a.charAt(i)) == -1){     // הגדרתי לו את התווים החוקיים למספר. "b" לא כלול בהגדרה זו וצריך להגדיר אותו בנפרד.
                ans = false;
                break;
            }
            if (a.charAt(i) == ' ') {    // רווח הוא לא חוקי.
                ans = false;
                break;
            }
            if (a.charAt(i) == '-'){    // מספר שלילי לא חוקי.
                ans = false;
                break;
            }
            for(int j =0; j < a.length(); j++){
                if (i != j){
                    if(a.charAt(i) == 'b'){
                        if(a.charAt(j) == 'b'){    // אם יש תו "b", המספר חוקי אם ורק אם "b" מופיע פעם אחת בלבד במחרוזת.
                            ans = false;
                        }
                        if(a.charAt(0) == 'b' || a.charAt(a.length() - 1) == 'b'){  // // אם לא הכנסתי מספר לפני או אחרי "b", המספר לא חוקי.
                            ans = false;
                        } else
                        if (a.length() - a.indexOf('b') > 2) {  // אם יש בסיס דו תווי המספר לא חוקי.
                            ans = false;
                        } else
                        if (chartoInt(a.charAt(a.indexOf('b')+1)) < chartoInt('2')) {  // בודקת אם הבסיס הוא בטווח החוקי.
                            ans = false;
                        } else
                            for (int e = a.indexOf('b')+1; e < a.length(); e++){
                                for (int c = 0; c < a.indexOf('b'); c++){
                                    if (chartoInt(a.charAt(c)) >= chartoInt(a.charAt(e))){     // בדיקה שהבסיס אכן גדול מהמספר שהוכנס.
                                        ans = false;
                                        break;
                                    }
                                }
                            }
                    }
                }
            }
        }
        ////////////////////
        return ans;
    }

    /**
     * Calculate the number representation (in basis base)
     * of the given natural number (represented as an integer).
     * If num<0 or base is not in [2,16] the function should return "" (the empty String).
     * @param num the natural number (include 0).
     * @param base the basis [2,16]
     * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
     */
    public static String int2Number(int num, int base) {
        String ans = "";
        // add your code here

        ////////////////////
        return ans;
    }

    /**
     * Checks if the two numbers have the same value.
     * @param n1 first number
     * @param n2 second number
     * @return true iff the two numbers have the same values.
     */
    public static boolean equals(String n1, String n2) {
        boolean ans = true;
        // add your code here

        ////////////////////
        return ans;
    }

    /**
     * This static function search for the array index with the largest number (in value).
     * In case there are more than one maximum - returns the first index.
     * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
     * @param arr an array of numbers
     * @return the index in the array in with the largest number (in value).
     *
     */
    public static int maxIndex(String[] arr) {
        int ans = 0;
        // add your code here

        ////////////////////
        return ans;
    }
}