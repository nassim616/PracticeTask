package stringMunipulations;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {



//        11)
//        Ask user for two words.
//        Using if statement check that first word contains second word OR that second word contains first word.
//                If it is true - print «wow».
//        If it is false - print «yey».
//        Check your program with these couples of words - 1)apple, pineapple (true); 2)letter, later (false); 3)keyboard, board (true).

                Scanner input = new Scanner(System.in);
                String word1 = input.nextLine();
               String word2 = input.nextLine();

               if( word1.contains(word2) || word2.contains(word1)) {
                   System.out.println("wow");
               }else {
                   System.out.println("yey");

               }


    }
}
