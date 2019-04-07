package reference;

import java.awt.*;

import javax.swing.*;

public class EPanel {
	
	JLabel writing = new JLabel("We Are working here!");
	
	public EPanel(JFrame f) {
		
		JPanel page = new JPanel(new BorderLayout());
			   
		new Trims(page, "E PAGE TITLE", f);
			   
		JPanel main = new JPanel(new GridBagLayout());
			   main.add(writing);
		
		page.add(main, BorderLayout.CENTER);
		
		f.add(page);
		f.setVisible(true);
		
	}

}
