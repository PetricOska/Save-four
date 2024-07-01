package ch01;

import java.util.Scanner;

public class Homework2_7 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = num.nextInt();
		
		if (x % 4 == 0 && x % 5 == 0) {
			System.out.printf("정수 %d는 4와 5로 모두로 나누어집니다. true.\n", x);
		} else {
			System.out.printf("정수 %d는 4와 5로 모두로 나누어지지 않습니다. False.\n", x);
		}
		if (x % 4 == 0 || x % 5 == 0) {
			System.out.printf("정수 %d는 4또는 5로 나누어집니다. true.\n", x);
		} else {
			System.out.printf("정수 %d는 4또는 5로 나누어지지 않습니다. False.\n", x);
		}
		if (x % 4 ==0 ^ x % 5 == 0) {
			if (x % 4 ==0) {
				System.out.printf("정수 %d는 4로만 나누어 집니다. true.\n", x);
			} else {
				System.out.printf("정수 %d는 5로만 나누어 집니다. true.\n", x);
			}
		} else {
			System.out.printf("정수 %d는 4로만 나누어지거나 5로만 나누어지지 않습니다. False\n", x);
		}
	}
}