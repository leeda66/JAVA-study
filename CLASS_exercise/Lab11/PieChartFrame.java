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
		setTitle("파이 차트 그리기");
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
				tf[i] = new JTextField("0", 5);		// 텍스트 필드 생성
				tf[i].addActionListener(new MyActionListener());	// 각 텍스트 필드에 이벤트 리스너 등록
				add(new JLabel(itemName[i]));	 // 라벨 등록
				add(tf[i]);	// 텍스트 필드 등록
			}
		}
		
		private class MyActionListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) { // <Enter> 키 처리
				JTextField t = (JTextField)e.getSource();
				int n;
				
				try { // 입력 값의 오류를 검사하여 잘못된 값이 입력되지 않도록 함. 
					n = Integer.parseInt(t.getText());
				}catch(NumberFormatException ex) {
					t.setText("0");
					return;
				}
				
				// 각 텍스트필드에 입력된 값들을 읽어와서 
				String sa= tf[0].getText();
				int ia = Integer.parseInt(sa);
				//String으로 받은 것을 int 로 바꿔줘야!
				
				String sb= tf[1].getText();
				int ib = Integer.parseInt(sb);
				
				String sc= tf[2].getText();
				int ic = Integer.parseInt(sc);
				
				String sd= tf[3].getText();
				int id = Integer.parseInt(sd);
				
				
				// 백분율과, 차트를 그리기 위한 angle 계산하는 코드 작성. 
				double numSum = ia+ib+ic+id;
				
				//앞에 double이나 int를 적으면!! 이곳에서만 사용되는 변수가 다시 생성되는 것 처리됨.
				//전체에서 다 사용하는 변수 맨 위에서 선언, 초기화 하고 아래에서 바로 사용 -> 전체에 적용되는 값이 되도록
				 pa = ia / numSum*100;
				 pb = ib / numSum*100;
				 pc = ic / numSum*100;
				 pd = id / numSum*100;
				
				 Aa = pa/100*360;
				 Ab = pb/100*360;
				 Ac = pc/100*360;
				 Ad = pd/100*360;
						
				chartPanel.repaint();	// 계산이 끝나면 변경된 계산 결과를 차트에 반영하기 위한 repaint() 호출 
			}
		}
	}
	
	private class ChartPanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			// 각 항목에 대해 항목명과 백분율을 나타내는 문자열 그리기

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
			

			// 각 항목에 대한 비율에 따라 파이 차트 그리기 
			

		}	
	}	
	public static void main(String [] args) {
		new PieChartFrame();
	}
} 