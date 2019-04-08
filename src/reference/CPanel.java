package reference;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CPanel implements ActionListener {
	
	JLabel writing = new JLabel("CHecK sOMe BoXeS");
	int total = 0;
	
	JCheckBox one = new JCheckBox("ONE  ");
	JCheckBox two = new JCheckBox("TWO  ");
	JCheckBox three = new JCheckBox("THREE");
	JCheckBox four = new JCheckBox("FOUR ");
	
	JLabel output = new JLabel("total of checked boxes is " + total);
	
	public CPanel(JFrame f) {
		
		JPanel page = new JPanel(new BorderLayout());
			   
		new Trims(page, "Check Boxes", f);
		
		JPanel main = new JPanel(new GridBagLayout());
			   main.setBackground(Color.YELLOW);
			   
			   GridBagConstraints gbc = new GridBagConstraints();
			   gbc.insets = new Insets(0, 0, 20, 0);
			   gbc.gridwidth = 3;
			   gbc.gridx = 0;
			   gbc.anchor = GridBagConstraints.CENTER;
			   main.add(writing, gbc);
			   
			   gbc.insets = new Insets(0, 0, 0, 0);
			   gbc.gridwidth = 1;
			   gbc.gridx = 2;
			   gbc.gridy = 1;
			   main.add(one, gbc);
			   gbc.gridy = 2;
			   main.add(two, gbc);
			   gbc.gridy = 3;
			   main.add(three, gbc);
			   gbc.gridy = 4;
			   main.add(four, gbc);
			   
			   gbc.gridx = 0;
			   gbc.gridy = 5;
			   gbc.gridwidth = 3;
			   gbc.insets = new Insets(20, 0, 0, 0);
			   main.add(output, gbc);
			   
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		
		page.add(main,BorderLayout.CENTER);
		
		f.add(page);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == one) {
			total = (one.isSelected())? total+1 : total -1;
		}else if (e.getSource() == two) {
			total = (two.isSelected())? total+2 : total -2;
		}else if (e.getSource() == three) {
			total = (three.isSelected())? total+3 : total -3;
		}else if (e.getSource() == four) {
			total = (four.isSelected())? total+4 : total -4;
		}
		
		output.setText("total of checked boxes is " + total);
		
	}
	
}















