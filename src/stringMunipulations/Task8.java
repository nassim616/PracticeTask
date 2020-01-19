package stringMunipulations;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {


//        8)
//        Ask from user for entering two integer numbers.
//        Calculate the sum of this numbers.
//                Check if this sum is more than 50 - Print out «Your sum is more than 50»
//        If this sums is less than 50 - print out «Your sum is less than 50»

        Scanner input = new Scanner(System.in);
        System.out.println(" enter two integer ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = num1+num2;
        if (result > 50) {
            System.out.println(" more than 50");
        } else
            System.out.println(" less than 50");




    }
}