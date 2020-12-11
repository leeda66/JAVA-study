import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDraggingFrame extends JFrame{
	
	public MouseDraggingFrame() {
		setTitle("µå·¡±ëµ¿¾È YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setBackground(Color.GREEN);

		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				c.setBackground(Color.YELLOW);
			}
			public void mouseReleased(MouseEvent e) {
				c.setBackground(Color.GREEN);
			}
		});
		
		setSize(400, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseDraggingFrame();

	}

}