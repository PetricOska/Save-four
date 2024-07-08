package ch01;

import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args) {
		Scanner lank = new Scanner(System.in);
		
		System.out.printf("등수를 입력해주세요 : ");
		int yourlank = lank.nextInt();
		
		switch(yourlank) {
		case 1:
			System.out.println("아주 잘했습니다.");
			break;
		case 2:
			System.out.println("잘했습니다.");
			break;
		case 3:
			System.out.println("잘했습니다.");
			break;
		case 4:
			System.out.println("보통입니다.");
			break;
		case 5:
			System.out.println("보통입니다.");
			break;
		case 6:
			System.out.println("보통입니다.");
			break;
		default:
			System.out.println("노력해야겠습니다.");
		}
	}
}