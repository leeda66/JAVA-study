import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class TrafficTest extends JFrame{
	public TrafficTest(){
		setTitle("��ȣ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new MyPanel());
		setSize(200, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		JButton btn;
		int mode = 0; // 0�̸� R, 1�̸� G, 2�̸� Y
		
		public MyPanel(){
			btn = new JButton("��ȣ ����");
			// ��ư�� ������������ ��� �����ϴ� �ڵ� �ۼ� 
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					//if(b.getText().equals("��ȣ ����"))
					//�ؽ�Ʈ Ȯ�� ���ϰ� �׳� �������°��� Ȯ���ϰ�����Ÿ�, ActionListener  ��ü�� action �����ߴٴ� ����
					mode += 1;
					
					//repaint�� �ؾ� �Ʒ� �κ��̶� ����Ǵ°���!!!!!
					repaint();

				}
			});



			setLayout(new BorderLayout());
			add(btn, BorderLayout.SOUTH);
		}
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.RED);
			
		
			
			// ��忡 ���� �ش� ��ȣ���� ������ �����ϰ� ��ĥ�ϴ� �ڵ� �ۼ�
			if(mode%3 == 0) {
				g.setColor(Color.RED);
				g.fillOval(50, 50, 100, 100);
			}
			
			else if(mode%3 == 1) {
				g.setColor(Color.YELLOW);
				g.fillOval(50, 150, 100, 100);
			}
			
			else if(mode%3 == 2) {
				g.setColor(Color.GREEN);
				g.fillOval(50, 250, 100, 100);
			}
			
			
			
			g.setColor(Color.black);
			g.drawOval(50, 50, 100, 100);
			g.drawOval(50, 150, 100, 100);
			g.drawOval(50, 250, 100, 100);
		}
	}
	public static void main(String[] args) {
		new TrafficTest();
	}
}
