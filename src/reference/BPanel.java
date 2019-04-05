package reference;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BPanel {
	
	JLabel title = new JLabel("B");
	JButton click = new JButton("Back to Front");
	
	public BPanel(JPanel front, JFrame f) {
		
		front.setVisible(false);
		
		JPanel p = new JPanel();
		p.add(title);
		p.add(click);
		
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.remove(p);
				front.setVisible(true);
			}
		});
		
		f.add(p);
		
	}

}
