
public class Rectangle {
	
	int x, y, width, height;
	
	
	public Rectangle(int x2, int y2, int width2, int height2) {
		x=x2; y=y2; width = width2; height = height2;
	}

	public int square() {
		return width*height;
	}

	public void show() {
		System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");
	}

	public boolean contains(Rectangle r) {
		if((this.x<r.x) && (this.y<r.y) && (this.x+this.width>r.x+r.width) && (this.y+this.height>r.y+r.height)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s�� ������"+ s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�."); //��µǾ��
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�."); //��µ��� �ʾƾ�

	}

}
