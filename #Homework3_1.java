package ch01;

import java.util.Scanner;

public class Homework3_1 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.printf("정수를 입력해주세요 : ");
		int age = num.nextInt();
		
		if (age >= 19) {
			System.out.println("성년");
		} else {
			System.out.printf("미성년");
		}
	}
}