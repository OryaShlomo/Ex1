import assignments.ex1.Ex1;

import java.util.Scanner;

public class Ex1Main {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        String n = k.nextLine();
        if (Ex1.isNumber(n)){
            System.out.println("num1 =" + n + " is number: true, value:");
            System.out.println("Enter a string as number#2");
            // Scanner in = new Scanner(System.in);
            // String y = in.nextLine();

        }
        else{
            System.out.println("num1 =" + n + " is number: false, value: -1");
            System.out.println("Enter a valid string as number#1");
        }
    }
}