package reference;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class Trims {
	
	JButton frontPage = new JButton("Return to Front");
	JLabel heading = new JLabel();
	
	public Trims(JPanel page, String title, JFrame f) {
		
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
					System.out.println("DELETE PANEL");
					f.remove(page);
					//front.setVisible(true);
					new FrontPanel(f);
				}
			});
		   
	page.add(titlePanel,BorderLayout.NORTH);
	page.add(toFront,BorderLayout.SOUTH);
	}

}
