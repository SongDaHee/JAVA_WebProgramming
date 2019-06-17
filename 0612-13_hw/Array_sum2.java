
public class Array_sum2 {
	public static void main(String[] args) {
		int [][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
		
		int check = 0;
		for(int[] n : arr) {
			for(int m : n) {
				total += m;
				check += 1;
			}
		}
		
		average = total/(float)check;
		
		System.out.println("total="+total);
		System.out.println("average="+average);
	}
}
