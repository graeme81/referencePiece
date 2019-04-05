package reference;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CPanel {
	
	JLabel title = new JLabel("C");
	JButton click = new JButton("Back to Front");
	
	public CPanel(JPanel front, JFrame f) {
		
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