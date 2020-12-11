import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PieChartFrame extends JFrame {
	
	private int [] data = {0,0,0,0};
	private int [] arcAngle = new int [4];
	private Color [] color = {Color.RED, Color.BLUE, Color.MAGENTA, Color.ORANGE};
	private String [] itemName = {"apple", "cherry", "strawberry", "prune"};
	private JTextField [] tf = new JTextField [4];
	private ChartPanel chartPanel = new ChartPanel();
	double pa=0; double pb=0; double pc=0; double pd=0;
	double Aa=0; double Ab=0; double Ac=0; double Ad=0;
	
	public PieChartFrame() {
		setTitle("���� ��Ʈ �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new InputPanel(), BorderLayout.NORTH);
		c.add(chartPanel, BorderLayout.CENTER);		
		setSize(500,350);
		setVisible(true);
	}
	
	private class InputPanel extends JPanel {
		public InputPanel() {
			this.setBackground(Color.LIGHT_GRAY);
			for(int i=0; i<tf.length; i++) {
				tf[i] = new JTextField("0", 5);		// �ؽ�Ʈ �ʵ� ����
				tf[i].addActionListener(new MyActionListener());	// �� �ؽ�Ʈ �ʵ忡 �̺�Ʈ ������ ���
				add(new JLabel(itemName[i]));	 // �� ���
				add(tf[i]);	// �ؽ�Ʈ �ʵ� ���
			}
		}
		
		private class MyActionListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) { // <Enter> Ű ó��
				JTextField t = (JTextField)e.getSource();
				int n;
				
				try { // �Է� ���� ������ �˻��Ͽ� �߸��� ���� �Էµ��� �ʵ��� ��. 
					n = Integer.parseInt(t.getText());
				}catch(NumberFormatException ex) {
					t.setText("0");
					return;
				}
				
				// �� �ؽ�Ʈ�ʵ忡 �Էµ� ������ �о�ͼ� 
				String sa= tf[0].getText();
				int ia = Integer.parseInt(sa);
				//String���� ���� ���� int �� �ٲ����!
				
				String sb= tf[1].getText();
				int ib = Integer.parseInt(sb);
				
				String sc= tf[2].getText();
				int ic = Integer.parseInt(sc);
				
				String sd= tf[3].getText();
				int id = Integer.parseInt(sd);
				
				
				// �������, ��Ʈ�� �׸��� ���� angle ����ϴ� �ڵ� �ۼ�. 
				double numSum = ia+ib+ic+id;
				
				//�տ� double�̳� int�� ������!! �̰������� ���Ǵ� ������ �ٽ� �����Ǵ� �� ó����.
				//��ü���� �� ����ϴ� ���� �� ������ ����, �ʱ�ȭ �ϰ� �Ʒ����� �ٷ� ��� -> ��ü�� ����Ǵ� ���� �ǵ���
				 pa = ia / numSum*100;
				 pb = ib / numSum*100;
				 pc = ic / numSum*100;
				 pd = id / numSum*100;
				
				 Aa = pa/100*360;
				 Ab = pb/100*360;
				 Ac = pc/100*360;
				 Ad = pd/100*360;
						
				chartPanel.repaint();	// ����� ������ ����� ��� ����� ��Ʈ�� �ݿ��ϱ� ���� repaint() ȣ�� 
			}
		}
	}
	
	private class ChartPanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			// �� �׸� ���� �׸��� ������� ��Ÿ���� ���ڿ� �׸���

			g.setColor(Color.red);
			g.drawString(("apple "+ (int)pa +"%"), 30, 30);
			g.fillArc(150, 100, 80, 80, 0, (int)Aa);
			
			g.setColor(Color.blue);
			g.drawString(("cherry "+ (int)pb +"%"), 130, 30);
			g.fillArc(150, 100, 80, 80, (int)Aa, (int)Ab);
			
			g.setColor(Color.magenta);
			g.drawString(("strawberry "+ (int)pc +"%"), 230, 30);
			g.fillArc(150, 100, 80, 80, (int)(Aa+Ab), (int)Ac);
			
			g.setColor(Color.ORANGE);
			g.drawString(("prune "+ (int)pd +"%"),350, 30);
			g.fillArc(150, 100, 80, 80, (int)(Aa+Ab+Ac), (int)Ad);
			

			// �� �׸� ���� ������ ���� ���� ��Ʈ �׸��� 
			

		}	
	}	
	public static void main(String [] args) {
		new PieChartFrame();
	}
} 