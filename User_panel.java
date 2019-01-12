import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class User_panel extends JPanel{
	
	private JLabel insertLab;
	private JTextField insetTex;
	private JButton insertBut;
	public User_panel()
	{
		insertLab = new JLabel("insert");
		
		insetTex = new JTextField();
		insetTex.setPreferredSize(new Dimension(60,20));
		
		insertBut = new JButton("insert");
		
		
		add(insertLab);
		add(insetTex);
		add(insertBut);
		
		
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(200, 800));
		setBackground(Color.gray);
	}
}
