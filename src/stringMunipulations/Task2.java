package stringMunipulations;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//
//        Ask from user his first name, last name, age.
//                Print out the result («Your name is »+ first name + «Your last name is »  + last name + «Your age» + age.
//        (hint - use scanner. Create two strings variables, one int variable)
        Scanner input = new Scanner(System.in);

        System.out.println(" please enter ");
        String FirstName = input.nextLine();
        String LastName = input.nextLine();
        int age = input.nextInt();
        System.out.println(" your name is " + FirstName + " your last name is " + LastName +" your age : " + age );


    }
}
