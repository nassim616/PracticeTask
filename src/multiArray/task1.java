package multiArray;

public class task1 {
    public static void main(String[] args) {

        int first_arr [] [] =  {{35,11,32,1,} , {35,21,89,39}};
        int second_arr [][] = {{23, 56,34,},{64,12,9,76}, {4}};

        System.out.println("this is my first arr");

        display(first_arr);

        System.out.println("this is my second arr");

        display(second_arr);
    }
    public static void display(int x [][]){
        for (int i = 0 ; i< x.length; i++){

            for (int j = 0 ; j< x[i].length; j++ ){

                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
