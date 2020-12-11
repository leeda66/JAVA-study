
public class Test {

	public static void main(String[] args) {
		Buyer m = new Buyer(40000);
		m.buy((new Food("ºñºö¹ä", 5000)), 3);
		m.buy((new Food("¶ó¸é", 3000)), 2);
		m.buy((new Book("Java Programming", 7000, "ÀÚ¹Ù")), 1);
		m.buy((new Movie("ºÎ»êÇà", 8000, "¿¬»óÈ£")), 1);
		m.buy((new Food("±è¹ä", 2000)), 3);
	
	}
}
