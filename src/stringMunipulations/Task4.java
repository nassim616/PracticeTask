package stringMunipulations;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

//        4) Ask from a user for any string.
//        -Printout this string in lower case.
//        -Printout this string in upper case


        Scanner input = new Scanner(System.in);
        String  sentence = input.nextLine();
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
    }
}
