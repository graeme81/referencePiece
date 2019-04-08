package reference;

import java.awt.*;

import javax.swing.*;

public class CPanel {
	
	JLabel writing = new JLabel("CHecK sOMe BoXeS");
	
//	J
	
	public CPanel(JFrame f) {
		
		JPanel page = new JPanel(new BorderLayout());
			   
		new Trims(page, "CHECK BOXES", f);
		
		JPanel main = new JPanel(new GridBagLayout());
			   main.setBackground(Color.YELLOW);
			   main.add(writing);	   
			   
		page.add(main,BorderLayout.CENTER);
		
		f.add(page);
		f.setVisible(true);
	}
}