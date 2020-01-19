package stringMunipulations;

public class task15 {
    public static void main(String[] args) {



//         There is a little task for you: array+string manipulation .
//          You have string arrays {«apples», «sausages», «super»}. You have to change all «s» letters to «$».
//
//        You have to create loop and inside the loop use replace method


        String arr [] = { " apples" , "sausages" , "super" };

        for (int i = 0 ; i< arr.length ; i++){

//            if(arr[i].contains("s")){

            System.out.println(arr[i].replace("s","$"));
        }


    }
}
