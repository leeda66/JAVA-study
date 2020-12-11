import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawGraphic extends JFrame implements ActionListener{
	private Container c;
	private JButton btnLine, btnRect, btnOval, btnTriangle, btnColor;
	private MyPanel gpanel;
	int mode;
	Color color;
	public DrawGraphic() {
		setTitle("�׷��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		createToolBar();	// createToolBar �ڵ�� ������ �ʿ� ����(Ȯ�θ� �غ�����) 
		gpanel = new MyPanel();
		c.add(gpanel);
		setSize(500,400);
		setVisible(true);
	}
	
	// ���ٸ� �����Ͽ� �������ҿ� �����Ѵ�.
	private void createToolBar() {
		// ���� ����
		JToolBar toolBar = new JToolBar("Menu"); // ������ �̸� "Kitae Menu"
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		// ���ٿ� �޴��� ����� ������Ʈ�� �����Ѵ�.
		toolBar.add(new JLabel("����"));
		JPanel p = new JPanel();
		btnLine = new JButton(new ImageIcon("images/line.png"));
		btnLine.addActionListener(this);
		btnRect = new JButton(new ImageIcon("images/rect.png"));
		btnRect.addActionListener(this);
		btnOval = new JButton(new ImageIcon("images/oval.png"));
		btnOval.addActionListener(this);
		btnTriangle = new JButton(new ImageIcon("images/triangle.png"));
		btnTriangle.addActionListener(this);
		p.setLayout(new GridLayout(0, 4));
		p.add(btnLine);
		p.add(btnRect);
		p.add(btnOval);
		p.add(btnTriangle);		
		toolBar.add(p);		
		
		toolBar.addSeparator();
		toolBar.add(new JLabel("�� ����"));		
		btnColor = new JButton(new ImageIcon("images/color.png"));
		btnColor.addActionListener(this);
		toolBar.add(btnColor);	
		toolBar.add(new JPanel());
		
		// ���ٸ� ���������� NORTH�� �����Ѵ�.
		c.add(toolBar, BorderLayout.NORTH);
	}
	public void actionPerformed(ActionEvent e){
				
		//�׼ǿ� ���ؼ� ��ư��
		JButton b = (JButton)e.getSource();
		
		//+ ��ư �Ӹ� �ƴ϶� �������� �׼��� ����� ��(��ư�� �翬 ����)
		//Object b = e.getSource();
		
		// �̺�Ʈ�� �߻���Ų ��ư ��ü�� �����Ͽ� ��� ����.
		if(b == btnLine)	mode = 1;
		
		else if(b==btnRect)		mode = 2;
		
		else if(b==btnOval)		mode = 3;
		
		else if(b==btnTriangle)		mode = 4;
		// ���̸� mode�� 1�� ����, �簢���̸� 2, Ÿ���̸� 3, �ﰢ���̸� 4�� �����Ѵ�. 
		
			
		else if(b==btnColor)
		// ���������� ��尡 ������(btnColor) ��ư�̶�� ���� �ڵ� �ۼ�.
		// �÷����ñ� ���̾�α� â���κ��� ���� �޾ƿͼ� ����. 
			color = JColorChooser.showDialog(null, "Color", Color.black);
		
		repaint();
		
	}
	class MyPanel extends JPanel {
		int x1, y1, x2, y2, sx, sy, w, h;
		
		public MyPanel(){
			// �׸��� �׸��� ���� ���콺 �̺�Ʈ�� �޾Ƶ��̱� ���� ������ ���
			MyMouseListener ml = new MyMouseListener();
			this.addMouseListener(ml);
			this.addMouseMotionListener(ml);
		}
		class MyMouseListener extends MouseAdapter{			
			@Override
			public void mousePressed(MouseEvent e) {
				x1 = e.getX();
				y1 = e.getY();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				draw(e);
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				draw(e);
			}
			void draw(MouseEvent e){
				x2 = e.getX();
				y2 = e.getY();
				sx = Math.min(x1, x2);
				sy = Math.min(y1, y2);
				w = Math.abs(x2-x1);
				h = Math.abs(y2-y1);
				repaint();
			}
		}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);			
			// �׷��� ��ü�� color ����. 
			// �� �׸��� ��忡 ���� �׸� �׸��� �ڵ� �ۼ�
	// mode �� 1�̶�� ��, mode�� 2��� �簢��, 3�̶�� Ÿ��, 4��� �ﰢ������ �׸���. 
			g.setColor(color);
			
			if(mode == 1) {
				g.drawLine(x1, y1, x2, y2);
				}
			
			if(mode ==2) {
				g.drawRect(sx,  sy, w, h);
			}
			
			if(mode==3) {
				g.drawOval(sx, sy, w, h);
			}
			
			if(mode==4) {
				int [] x= {x1, x2, x2-2*w};
				int [] y= {y1, y2, y2};
				g.drawPolygon(x, y, 3);
			}
			
		}
	}
	
	public static void main(String [] args) {
		new DrawGraphic();
	}
}
