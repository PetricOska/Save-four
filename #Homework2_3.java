package ch01;

import java.util.Scanner;

public class Homework2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("원기둥의 밑면 반지름은? ");
        int num1 = sc.nextInt();

        System.out.print("원기둥의 높이는? ");
        int num2 = sc.nextInt();

        double boopee = Math.pow(num1, 2) * 3.14 * num2;
        System.out.printf("원기둥이 부피는 %.1f", boopee);
        
        sc.close();
    }
}