import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel.*;

public class GUI extends JFrame{

	JPanel panel;
	
	JTextField textField;
	
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	
	JButton buttonPlus;
	JButton buttonMinus;
	JButton buttonMultiply;
	JButton buttonDivide;
	JButton buttonEquals;
	JButton buttonComa;
	
	JButton buttonMC;
	JButton buttonMR;
	JButton buttonMS;
	JButton buttonMPlus;
	JButton buttonMMinus;
	JButton buttonBackspace;
	JButton buttonCE;
	JButton buttonC;
	JButton buttonPlusMinus;
	JButton buttonSQRT;
	JButton buttonPercentage;
	JButton buttonDivideBy;
	
	public GUI()
	{
		super("Calculator by Marcin");
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

		
		
		textField = new JTextField("Oi Fefêzinha :) :*", 10);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 5;
		c.gridheight = 1;
		panel.add(textField , c);
		
		
		
		button0 = new JButton("0");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 6;
		c.gridwidth = 2;
		c.gridheight = 1;
		panel.add(button0 , c);
		
		button1 = new JButton("1");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 5;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(button1 , c);
		
		button2 = new JButton("2");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 5;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(button2 , c);
		
		button3 = new JButton("3");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 5;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(button3 , c);
		
		button4 = new JButton("4");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(button4 , c);
		
		button5 = new JButton("5");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(button5 , c);
		
		button6 = new JButton("6");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 4;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(button6 , c);
		
		button7 = new JButton("7");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(button7 , c);
		
		button8 = new JButton("8");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(button8 , c);
		
		button9 = new JButton("9");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(button9 , c);
		
		
		
		buttonPlus = new JButton("+");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 6;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonPlus , c);
		
		buttonMinus = new JButton("-");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 5;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonMinus , c);
		
		buttonMultiply = new JButton("*");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 4;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonMultiply , c);
		
		buttonDivide = new JButton("/");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonDivide , c);
		
		buttonEquals = new JButton("=");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 4;
		c.gridy = 5;
		c.gridwidth = 1;
		c.gridheight = 2;
		panel.add(buttonEquals , c);
		
		
		
		buttonMC = new JButton("MC");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonMC , c);
		
		buttonMR = new JButton("MR");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonMR , c);
		
		buttonMS = new JButton("MS");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonMS , c);
		
		buttonMPlus = new JButton("M+");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonMPlus , c);
		
		buttonMMinus = new JButton("M-");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonMMinus , c);
		
		buttonBackspace = new JButton("←");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonBackspace , c);
		
		buttonCE = new JButton("CE");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonCE , c);
		
		buttonC = new JButton("C");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonC , c);
		
		buttonPlusMinus = new JButton("±");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonPlusMinus , c);
		
		buttonSQRT = new JButton("√");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonSQRT , c);
		
		buttonPercentage = new JButton("%");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 3;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonPercentage , c);
		
		buttonDivideBy = new JButton("1/x");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 4;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonDivideBy , c);
		
		buttonComa = new JButton(",");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 6;
		c.gridwidth = 1;
		c.gridheight = 1;
		panel.add(buttonComa , c);
		
				
		panel.setBackground(Color.ORANGE);
		panel.setSize(300,300);
		panel.setVisible(true);
		
		add(panel);
	}
	
}
