package stringMunipulations;

public class Task12 {
    public static void main(String[] args) {




//        12) You have String «morning».
//        Using charAt method and substring create new string in which in the beginning will be
//        the last letter from the first string and than this word up to the end
//        So your program will give you «gmorning» .


        String word = "morning";

      System.out.println(word.charAt(word.length()-1) + word.substring(0));



    }
}
