package grid.controller;

import javax.swing.JOptionPane;
import grid.view.GridFrame;

public class GridController
{
	private GridFrame appFrame;
	
	public GridController()
	{
		appFrame = new GridFrame(this);
	}
	
	public void updateBooks(String row, String col, String value)
	{
		if(isValid(row) && isValid(col) && isValid(value))
		{
			//change to Strings
			grid[Integer.parseInt(row)][Integer.parseInt(col)].setBooksTitle(Integer.parseInt(value));
		}
	}
	
	private boolean isValid(String temp)
	{
		try
		{
			Integer.parseInt(temp);
			return true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(appFrame, "Use ints silly");
			return false;
			
		}
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame,  "Hey Look, it's my 2D creation.");
	}
}
