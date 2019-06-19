package hw_0619;

class GoodsStock {
	String goodsCode;
	int stockNum;
	
	GoodsStock(String code, int num){
		goodsCode = code;
		stockNum = num;
	}
	
	void addStock(int amount) {
		stockNum += amount;
	}
	
	int subtractStock(int amount) throws StockShortageException{
		if(stockNum < amount)
			throw new StockShortageException("��� �����մϴ�.");
		stockNum -= amount;
		return amount;
	}
	
	public static void main(String[] agrs) {
		try {
			GoodsStock goods = new GoodsStock("111",10);
			goods.subtractStock(20);
		}
		catch(StockShortageException e) {
			System.out.println(e.getMessage());
		}
	}
}

class StockShortageException extends Exception{
	StockShortageException(String errMsg){
		super(errMsg);
	}
}
