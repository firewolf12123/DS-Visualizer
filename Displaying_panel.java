import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Displaying_panel extends JPanel {
	public Displaying_panel()
	{
		setBackground(Color.white);
	}
	public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.black);
        
    }
	public int getBSTVSpace(BST_Nodes bst_n)
	{
		return bst_n.getH();
	}
	public int getBSTHSpace(int h)
	{
		if(h == 0)
		{
			return 0;
		}
		else if(h == 1)
		{
			return 1;
		}
		else
		{
			return 1 + 2*getBSTHSpace(--h);
		}
	}
	public void paintBST(BST_Nodes bst_n)
	{
		int hight = getBSTVSpace(bst_n);
		int width = getBSTHSpace(hight);
		
		setPreferredSize(new Dimension(width, hight));
		
		
	}
}
