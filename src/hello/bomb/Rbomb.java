package hello.bomb;
import java.util.Random;

public class Rbomb {
        public static void rbomb(int [][])
        {
            int[] []arr={"1", "2", "3", "4", "5"};
            Random r=new Random();
            int randomNumber=r.nextInt(arr.length);
            System.out.println(arr[randomNumber]);
        }
    }
}
