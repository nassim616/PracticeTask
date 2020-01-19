package stringMunipulations;

public class Task10 {
    public static void main(String[] args) {

//        10)
//        You have several word
//«kilogramm»
//«kilometer»
//«kilobyte»
//«kilobit»
//        You have to printout these words without «kilo».

        String word1 = "Kilogramm";

        String word2 = "kilometer";
        String  word3 = "kilobyte";
        String  word4 =  "kilobit";

        System.out.println(word1.substring( 4 ));
        System.out.println(word2.substring( 4 ));
        System.out.println(word3.substring( 4 ));
        System.out.println(word4.substring( 4 ));
    }
}
