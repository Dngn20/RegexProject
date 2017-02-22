package regex.model;

import regex.controller.*;
import javax.swing.*;
import regex.model.*;
import java.awt.*;

public class RegexFrame extends JFrame
{
	private RegexController baseController;
	private RegexPanel appPanel;
	
	public RegexFrame(RegexController baseController) 
	{
		super();
		this.baseController = baseController;
		this.appPanel = new RegexPanel(baseController);
		
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension (900, 600));
		this.setTitle("The Simple Games");
		this.setSize(new Dimension(900, 600));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
