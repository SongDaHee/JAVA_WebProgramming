package homework;

public class Exercise8 {
	public static void main(String args[]) {
		char ch = 'z';
		boolean b = (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>=48 && ch<=57);
		
		System.out.println(b);
	}
}
