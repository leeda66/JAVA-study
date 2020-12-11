import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.Vector;

public class ListTest extends JFrame{
	
	Vector<String> v;
	JTextField txt1;
	JTextField txt2;
	JList<String> list;
	int ind;
	
	
	public ListTest() {
		setTitle("리스트 테스트"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane(); 
		c.setLayout(new BorderLayout());
		
		v = new Vector<String>();
		
		list = new JList<String>(v);
		list.setVisibleRowCount(5);
		list.addListSelectionListener(new ListListener());
	
		JPanel topPan, midPan, bottomPan;
		
		topPan = new JPanel();
		txt1 = new JTextField(25);
		topPan.add(txt1);
		
		
		bottomPan = new JPanel();
		bottomPan.setLayout(new FlowLayout());
		
		midPan = new JPanel();
		midPan.add(new JScrollPane(list));
		
		txt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				v.add(txt1.getText());
				list.setListData(v);
				txt1.setText("");
			}
		});
		
		txt2 = new JTextField(13);
		JButton btnre = new JButton("수정");
		
		btnre.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				JButton btn = (JButton)e.getSource(); 
				if(btn.getText().equals("수정")){
					v.remove(ind);
					v.add(ind,txt2.getText());
					list.setListData(v);
				}
			} 
		});
		
		JButton btndel = new JButton("삭제");
		
		btndel.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				JButton btn = (JButton)e.getSource(); 
				if (btn.getText().equals("삭제")) {
					v.remove(ind);
					list.setListData(v);
					txt2.setText("");
				}
			} 
		});
		
		bottomPan.add(txt2);
		bottomPan.add(btnre);
		bottomPan.add(btndel);

		c.add(topPan,BorderLayout.NORTH);
		c.add(midPan,BorderLayout.CENTER);
		c.add(bottomPan,BorderLayout.SOUTH);
		
		setSize(400,200); 
		setVisible(true);
	}
	class ListListener implements ListSelectionListener{
		public void valueChanged(ListSelectionEvent e) {
			String name = (String)list.getSelectedValue();
			
			ind = list.getSelectedIndex();
			if(ind != -1) {
				txt2.setText(name);
			}
		}
	}
	
	
	public static void main(String[] args) {
		new ListTest();
	}

}

