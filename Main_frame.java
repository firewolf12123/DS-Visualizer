import java.awt.*;
import javax.swing.*;

public class Main_frame extends JFrame{
	
	private User_panel userP;
	private Displaying_panel displayP;
	private ToolBar tBar;
	private JScrollPane scroll;
	public Main_frame()
	{
		super("Data Structure Visualizer");
		
		userP = new User_panel();
		displayP = new Displaying_panel();
		tBar = new ToolBar();
		
		scroll = new JScrollPane(displayP, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		setLayout(new BorderLayout());
		add(userP, BorderLayout.WEST);
		add(scroll, BorderLayout.CENTER);
		add(tBar, BorderLayout.NORTH);

		setSize(new Dimension(1000, 800));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
