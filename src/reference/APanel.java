package reference;

import java.awt.event.*;

import javax.swing.*;

public class APanel{
	JLabel enter = new JLabel("Enter Your Name:");
	JTextField input = new JTextField(10);
	JButton click = new JButton("Enter Name");
	JLabel result = new JLabel();


	public APanel(JPanel front, JFrame f){
		
		front.setVisible(false);
		
		JPanel p = new JPanel();
			   p.add(enter);
			   p.add(input);
			   p.add(click);
			   p.add(result);
			   
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.remove(p);
				front.setVisible(true);
			}
		});
		
		f.add(p);
		
		
		
	}
}
