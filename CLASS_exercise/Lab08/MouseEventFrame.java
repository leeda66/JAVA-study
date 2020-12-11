import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventFrame extends JFrame{
	public MouseEventFrame() {
		setTitle("마우스 올리기 내리기");
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
				lab.setText("사랑해");
			}
		});
		
		setSize(250,150);
		setVisible(true);
	}		

	public static void main(String[] args) {
		
		new MouseEventFrame();
	}

}
