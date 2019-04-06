package reference;

import java.awt.*;

import javax.swing.*;

public class FPanel {
	
	JLabel writing = new JLabel("This is the music");
	
	public FPanel(JPanel front, JFrame f) {
		
		front.setVisible(false);
		
		JPanel page = new JPanel(new BorderLayout());
		
		new Trims(page, "F PAGE TITLE", f, front);
		
		JPanel main = new JPanel(new GridBagLayout());
			   main.add(writing);
		
		
		page.add(main,BorderLayout.CENTER);
		f.add(page);
		
	}

}
