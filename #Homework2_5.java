package ch01;

import java.util.Scanner;

public class Homework2_5 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        
        System.out.print("소문자를 입력하세요: ");
        char c = abc.next().charAt(0);
        
        char upperCaseC = (char) (c - 32);

        System.out.println("변환된 대문자: " + upperCaseC);
        
        abc.close();
    }
}