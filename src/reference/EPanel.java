package reference;

import java.awt.*;

import javax.swing.*;

public class EPanel {
	
	JLabel writing = new JLabel("We Are working here!");
	
	JSlider slide = new JSlider();
	JSpinner spin = new JSpinner();
	JToggleButton tog = new JToggleButton();
	JProgressBar prog = new JProgressBar();
	
	public EPanel(JFrame f) {
		
		JPanel page = new JPanel(new BorderLayout());
			   
		new Trims(page, "Random Things", f);
		
		JPanel outline = new JPanel(new GridLayout(1,2));
		
		JPanel left = new JPanel(new GridBagLayout());
			   
			   left.add(writing);
			   left.add(slide);
			   left.add(spin);
			   left.add(tog);
		
		GridBagConstraints lgb = new GridBagConstraints();
		   				  // lgb.fill = GridBagConstraints.HORIZONTAL;
		   				   lgb.insets = new Insets(20, 0, 0, 0);
		   
		   				   lgb.gridy = 1;
		   				   left.add(writing, lgb);
		   				lgb.gridy = 2;
		   				   left.add(slide, lgb);
		   				lgb.gridy = 3;
		   				   left.add(spin, lgb);
		   				lgb.gridy = 4;
		   				   left.add(tog, lgb);
			   
			   JPanel right = new JPanel(new GridBagLayout());
			   right.add(prog);
			   
		outline.add(left);
		outline.add(right);
		
		
		
		page.add(outline, BorderLayout.CENTER);
		
		f.add(page);
		f.setVisible(true);
		
	}

}
