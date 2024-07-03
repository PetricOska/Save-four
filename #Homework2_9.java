package ch01;

import java.util.Scanner;

public class Homework2_9 {
	public static void main(String[] args) {
		
		Scanner jnum = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		int j = jnum.nextInt();
		
		Scanner gnum = new Scanner(System.in);
		System.out.print("교양 이수 학점 : ");
		int g = gnum.nextInt();
		
		Scanner nnum = new Scanner(System.in);
		System.out.print("일반 이수 학점 : ");
		int n = nnum.nextInt();
		
		if (j + g + n >= 140) {
			if ( j < 70 ) {
				System.out.printf("전공 학점이 이게 뭡니까? 공부 좀 하시지 그랫어요~\n");
			} else if ((g < 30 || n < 30) || g + n < 80) {
				System.out.printf("교양이랑 일반 학점이 이게 뭡니까? 공부 좀 하시지 그랫어요~\n");
			} else {
				System.out.printf("졸업 가능");
			}
		}
	}
}