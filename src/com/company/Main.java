package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("this is the height of the first wall (in m): ");
        int height = in.nextInt();
        System.out.print("this is the length of the first wall (in m): ");
        int length = in.nextInt();

        System.out.print("You can choose between different brands, the final costs will depend on you choice");
        System.out.print(" Which one of the following options do you prefer, how much are you willing to spend? You can either press Y if you want World_paint or N if you do not:");
        String brand_1 = in.next();
        System.out.print(" or you can press Y or N for World_paint:");
        String brand_2 = in.next();
        System.out.print(" alternatively you will be given Paint_the_world:");
        double surface_wall = height * length;
        double surface_single_can = 0.65;
        int result = (int) (surface_wall/ surface_single_can);
        double paint_remaining = (surface_wall% surface_single_can);
        float paint_left = (float)( paint_remaining * 100/ result);
        if (paint_remaining == 0) {
            System.out.println(result);
        } else {
            System.out.println("this is the number of cans that will be needed: " + result + "; this is the percentage of paint that will be left: " + paint_left + " %");
        }

        if (brand_1 == "Y"){
            System.out.println("the final cost will be " + result * 0.5);
        } else if (brand_2 == "Y"){
            System.out.println("the final cost will be " + result * 1.5);
        }
        else {
            System.out.println( "the final cost will be " + result * 2.5);
        }

    }
}


