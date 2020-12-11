import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class TextSizeController extends JFrame{
	JTextArea txtA = new JTextArea(6, 30);
	JSlider slid = new JSlider(JSlider.HORIZONTAL, 0, 100, 0); 
	String str;
	int leng = 0;
	
	public TextSizeController() {
		
		setTitle("TextArea Practice Frame"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane(); 
		c.setLayout(new FlowLayout());
		
		txtA.addKeyListener(new KeyListener());
		c.add(txtA);
 
		slid.setPaintLabels(true); 
		slid.setPaintTicks(true); 
		slid.setPaintTrack(true); 
		slid.setMajorTickSpacing(20); 
		slid.setMinorTickSpacing(5);
		slid.addChangeListener(new ChangingListener()); 
		c.add(slid);
		
		setSize(400,200); 
		setVisible(true);
		txtA.requestFocus();

	}
	
	class KeyListener extends KeyAdapter { 
		public void keyTyped(KeyEvent e) { 
			str = txtA.getText();
			leng = str.length();
			slid.setValue(leng);
		}
	}
	
	class ChangingListener implements ChangeListener{
		public void stateChanged(ChangeEvent e) {
			str = txtA.getText();
			leng = slid.getValue();
			if(leng < str.length()) txtA.setText(str.substring(0,leng));
		}
	}
	

	public static void main(String[] args) {
		new TextSizeController();
	}
	
}



