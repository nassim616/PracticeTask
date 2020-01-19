package stringMunipulations;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {


//    Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 .....
//
//    Example:
//    Input:
//            6
//    Output:
//            0 1 1 2 3 5
        System.out.println(" enter you fibonacci series ");
  Scanner n = new Scanner(System.in);
  int number = n.nextInt();
       // System.out.println(" enter you fibonacci series");
  int num1 = 0;
  int num2 = 1;

for ( int  i = 0 ; i<number; i++){
    System.out.print(num1 + " ");
    int sum = num1+ num2;
    num1= num2;
    num2 = sum;
}


}

}
