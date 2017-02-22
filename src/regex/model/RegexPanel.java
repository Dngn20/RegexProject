package regex.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import regex.controller.RegexController;

public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	private JTextField numberField;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField emailField;
	private JButton button;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel emailLabel;
	private JLabel numberLabel;
	
	
	
	public RegexPanel(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.numberField = new JTextField(25);
		this.firstNameField = new JTextField(25);
		this.emailLabel = new JLabel("Email");
		this.emailField = new JTextField(25);
		this.lastNameField = new JTextField(25);
		this.firstNameLabel = new JLabel("First Name");
		this.lastNameLabel = new JLabel("Last Name");
		this.numberLabel = new JLabel("Number");
		this.button = new JButton("Button");
		
		
		setupListeners();
		setupPanel();
		setupLayout();
		
	}
	
	private void setupListeners()
	{
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				
			}
		});
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.add(numberField);
		this.add(firstNameField);
		this.add(lastNameField);
		this.add(emailField);
		this.add(button);
		this.add(lastNameLabel);
		this.add(firstNameLabel);
		this.add(numberLabel);
		this.add(emailLabel);
		this.add(button);
	}


	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, 108, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 32, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameField, 0, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.WEST, emailField, 0, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.EAST, lastNameField, 0, SpringLayout.EAST, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameField, 6, SpringLayout.SOUTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameLabel, 56, SpringLayout.SOUTH, numberField);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameLabel, 0, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameField, 16, SpringLayout.SOUTH, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameLabel, 46, SpringLayout.SOUTH, firstNameField);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameLabel, 0, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 32, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -6, SpringLayout.NORTH, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, emailField, 6, SpringLayout.SOUTH, emailLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, emailLabel, 26, SpringLayout.SOUTH, lastNameField);
		baseLayout.putConstraint(SpringLayout.WEST, emailLabel, 0, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, button, 66, SpringLayout.SOUTH, emailField);
		baseLayout.putConstraint(SpringLayout.WEST, button, 0, SpringLayout.WEST, numberField);
		
	}
}
