import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventFrame extends JFrame{
	public MouseEventFrame() {
		setTitle("���콺 �ø��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JLabel lab = new JLabel("Love Java");
		c.add(lab);

		lab.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				lab.setText("Love Java");
			}
			
			public void mouseExited(MouseEvent e) {
				lab.setText("�����");
			}
		});
		
		setSize(250,150);
		setVisible(true);
	}		

	public static void main(String[] args) {
		
		new MouseEventFrame();
	}

}
