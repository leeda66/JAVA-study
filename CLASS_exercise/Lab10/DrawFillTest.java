import java.awt.*;
import javax.swing.*;
import java.awt.*;

public class DrawFillTest extends JFrame{
	
	public DrawFillTest() {
		setTitle("Draw Fill 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1, 3);
		grid.setVgap(1);
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		MyPanel1 mp1 = new MyPanel1();
		MyPanel2 mp2 = new MyPanel2();
		MyPanel3 mp3 = new MyPanel3();
		c.add(mp1);
		c.add(mp2);
		c.add(mp3);
		
		setSize(750, 300);
		setVisible(true);
		
	}
	
	class MyPanel1 extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRoundRect(20, 20, 180, 180, 20, 20);
			g.setColor(Color.red);
			g.fillRect(30, 30, 30, 150);
			g.setColor(Color.green);
			g.fillRect(70, 30, 30, 80);
			g.setColor(Color.blue);
			g.fillRect(110, 30, 30, 40);
			g.setColor(Color.pink);
			g.fillRect(150, 30, 30, 90);
		}
	}
	
	class MyPanel2 extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRoundRect(20, 20, 180, 180, 20, 20);
			g.setColor(Color.green);
			g.fillArc(30, 30, 100, 100, 0, 45);
			g.setColor(Color.red);
			g.fillArc(30, 30, 100, 100, 45,45);
			g.setColor(Color.blue);
			g.fillArc(30, 30, 100, 100, 90,20);
			g.setColor(Color.yellow);
			g.fillArc(30, 30, 100, 100, 110,70);
			g.setColor(Color.magenta);
			g.fillArc(30, 30, 100, 100, 180, 180);
		}
	}
	
	class MyPanel3 extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRoundRect(20, 20, 180, 180, 20, 20);
			int x[] = {82, 67, 25, 58, 49, 83, 115, 104, 133, 95};
			int y[] = {19, 58, 63, 91, 132, 110, 132, 91, 63, 58};
			g.setColor(Color.orange);
			g.fillPolygon(x, y, 10);
			
		}
	}
	

	public static void main(String[] args) {
		new DrawFillTest();

	}

}
