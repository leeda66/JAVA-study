import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class TrafficTest extends JFrame{
	public TrafficTest(){
		setTitle("신호등");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new MyPanel());
		setSize(200, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		JButton btn;
		int mode = 0; // 0이면 R, 1이면 G, 2이면 Y
		
		public MyPanel(){
			btn = new JButton("신호 변경");
			// 버튼이 눌려질때마다 모드 변경하는 코드 작성 
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					//if(b.getText().equals("신호 변경"))
					//텍스트 확인 안하고 그냥 눌러지는것을 확인하고싶은거면, ActionListener  자체가 action 반응했다는 것임
					mode += 1;
					
					//repaint를 해야 아래 부분이랑 연결되는것임!!!!!
					repaint();

				}
			});



			setLayout(new BorderLayout());
			add(btn, BorderLayout.SOUTH);
		}
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.RED);
			
		
			
			// 모드에 따라서 해당 신호등의 색으로 설정하고 색칠하는 코드 작성
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
