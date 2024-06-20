package ch01;

import java.util.Scanner;

public class Homework2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.printf("%d의 제곱은 %d", num, num*num);
		sc.close();
	}
}