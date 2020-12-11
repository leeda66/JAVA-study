import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CalcFrame extends JFrame{
	public CalcFrame() {
		setTitle("°è»ê±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton btn= new JButton("=");
		JLabel lab = new JLabel("X");
		JTextField s1 = new JTextField(6);
		JTextField s2 = new JTextField(6);
		JTextField mul = new JTextField(8);

		c.add(s1); 
		c.add(lab);
		c.add(s2);		
		c.add(btn);
		c.add(mul);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int multiple =0;
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("=")) {
					String n1 = s1.getText();
					String n2 = s2.getText();
					multiple=Integer.parseInt(n1)* Integer.parseInt(n2);
					mul.setText(""+multiple);
				}
			}
		}		);
		
		setSize(380,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CalcFrame();
	}

}

