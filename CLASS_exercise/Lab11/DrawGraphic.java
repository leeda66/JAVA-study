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
		setTitle("그래픽 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		createToolBar();	// createToolBar 코드는 변경할 필요 없음(확인만 해보세요) 
		gpanel = new MyPanel();
		c.add(gpanel);
		setSize(500,400);
		setVisible(true);
	}
	
	// 툴바를 생성하여 컨텐츠팬에 부착한다.
	private void createToolBar() {
		// 툴바 생성
		JToolBar toolBar = new JToolBar("Menu"); // 툴바의 이름 "Kitae Menu"
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		// 툴바에 메뉴로 사용할 컴포넌트를 삽입한다.
		toolBar.add(new JLabel("도형"));
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
		toolBar.add(new JLabel("색 선택"));		
		btnColor = new JButton(new ImageIcon("images/color.png"));
		btnColor.addActionListener(this);
		toolBar.add(btnColor);	
		toolBar.add(new JPanel());
		
		// 툴바를 컨텐츠팬의 NORTH에 부착한다.
		c.add(toolBar, BorderLayout.NORTH);
	}
	public void actionPerformed(ActionEvent e){
				
		//액션에 대해서 버튼만
		JButton b = (JButton)e.getSource();
		
		//+ 버튼 뿐만 아니라 여러개의 액션을 사용할 때(버튼도 당연 포함)
		//Object b = e.getSource();
		
		// 이벤트를 발생시킨 버튼 객체를 구분하여 모드 설정.
		if(b == btnLine)	mode = 1;
		
		else if(b==btnRect)		mode = 2;
		
		else if(b==btnOval)		mode = 3;
		
		else if(b==btnTriangle)		mode = 4;
		// 선이면 mode를 1로 설정, 사각형이면 2, 타원이면 3, 삼각형이면 4로 설정한다. 
		
			
		else if(b==btnColor)
		// 마지막으로 모드가 색선택(btnColor) 버튼이라면 다음 코드 작성.
		// 컬러선택기 다이얼로그 창으로부터 색을 받아와서 설정. 
			color = JColorChooser.showDialog(null, "Color", Color.black);
		
		repaint();
		
	}
	class MyPanel extends JPanel {
		int x1, y1, x2, y2, sx, sy, w, h;
		
		public MyPanel(){
			// 그림을 그리기 위해 마우스 이벤트를 받아들이기 위한 리스너 등록
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
			// 그래픽 객체에 color 설정. 
			// 각 그리기 모드에 대해 그림 그리는 코드 작성
	// mode 가 1이라면 선, mode가 2라면 사각형, 3이라면 타원, 4라면 삼각형으로 그린다. 
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
