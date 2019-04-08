package reference;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DPanel implements ActionListener{
	
	JLabel writing = new JLabel("Radio Button Time");
	
	JRadioButton red = new JRadioButton("red");
	JRadioButton green = new JRadioButton("green");
	JRadioButton blue = new JRadioButton("blue");
	
	JRadioButton a = new JRadioButton("A");
	JRadioButton b = new JRadioButton("B");
	JRadioButton c = new JRadioButton("C");
	
	JLabel output = new JLabel("RESULTS OUTPUTTED HERE");
	
	public DPanel(JFrame f) {
				
		JPanel page = new JPanel(new BorderLayout());
			   
		new Trims(page, "Radio Buttons", f);
		
		writing.setFont(new Font("serif", Font.BOLD, 20));
		output.setFont(new Font("serif", Font.BOLD, 58));
		
		ButtonGroup colour = new ButtonGroup();
		ButtonGroup letter = new ButtonGroup();
		
		red.setSelected(true);
		red.addActionListener(this);
		colour.add(red);
		green.addActionListener(this);
		colour.add(green);
		blue.addActionListener(this);
		colour.add(blue);
		
		a.setSelected(true);
		a.addActionListener(this);
		letter.add(a);
		b.addActionListener(this);
		letter.add(b);
		c.addActionListener(this);
		letter.add(c);
		
		JPanel cols = new JPanel(new GridLayout(3,1));
			   cols.add(red);
			   cols.add(green);
			   cols.add(blue);
			   
	    JPanel lets = new JPanel(new GridLayout(3,1)); 
	    	   lets.add(a);
	    	   lets.add(b);
	    	   lets.add(c);
		
		JPanel main = new JPanel(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
						   gbc.fill = GridBagConstraints.VERTICAL;
						   gbc.insets = new Insets(20, 0, 20, 0);
						   gbc.gridx = 0;
						   gbc.gridy = 0;
						   gbc.gridwidth = 2;
						   main.add(writing,gbc);
						   
						   gbc.gridx = 0;
						   gbc.gridy = 1;
						   gbc.gridwidth = 1;
						   gbc.anchor = GridBagConstraints.WEST;
						   main.add(cols, gbc);
						   
						   gbc.gridx = 1;
						   gbc.anchor = GridBagConstraints.EAST;
						   main.add(lets, gbc); 
						   
						   gbc.gridx = 0;
						   gbc.gridy = 2;
						   gbc.gridwidth = 2;
						   gbc.anchor = GridBagConstraints.CENTER;
						   main.add(output, gbc);
						   
		page.add(main);
		f.add(page, BorderLayout.CENTER);
		f.setVisible(true);
		
		setOutput("A", Color.RED );
	}

	private void setOutput(String string, Color colour) {
		
		output.setText(string);
		output.setForeground(colour);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String x;
		Color col;
		if(a.isSelected())  x = "A";
		else if(b.isSelected()) x = "B";
		else x = "C";
		
		if(red.isSelected()) col = Color.RED;
		else if(green.isSelected()) col = Color.GREEN;
		else col = Color.BLUE;
		
		setOutput(x, col);
	}
}