import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiTest extends JFrame{
	JTextField txt1, txt2, txt3, txt4;
	
	
	public GuiTest() {
		setTitle("GUI TEST");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new BorderLayout(10, 10));
		JPanel leftPanel, centerPanel, bottomPanel;
		
		leftPanel = new JPanel();
		leftPanel.setLayout(new GridLayout(0, 1, 5, 5));
		leftPanel.add(new JLabel("이름"));
		leftPanel.add(new JLabel("학번"));
		leftPanel.add(new JLabel("전공"));
		leftPanel.add(new JLabel("연락처"));

		centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(0, 1, 5, 5));
		txt1 = new JTextField(10);
		centerPanel.add(txt1);
		txt2 = new JTextField(10);
		centerPanel.add(txt2);
		txt3 = new JTextField(10);
		centerPanel.add(txt3);
		txt4 = new JTextField(10);
		centerPanel.add(txt4);
		
		bottomPanel = new JPanel();	
		JButton btn1 = new JButton("확인");
		btn1.addActionListener(new MyActionListener1());
		JButton btn2 = new JButton("취소");
		btn2.addActionListener(new MyActionListener2());
		bottomPanel.add(btn1);
		bottomPanel.add(btn2);
		

		c.add(leftPanel, BorderLayout.WEST);
		c.add(centerPanel, BorderLayout.CENTER);
		c.add(bottomPanel, BorderLayout.SOUTH);
		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GuiTest();

	}
	
	class MyActionListener1 implements ActionListener{
//확인버튼
		@Override
		public void actionPerformed(ActionEvent arg0) {
			String s1 = txt1.getText();
			String s2 = txt2.getText();
			String s3 = txt3.getText();
			String s4 = txt4.getText();
			System.out.println(s1+"	"+s2+"	"+s3+"	"+s4);	
		}
	}
	
	
	class MyActionListener2 implements ActionListener{
//취소버튼
		@Override
		public void actionPerformed(ActionEvent arg0) {
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
			txt4.setText("");
		}	
	}
	
	
}

