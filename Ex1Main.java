import assignments.ex1.Ex1;
import java.util.Scanner;

public class Ex1Main {
    public static void main(String[] args) {
        ///////
        //System.out.println(Ex1.isNumber(""));
        /////
        Scanner k = new Scanner(System.in);
        String n = k.nextLine();

        if (Ex1.isNumber(n)) {
            System.out.println("num1 =" + n + " is number: true, value:");
            System.out.println("Enter a string as number#2");
            // Scanner in = new Scanner(System.in);
            // String y = in.nextLine();
            int a = Ex1.number2Int(n);
            System.out.println("the decimal value is:  " + a);
            String w = Ex1.int2Number(10, 2);
            System.out.println("the value of the number in your base is:  " + w);

        } else {
            System.out.println("num1 =" + n + " is number: false, value: -1");
            System.out.println("Enter a valid string as number#1");
        }
    }
}