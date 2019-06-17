package hw;

public class Exercise3_1 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (float) (5/9.0*(fahrenheit-32) );
		String c = String.format("%.2f", celcius);

		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+c);
	}
}
