package homework;

public class Exercise2 {
	public static void main(String args[]) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (int) (((float)numOfApples/sizeOfBucket) + 0.9);
		
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
	}
}
