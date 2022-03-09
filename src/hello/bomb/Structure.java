package hello.bomb;

import java.util.Random;
import java.util.Scanner;


public class Structure {
    //attributes
    Board [][] new_structure;
    int mines;
    Random random = new Random();

    //constor
    public Structure (int input_row, int input_column) {
        new_structure = new Board[input_row][input_column];
        for (int r = 0; r < input_row; r++)
        {
            for (int c = 0; c < input_row; c++ )
            {
                for ( int d = 0; d < mines; d ++) {
                    int rrow = (int) (Math.random()*input_row);
                    int rcolumn = (int) (Math.random()*input_column);
                    //boolean rbomb = random.nextBoolean();
                    int [][] myarray =
                    new_structure[r][c] = new Board.Board1 (input_row, input_column, myarray);
                    System.out.println(new_structure [r][c]);

                }
            //System.out.println("[-]");
            }
            //System.out.println();
        }
    }

}
