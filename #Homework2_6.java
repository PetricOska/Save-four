package ch01;

import java.util.Scanner;

public class Homework2_6 {
    public static void main(String[] args) {
    
        Scanner tem = new Scanner(System.in);

        System.out.print("화씨온도 : ");
        double Ftem = tem.nextDouble();

        double Ctem = (5.0 / 9.0) * (Ftem - 32);

        System.out.println("섭씨온도 :  " + Ctem);

        tem.close();
	    }
	}