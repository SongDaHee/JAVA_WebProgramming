package hw_0620;

class Outer {
	class Inner{
		int iv = 100;
	}
}

class Exercise2 {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		System.out.println(in.iv);
	}
}

//Outer ��ü1 = new Outer(); 
//Outer.Inner ��ü2 = ��ü1.new Inner();

