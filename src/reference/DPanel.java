package reference;

import java.awt.*;

import javax.swing.*;

public class DPanel {
	
	JLabel writing = new JLabel("D PAGE!");
	
	public DPanel(JFrame f) {
				
		JPanel page = new JPanel(new BorderLayout());
			   
		new Trims(page, "D PAGE TITLE", f);
		
		JPanel main = new JPanel(new GridBagLayout());
		       main.add(writing);
		
		page.add(main);
		f.add(page, BorderLayout.CENTER);
		f.setVisible(true);
		
	}

}