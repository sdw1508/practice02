package practice02;

import java.util.Scanner;

public class Prob04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		char[] cArr = reverse(line);
		printCharArray(cArr);
		scanner.close();

	}

	private static char[] reverse(String line) {
		char[] cArr = new char[line.length()];
		for (int i = line.length() - 1; i >= 0; i--) {
			cArr[line.length() - i - 1] = line.charAt(i);
		}
		return cArr;
	}

	// 문자열의 순서를 뒤집어서 char 배열로 리턴하는 메소드를 구현한다
	// 예를 들어 “Hi!” 라는 문자열을 파라미터로 전달 하면 {‘!’, ‘i’, ‘H’ } 배열을 반환 한다.
	public static void printCharArray(char[] array) {
		System.out.println(array);
	}
}
