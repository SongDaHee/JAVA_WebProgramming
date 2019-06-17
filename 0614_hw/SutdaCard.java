
public class SutdaCard {
	int num;
	boolean Multiplesof3;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean Multiplesof3){
		this.num = num;
		this.Multiplesof3 = Multiplesof3;
	}
	
	public String toString() {
		return num+(Multiplesof3 ? "K" : "");
	}
}
