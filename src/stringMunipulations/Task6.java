package stringMunipulations;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {


//        6) Ask from a user for any string.
//        Calculate the length of the string.
//        -Create if statement where your program will be check if the length of the string >= 5
//                -If it is true print out «wow!», if it is false printout «yey!»

        Scanner input = new Scanner(System.in);
        String taco = input.nextLine();
        int word  = taco.length();

        if ( taco.length() >= 5 )


        {
            System.out.println("wow");

        } else {
            System.out.println("yey");

        }

    }
}
