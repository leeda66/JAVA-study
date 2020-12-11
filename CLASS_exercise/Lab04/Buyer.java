
public class Buyer {

	protected int money;
	
	public Buyer(int money) {
		this.money = money;
	}
	
	public void buy(Item item, int num) {
		System.out.println(item.toString() + "=>"+num+"개 구매");
		if(item.price*num > this.money) {
			System.out.println("잔액 부족: " + money);
		}
		else {
			money = money - item.price*num;
			System.out.println("구매 완료 후 잔액 : " + money);
		}
	}
	

}
