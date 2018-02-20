package practice02;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int p_50000 = 0;
		int p_10000 = 0;
		int p_5000 = 0;
		int p_1000 = 0;
		int p_500 = 0;
		int p_100 = 0;
		int p_50 = 0;
		int p_10 = 0;
		int p_5 = 0;
		int p_1 = 0;

		int total = n; // 총 액수
		while (true) {
			if (total >= 50000) {
				p_50000 = total / 50000; // 몫을 저장
				total = total % 50000; // 5만으로 나눈 나머지 토탈에 저장
			} else if (total >= 10000) {
				p_10000 = total / 10000; 
				total = total % 10000; 
			} else if (total >= 5000) {
				p_5000 = total / 5000; 
				total = total % 5000; 
			} else if (total >= 1000) {
				p_1000 = total / 1000; 
				total = total % 1000; 
			} else if (total >= 500) {
				p_500 = total / 500; 
				total = total % 500; 
			} else if (total >= 100) {
				p_100 = total / 100; 
				total = total % 100; 
			} else if (total >= 50) {
				p_50 = total / 50;
				total = total % 50; 
			} else if (total >= 10) {
				p_10 = total / 10; 
				total = total % 10; 
			} else if (total >= 5) {
				p_5 = total / 5; 
				total = total % 5; 
			} else if (total >= 1) {
				p_1 = total / 1; 
				total = total % 1; 
			} else if(total==0) {
				break;
			}
		}

		System.out.println("50000원 : " + p_50000 + "개\n" + "10000원 : " + p_10000 + "개\n" + "5000원 : " + p_5000 + "개\n"
				+ "1000원 : " + p_1000 + "개\n" + "500원 : " + p_500 + "개\n" + "100원 : " + p_100 + "개\n" + "50원 : " + p_50
				+ "개\n" + "10원 : " + p_10 + "개\n" + "5원 : " + p_5 + "개\n" + "1원 : " + p_1 + "개\n");

	}
}
