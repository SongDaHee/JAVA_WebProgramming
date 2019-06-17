package hw;
import java.util.*;
import java.util.stream.Stream;

public class SumNum {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		int[] digits = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
		
		for(int tmp : digits) {
			sum += tmp;
		}
		System.out.println("sum="+sum);
	}
}
