package stringMunipulations;



public class Task5 {
    public static void main(String[] args) {
//
//        5) You have the string
//        «Cybertek school».
//        -Find the index of the space
//        - print out substring from 0 to this space
//        - print out substring from the space till the end of the string


//    I have one comment for 5th task. After you'll finish them, Could you please try instead of using
//numbers 8 and 9 use index of the space?  1) create int variable for index of the space
//    (int space_index=....)  2) use this variable instead of numbers in substring method.
//(school.substring(0, space_index)). Let me know if you have questions.



      String school = "cybertek school";

     int space_index = school.indexOf( " " );
        int space_index2 = school.indexOf( " " );
       System.out.println(school.indexOf( " " ));
        System.out.println( school.substring(0, space_index )  );
       System.out.println(school.substring(space_index2 ));
        }
}
