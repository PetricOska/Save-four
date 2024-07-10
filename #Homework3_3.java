package ch01;

import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        int x = 0;
        int numb; 

        Scanner num = new Scanner(System.in);

        do {
            System.out.print("정수를 입력하세요 : ");
            numb = num.nextInt(); 
            if (numb % 2 == 0) {
                x += numb; 
            }
        } while (numb % 2 == 0); 

        System.out.printf("입력한 양의 정수 중에서 짝수의 합은 %d입니다.", x);

        num.close();
    }
}