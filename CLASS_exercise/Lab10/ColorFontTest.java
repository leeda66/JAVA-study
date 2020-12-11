import javax.swing.*;
import java.awt.*;

public class ColorFontTest extends JFrame{
	private MyPanel panel = new MyPanel();

	public ColorFontTest() {
		setTitle("Color, Font ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);//������ panel �г��� ����Ʈ������ ���
		
		setSize(500, 300);
		setVisible(true);
		

	}
	
	class MyPanel extends JPanel{
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.blue);
			g.setFont(new Font("�ü�", Font.BOLD, 15));
			g.drawString("����: ���ѹα�(�ü� ��Ʈ)", 30, 30);
			
			g.setColor(Color.CYAN);
			g.setFont(new Font("����", Font.ITALIC, 20));
			g.drawString("�ּ�: ����� ��걸(���� ��Ʈ)", 30, 60);
			
			g.setColor(Color.PINK);
			g.setFont(new Font("�������", Font.PLAIN, 30));
			g.drawString("����: �̴���(������� ����)", 30	, 100);
			
			
			g.setColor(Color.orange);
			g.setFont(new Font("����", Font.PLAIN, 13));
			g.drawString("�й�: 1711745(���� ��Ʈ)", 30	, 140);
		}
		
	}

	public static void main(String[] args) {
		new ColorFontTest();
	}
}
