
public class Buyer {

	protected int money;
	
	public Buyer(int money) {
		this.money = money;
	}
	
	public void buy(Item item, int num) {
		System.out.println(item.toString() + "=>"+num+"�� ����");
		if(item.price*num > this.money) {
			System.out.println("�ܾ� ����: " + money);
		}
		else {
			money = money - item.price*num;
			System.out.println("���� �Ϸ� �� �ܾ� : " + money);
		}
	}
	

}
