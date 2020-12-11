import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;


public class FontTest extends JFrame{
	
	private JRadioButton [] radioB = new JRadioButton[3];
	private String [] radioS = {"±¼¸²","µ¸À½","±Ã¼­"};
	
	private JCheckBox [] checkB = new JCheckBox[2];
	private String [] checkS = {"BOLD", "ITALIC"};
	
	private String [] sizes = {"10", "15", "20", "25", "30"};
	
	JTextField tf = new JTextField(15);
	
	JLabel end = new JLabel("Hello JAVA !");
	
	String fontS;
	int fontSize = 20;
	int font = 0;
	
	public FontTest() {
		setTitle("Font ¼³Á¤");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(10, 10));
		
		JPanel leftPan, endPan, rightPan;
		
		leftPan = new JPanel();
		leftPan.setLayout(new GridLayout(0,1,5,5));
		leftPan.add(new JLabel("Font ¼³Á¤"));
		leftPan.add(new JLabel("Style ¼³Á¤"));
		leftPan.add(new JLabel("Size ¼³Á¤"));
		leftPan.add(new JLabel("Text ³»¿ë"));
		
		endPan = new JPanel();
		Border endBorder = BorderFactory.createTitledBorder("Font ¼³Á¤ °á°ú");
		endPan.setBorder(endBorder);
		endPan.add(end);
		
		rightPan = new JPanel();
		rightPan.setLayout(new GridLayout(0, 1, 5, 5));
		JPanel fontPan, styPan;
		
		fontPan = new JPanel();
		styPan = new JPanel();
		ButtonGroup Bgroup = new ButtonGroup();
		for(int i=0; i<radioB.length; i++) {
			radioB[i] = new JRadioButton(radioS[i]);
			Bgroup.add(radioB[i]);
			fontPan.add(radioB[i]);
			radioB[i].addItemListener(new radioBListener());
			
		}
		
		for(int i=0; i<checkB.length; i++) {
			checkB[i] = new JCheckBox(checkS[i]);
			styPan.add(checkB[i]);
		
			checkB[i].addItemListener(new checkBlistener()); 
			} 
			

		
		JComboBox<String> ComboS = new JComboBox<String>(sizes); 
		
		rightPan.add(fontPan);
		rightPan.add(styPan);
		rightPan.add(ComboS);
		
		ComboS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> comb = (JComboBox<String>)e.getSource();
						int getindex = comb.getSelectedIndex();
						fontSize = Integer.valueOf(sizes[getindex]);
				end.setFont(new Font(fontS, font, fontSize));;
			}
			
		});
		
		rightPan.add(tf);
		
		tf.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			end.setText(tf.getText());
		}	
		});
		
		c.add(leftPan, BorderLayout.WEST);
		c.add(rightPan, BorderLayout.CENTER);
		c.add(endPan, BorderLayout.SOUTH);
		
		setSize(380,380); 
		setVisible(true);
		
		
		
		}
		
		
		class radioBListener implements ItemListener{
			public void itemStateChanged(ItemEvent e) { 
				if(e.getStateChange() == ItemEvent.DESELECTED) return;
				if(radioB[0].isSelected()) fontS = "±¼¸²"; 
				else if(radioB[1].isSelected()) fontS = "µ¸¿ò"; 
				else fontS = "±Ã¼­";
				end.setFont(new Font(fontS,font,fontSize));
				} 
		
	
	}
		
		class checkBlistener implements ItemListener{
			public void itemStateChanged(ItemEvent e) { 
				if(e.getStateChange() == ItemEvent.SELECTED) { 
					if(e.getItem() == checkB[0]) font += Font.BOLD; 
					if(e.getItem() == checkB[1])  font += Font.ITALIC;
					end.setFont(new Font(fontS,font, fontSize));
				}
				else {
					if(e.getItem() == checkB[0]) font -= Font.BOLD; 
					if(e.getItem() == checkB[1])  font -= Font.ITALIC;
					end.setFont(new Font(fontS,font, fontSize));
				}
			} 
		}
		
		public static void main(String[] args) {
			new FontTest();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	