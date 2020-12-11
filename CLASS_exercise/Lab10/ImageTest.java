import javax.swing.*;
import java.awt.*;
//���� 12-7&8

public class ImageTest extends JFrame{
	
	private MyPanel panel  = new MyPanel();
	
	public ImageTest() {
		setTitle("������ ũ�⿡ ���߾� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(1000,600);
		setVisible(true);
		
	}
	
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("back.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			//g.drawImage(img, 11, 12, 21, 22, 31, 32, 41, 42, this)
			//�̹����� (31, 32)���� (41, 42)�� ������ �гλ��� (11, 12)���� (21, 22)�� �������� Ȯ���Ͽ� �׸���.
			//g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
			
			//getWidth()�� �ϸ� ������ setSize�� width�� �޾�����. ��ǥ�� ����, �̹���img�� width�� �ް������ img.getWidth(this)�� �޾ƾ� �Ѵ�. 
			g.drawImage(img, 0,0,(getWidth()/2-5), (getHeight()/2-5), 0,0, (img.getWidth(this)/2), (img.getHeight(this)/2), this);
			g.drawImage(img, (getWidth()/2+5), 0, getWidth(), (getHeight()/2-5),(img.getWidth(this)/2), 0, img.getWidth(this), img.getHeight(this)/2, this);
			g.drawImage(img, 0,(getHeight()/2+5),(getWidth()/2-5), getHeight(), 0,(img.getHeight(this)/2), (img.getWidth(this)/2), img.getHeight(this), this);
			g.drawImage(img, (getWidth()/2+5),(getHeight()/2+5), getWidth(), getHeight(),(img.getWidth(this)/2), (img.getHeight(this)/2), img.getWidth(this), img.getHeight(this), this);
			
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		new ImageTest();

	}

}
