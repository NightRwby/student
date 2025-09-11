package Ch01;

class Buyer{
	
	private int myMoney;
	private int appleCnt;
	public Buyer(int myMoney, int appleCnt) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
	}
	
	@Override
	public String toString() {
		return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
	}
	
	void payment(Seller 사과장수, int money) {
		if((myMoney-=money)>0) {
			int cnt= 사과장수.receive(money);
			this.appleCnt+=cnt;			
		}
		
		
	}
}

class Seller{
	
	private int myMoney;
	private int appleCnt;
	private int price;
	public Seller(int myMoney, int appleCnt , int price) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Seller [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}
	public int receive(int money) {
		this.myMoney+=money;
		int cnt = money/this.price;
		appleCnt-=cnt;
		return cnt;
	}
	
}

public class C11Ex {
	public static void main(String[] args) {
		//
		Buyer 홍길동 = new Buyer(10000, 0);
		Buyer 티모 = new Buyer(20000, 0);
		
		Seller 사과장수1 = new Seller(50000, 100,1000);
		
		홍길동.payment(사과장수1, 3000);
		티모.payment(사과장수1, 8000);
		System.out.println(홍길동);
		System.out.println(티모);
		System.out.println(사과장수1);
		
		
	}
}
