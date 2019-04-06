package reference;

import java.awt.*;

import javax.swing.*;

public class EPanel {
	
	JLabel writing = new JLabel("We Are working here!");
	
	public EPanel(JPanel front, JFrame f) {
		
		front.setVisible(false);
		
		JPanel page = new JPanel(new BorderLayout());
			   
		new Trims(page, "E PAGE TITLE", f, front);
			   
		JPanel main = new JPanel(new GridBagLayout());
			   main.add(writing);
		
		page.add(main, BorderLayout.CENTER);
		
		f.add(page);
		
	}

}
