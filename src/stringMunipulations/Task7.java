package stringMunipulations;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {


//        7) you have two strings: string 1 «Burger with fries», string 2 «Burger with mushed potato».
//        Create two separated if statements.
//         First will be check if these two strings are equal - if it is true - print out «What?» - if it is false - print out
//       «Yes they are different»
//        Second if statement will check if both strings contains «Burger»
//        ( if str1.contains(«Burger») and (str2.contains ( «Burger» ))
//        If it is true  - print out «You eat too many burgers»
//        If it is false - print out «Good for you»

        String fries = " burger with fries";
        String potato = "burger with mushed potato";
        if (fries.equals(potato)) {

            System.out.println("what?");
        } else {

        }

            System.out.println("yes ");


        if (fries .contains("burger") && potato.contains("burger")) {
            System.out.println("too many");
        }else{
            System.out.println("good for you ");
        }


            }



    }

