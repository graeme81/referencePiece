package reference;

import java.awt.*;

import javax.swing.*;

public class FPanel {
	
	JLabel writing = new JLabel("This is the music");
	JTextArea ta = new JTextArea("something written on it");
	JScrollPane scroll = new JScrollPane(ta);
	JButton load = new JButton("LOAD");
	JButton save = new JButton("SAVE");
	
	public FPanel(JFrame f) {
		
		JPanel page = new JPanel(new BorderLayout());
		JPanel main = new JPanel(new BorderLayout(4,4));
		JPanel padderWest = new JPanel();
		JPanel padderEast = new JPanel();
		JPanel center = new JPanel(new GridLayout(1,1));
		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		padderWest.setBackground(Color.BLACK);
		padderEast.setBackground(Color.BLACK);
		
		new Trims(page, "FILES", f);
		
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		ta.setWrapStyleWord(true);
	    ta.setLineWrap(true);
	    
        center.add(scroll);
			   
		bottom.add(load);
		bottom.add(save);
		
		main.setBackground(Color.BLACK);
		main.add(padderWest,BorderLayout.WEST);
		main.add(padderEast, BorderLayout.EAST);
	   	main.add(center, BorderLayout.CENTER);
		main.add(bottom, BorderLayout.SOUTH);
		
		page.add(main,BorderLayout.CENTER);
		f.add(page);
		f.setVisible(true);
	}

}
