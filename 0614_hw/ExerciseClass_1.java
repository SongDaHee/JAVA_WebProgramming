

public class ExerciseClass_1{
	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" +max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[] {}));
		
		int value = 5;
		System.out.println(value+"의 절대값:"+abs(value));
		value = -10;
		System.out.println(value+"의 절대값:"+abs(value));
	}
		
	static int max(int[] arr) {
		int max = -999999;
		
		if(arr !=null) {
			int arr_length = arr.length;
			
			while(arr_length-- >0) {
				if(arr[arr_length] > max) {
					max = arr[arr_length];
				}
			}
			return max;
		}
		else
			return max;
	}
	
	static int abs(int value) {
		int abs = Math.abs(value);
		return abs;
	}
}
