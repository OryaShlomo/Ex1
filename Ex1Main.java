package assignments.ex1;

import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2 = "", quit = "quit", base = "";
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();
            if (!num1.equals(quit)) {
                // add your code here
                if (assignments.ex1.Ex1.isNumber(num1)) {
                    System.out.println("num1= " + num1 + " is number: true , value: " + assignments.ex1.Ex1.number2Int(num1));
                    System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
                    num2 = sc.next();
                    if (!num2.equals(quit)) {
                        if (assignments.ex1.Ex1.isNumber(num2)) {
                            System.out.println("num2= " + num2 + " is number: true , value: " + assignments.ex1.Ex1.number2Int(num2));
                            System.out.println("Enter a base for output: a number [2,16].");
                            base = sc.next();
                            if (assignments.ex1.Ex1.baseTrue(base)) {
                                String x = assignments.ex1.Ex1.int2Number(assignments.ex1.Ex1.add(num1, num1), assignments.ex1.Ex1.number2Int(base));
                                String y = assignments.ex1.Ex1.int2Number(assignments.ex1.Ex1.mult(num1, num1), assignments.ex1.Ex1.number2Int(base));
                                System.out.println(num1 + " + " + num2 + " = " + x);
                                System.out.println(num1 + " * " + num2 + " = " + y);
                                String[] arr = {num1, num2, x, y};
                                String z = arr[assignments.ex1.Ex1.maxIndex(arr)];
                                System.out.println("Max number over [" + num1 + ", " + num2 + ", " + x + "," + y + "] is: " + z);
                                continue;
                            } else {
                                System.out.println("ERR: wrong base, should contain only numbers between 2 and 16, got (" + base + "). This base is not in the format.");
                                continue;
                            }
                        }
                    } else {
                        System.out.println("quiting now...");
                    }
                } else {
                    System.out.println("num1= " + num1 + " is number: false , value: -1");
                    System.out.println("ERR: num1 is in the wrong format! (" + num1 + ")");
                    continue;
                }
                /////////////////////
            } else {
                System.out.println("quiting now...");
            }
        }
    }
}
