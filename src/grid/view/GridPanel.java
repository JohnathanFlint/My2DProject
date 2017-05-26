package grid.view;

import javax.swing.JPanel;
import grid.controller.GridController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GridPanel extends JPanel
{
	
	private JTextField rowField;
	private JTextField columnField;
	private JTextField inputField;
	private JLabel inputLabel;
	private JLabel rowLabel;
	private JLabel columnLabel;
	private JButton submitButton;
	private SpringLayout baseLayout;
	private GridController baseController;
	
	public GridPanel(GridController baseController)
	{
		
	}
	
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.updateBooks(rowField.getText(), columnField.getText(), inputField.getText());
				repaint();
			}
		});
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
}
