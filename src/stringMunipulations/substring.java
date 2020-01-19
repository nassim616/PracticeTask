package stringMunipulations;

public class substring {
    public static void main(String[] args) {
        String str1 = " Love is all around the word";
        String str2 = str1.substring(0,3);
        String str3 = str1.substring(5);
        System.out.println(str2);
        System.out.println(str3);
        int length = str1.length();
        String middle = str1.substring(0,length/2);
        System.out.println("length is "+ length);
        System.out.println("middle"+ middle);

    }
}
