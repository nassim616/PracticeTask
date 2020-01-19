package stringMunipulations;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

//        1)
//        Ask from user two integers. Calculate the sum (+), subtraction(minus), devision (/) and multiplying (*) them.
//    (hint: you need to create two integers and scanner. Than you need to create four other integers for math calculations).
//        Print out the result of your calculations.

        Scanner input = new Scanner(System.in);
        System.out.println("calculate two numbers :");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int subt = num1 - num2;
        int devis = num1 / num2;
        int multi = num1 * num2;

        System.out.println(multi);

        System.out.println(subt);

        System.out.println(devis);

        System.out.println(sum);
    }
}
