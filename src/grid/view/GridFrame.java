package grid.view;

import javax.swing.JFrame;
import grid.controller.GridController;

public class GridFrame extends JFrame
{
	private GridController baseController;
	private GridPanel appPanel;
	
	public GridFrame(GridController baseController)
	{
		
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);;
		this.setSize(new Dimension()));
		this.setTitle(title);
		this.setVisible(true);
	}
}
