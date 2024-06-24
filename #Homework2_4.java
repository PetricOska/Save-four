package ch01;

import java.util.Scanner;

public class Homework2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("초 단위 정수를 입력하세요 : ");
        int cho = sc.nextInt();
        
        int h = cho / 3600; 
        int m = (cho % 3600) / 60;
        int s = (cho % 3600) % 60;

        System.out.printf("%d시간 %d분 %d초", h, m, s);
        
        sc.close();
    }
}