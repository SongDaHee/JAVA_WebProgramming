package hw;

import java.util.stream.Stream;

public class Palindrome {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0;
		
		while(tmp != 0) {
			int remainder = tmp % 10;
	        result = result * 10 + remainder;
	        tmp = tmp / 10;
		}
		
		if(number == result)
			System.out.println(number+"는 회문수 입니다.");
		else
			System.out.println(number+"는 회문수가 아닙니다.");
	}
}


