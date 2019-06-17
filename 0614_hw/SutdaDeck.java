
public class SutdaDeck {
	final int CARD_NUM = 30;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num = i+1;
			int check = num%10;
			boolean Multiplesof3 = (i<30) && (check == 3 || check == 6 || check == 9);
			cards[i] = new SutdaCard(num, Multiplesof3);
		}
	}
}
