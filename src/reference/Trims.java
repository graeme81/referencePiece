package reference;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class Trims {
	
	JButton frontPage = new JButton("Return to Front");
	JLabel heading = new JLabel();
	
	public Trims(JPanel p1, String title, JFrame f, JPanel front) {
		
	JPanel titlePanel = new JPanel();
	 	   titlePanel.setBorder(new LineBorder(Color.BLACK)); 
	 	   titlePanel.setBackground(Color.GREEN);
	 	   heading.setFont(new Font("serif", Font.BOLD, 24));
	 	   heading.setText(title);
	 	   titlePanel.add(heading);
	
	JPanel toFront = new JPanel();
		   toFront.setLayout(new FlowLayout(FlowLayout.RIGHT));
		   toFront.setBorder(new LineBorder(Color.BLACK));
		   toFront.setBackground(Color.GREEN);
		   toFront.add(frontPage);
		   
		   frontPage.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					f.remove(p1);
					front.setVisible(true);
				}
			});
		   
	p1.add(titlePanel,BorderLayout.NORTH);
	p1.add(toFront,BorderLayout.SOUTH);
	}

}
