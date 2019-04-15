package reference;

import java.awt.event.*;

import javax.swing.*;

public class Front implements ActionListener{
		
	JFrame frame = new JFrame("Front Page");
	
	public Front() {
		
		frame.setSize(700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(300, 100);
		 	   
		createMenus();
		
		new FrontPanel(frame);
		
		frame.setVisible(true);
	}
	
	
	
	
	private void createMenus() {
		
		JMenuBar mb = new JMenuBar();
		
		JMenu first = new JMenu("One");
		JMenu second = new JMenu("Two");
		JMenu third = new JMenu("Third");
		
		JMenuItem a = new JMenuItem("Simple Input");
				  a.addActionListener(this);
		JMenuItem b = new JMenuItem("Combo Boxes");
				  b.addActionListener(this);
		JMenuItem c = new JMenuItem("Check Boxes");
				  c.addActionListener(this);
		JMenuItem d = new JMenuItem("Radio Buttons");
				  d.addActionListener(this);
		JMenuItem e = new JMenuItem("The Game");
				  e.addActionListener(this);
		JMenuItem f = new JMenuItem("Files");
				  f.addActionListener(this);
		
		first.add(a);
		first.add(b);
		second.add(c);
		second.add(d);
		third.add(e);
		third.add(f);
		
		mb.add(first);
		mb.add(second);
		mb.add(third);
		
		frame.setJMenuBar(mb);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
			case "Simple Input" :  frame.getContentPane().removeAll();
					   			   new APanel(frame);
					   			   break;
			case "Combo Boxes" :   frame.getContentPane().removeAll();
					   	  	 	   new BPanel(frame); 
					   	  	 	   break;
			case "Check Boxes" :   frame.getContentPane().removeAll();
					   			   new CPanel(frame); 
					   			   break;
			case "Radio Buttons" : frame.getContentPane().removeAll();
					   			   new DPanel(frame); 
					   			   break;
			case "The Game" : 	   frame.getContentPane().removeAll();
					   			   new EPanel(frame); 
					   			   break;
			case "Files" : 	  	   frame.getContentPane().removeAll();
					   			   new FPanel(frame); 
					   			   break;
				
		}
	}
}
