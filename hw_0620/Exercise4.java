package hw_0620;

class Outer3{
	int value = 10;
	
	class Inner3{
		int value = 20;
		
		void method1() {
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer3.this.value);
		}
	}
}

class Exercise4 {
	public static void main(String[] args) {
		Outer3 out3 = new Outer3();
		Outer3.Inner3 inner = out3.new Inner3();
		inner.method1();
	}
}
