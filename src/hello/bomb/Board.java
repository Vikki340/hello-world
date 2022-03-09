package hello.bomb;
import java.util.Scanner;

public class Board {
    public static class Board1 {
    int row;
    int column;
    int[][] myNumbers = { {row}, {column} };

    public Board1(int row, int column, int [][] myNumbers){
        this.row = row;
        this.column = column;
        this.myNumbers = myNumbers;
        }
    public int[][] new_board (){
            return myNumbers;
        }


    }

    public static void Board2(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("number of rows");
            int input_rows = in.nextInt();
            System.out.print("number of column");
            int input_columns = in.nextInt();
            for (int i = 0; i < input_rows; i++) {
                System.out.println("");
                System.out.println("------------------------");
                for (int a = 0; a < input_columns; a++) {
                    System.out.print("| " + " " + " ");
                }
                System.out.print("|");
            }
            System.out.println("");
            System.out.println("-------------------------");
        }

    }
   // class Board3 {
    //attributes
    //int row;
    //int column;
    //int[][] myNumbers = { {row}, {column} };

    //constructors

    //public Board3 (int row, int column,  int[][] myNumbers) {
      //  this.column = column;
        //this.row = row;
        //this.myNumbers = myNumbers;

        //public int[][] get_board ;() { return ; }
        //ADD GETTORS AND SO ON

        //public class Bomb {
            //for (int








/* now actually creating the array and assign values to the tiles */