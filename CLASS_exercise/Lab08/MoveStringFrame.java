import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveStringFrame extends JFrame{
	
	private JLabel lab= new JLabel();
	int i=0;
	public MoveStringFrame() {
		setTitle("Left키로 문자열 왼쪽으로 회전");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		String s="Love Java";
		int num = s.length();
		lab.setText(s);
		c.add(lab);

		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT){
					if(i == 9) 
						i = 0;
					++i;
					String s1 = s.substring(i, num);
					s1 = s1.concat(s.substring(0,i));
					lab.setText(s1);
				}
			}
		});
		
		setSize(350,150);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		
		new MoveStringFrame();
	}

}
