import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JToolBar;

public class ToolBar extends JToolBar{
	public ToolBar()
	{
		JButton fileBut = new JButton("Export");
		JButton helpBut = new JButton("Help");
		JComboBox datatype = new JComboBox(new String[] {"Binary search tree"});
		
		add(fileBut);
		addSeparator();
		add(datatype);
		addSeparator();
		add(helpBut);
		for(int i = 0 ; i < 50; i++)
		{
			addSeparator();
		}
	}
}
