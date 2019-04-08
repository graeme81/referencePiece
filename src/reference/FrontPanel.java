package reference;

import java.awt.*;

import javax.swing.*;
//import javax.swing.border.LineBorder;

public class FrontPanel {
	
	JLabel one = new JLabel("Pick From", SwingConstants.CENTER);
	JLabel two = new JLabel("The Menus", SwingConstants.CENTER);
	JLabel three = new JLabel("Above", SwingConstants.CENTER);
	
	public FrontPanel(JFrame f) {
		
		JPanel page = new JPanel(new GridBagLayout());
		
		Font font = new Font("serif", Font.BOLD, 24);	
			 one.setFont(font);
			 two.setFont(font);
			 three.setFont(font);
	
		JPanel main = new JPanel();
			   main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
//			   main.setBorder(new LineBorder(Color.BLACK)); 
			   main.add(one);
			   main.add(two);
			   main.add(three);
			   
		page.add(main);
		
		f.add(page);
		f.setVisible(true);
		
	}

}
