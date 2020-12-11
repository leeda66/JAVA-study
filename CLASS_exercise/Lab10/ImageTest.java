import javax.swing.*;
import java.awt.*;
//예제 12-7&8

public class ImageTest extends JFrame{
	
	private MyPanel panel  = new MyPanel();
	
	public ImageTest() {
		setTitle("패털의 크기에 맞추어 이미지 그리기");
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
			//이미지의 (31, 32)에서 (41, 42)의 영역을 패널상의 (11, 12)에서 (21, 22)의 영역으로 확장하여 그린다.
			//g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
			
			//getWidth()를 하면 무조건 setSize의 width가 받아진다. 좌표가 어디든, 이미지img의 width를 받고싶으면 img.getWidth(this)를 받아야 한다. 
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
