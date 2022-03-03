package com.company;
public class Main {
    public static void main(String[] args) {
        int height = 8;
        double length = 2.5;
        double surface_wall = height * length;
        double surface_single_can = 0.65;
        int result = (int) (surface_wall/ surface_single_can);
        double paint_left = (surface_wall% surface_single_can);
        System.out.println(result);
        System.out.println(paint_left);

    }
}
