package ch01;

import java.util.Scanner;

public class Homework2_8 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("0이상 999이하의 정수를 입력하세요 : ");
		int x = num.nextInt();
		
		if (x > 999 || x < 0) {
			System.out.printf("정해진 범위안의 정수를 입력하시라니까요??");
		} else {
			int hundred = x / 100;
			int ten = (x / 10) % 10;
			int one = x % 10;
			
			int sum = hundred + ten + one;
			
			System.out.printf("각 자릿수의 합 = %d", sum);
		}
		num.close();
	}
}