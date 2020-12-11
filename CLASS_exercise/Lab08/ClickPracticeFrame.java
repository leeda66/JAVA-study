import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickPracticeFrame extends JFrame{
	public ClickPracticeFrame() {
		setTitle("클릭 연습 용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(null);
		JLabel lab = new JLabel("C");	
		lab.setLocation(100, 100);
		lab.setSize(50,50);
		c.add(lab);
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				lab.setLocation((int)(Math.random()*c.getWidth()),(int)(Math.random()*c.getHeight()));
			}
		});
		
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ClickPracticeFrame();
	}

}
