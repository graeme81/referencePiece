package reference;

import java.awt.*;

import javax.swing.*;

public class BPanel {
	
	JLabel writing = new JLabel("MAIN AREA FOR PAGE!");
	
	public BPanel(JFrame f) {
		
		JPanel page = new JPanel(new BorderLayout());
		
		new Trims(page, "B PAGE TITLE", f);
		
		JPanel main = new JPanel(new GridBagLayout());
			   main.setBackground(Color.MAGENTA);
			   main.add(writing);	   
			   
		page.add(main,BorderLayout.CENTER);
	
		f.add(page);
		f.setVisible(true);
	}
}
