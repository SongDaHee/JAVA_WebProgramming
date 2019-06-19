package hw_0618;

public class Bird implements Flyer{
	@Override
	public void fly() {
		System.out.println("Bird Flying");
	}
	
	@Override
	public boolean isAnimal() {
		return true;
	}
}
