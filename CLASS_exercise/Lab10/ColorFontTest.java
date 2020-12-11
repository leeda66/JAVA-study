import javax.swing.*;
import java.awt.*;

public class ColorFontTest extends JFrame{
	private MyPanel panel = new MyPanel();

	public ColorFontTest() {
		setTitle("Color, Font 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);//생성한 panel 패널을 컨텐트팬으로 사용
		
		setSize(500, 300);
		setVisible(true);
		

	}
	
	class MyPanel extends JPanel{
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.blue);
			g.setFont(new Font("궁서", Font.BOLD, 15));
			g.drawString("국적: 대한민국(궁서 폰트)", 30, 30);
			
			g.setColor(Color.CYAN);
			g.setFont(new Font("돋음", Font.ITALIC, 20));
			g.drawString("주소: 서울시 용산구(돋음 폰트)", 30, 60);
			
			g.setColor(Color.PINK);
			g.setFont(new Font("맑은고딕", Font.PLAIN, 30));
			g.drawString("성명: 이다현(맑은고딕 폰드)", 30	, 100);
			
			
			g.setColor(Color.orange);
			g.setFont(new Font("바탕", Font.PLAIN, 13));
			g.drawString("학번: 1711745(바탕 폰트)", 30	, 140);
		}
		
	}

	public static void main(String[] args) {
		new ColorFontTest();
	}
}
