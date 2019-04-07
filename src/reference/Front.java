package reference;

//import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Front implements ActionListener{
		
	JFrame frame = new JFrame("Front Page");
	JPanel open;
	
	public Front() {
		
		frame.setSize(700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(300, 100);
		 	   
		createMenus();
		
		new FrontPanel(frame);
//		new APanel(frame);
		
		frame.setVisible(true);
	}
	
	private void createMenus() {
		
		JMenuBar mb = new JMenuBar();
		
		JMenu first = new JMenu("One");
		JMenu second = new JMenu("Two");
		JMenu third = new JMenu("Third");
		
		JMenuItem a = new JMenuItem("A");
				  a.addActionListener(this);
		JMenuItem b = new JMenuItem("B");
				  b.addActionListener(this);
		JMenuItem c = new JMenuItem("C");
				  c.addActionListener(this);
		JMenuItem d = new JMenuItem("D");
				  d.addActionListener(this);
		JMenuItem e = new JMenuItem("E");
				  e.addActionListener(this);
		JMenuItem f = new JMenuItem("F");
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
		
		System.out.println(e.getActionCommand() + " was Pressed!");
		
		switch(e.getActionCommand()) {
			case "A" : frame.getContentPane().removeAll();
					   new APanel(frame);
					   break;
			case "B" : frame.getContentPane().removeAll();
					   new BPanel(frame); 
					   break;
			case "C" : frame.getContentPane().removeAll();
					   new CPanel(frame); 
					   break;
			case "D" : frame.getContentPane().removeAll();
					   new DPanel(frame); 
					   break;
			case "E" : frame.getContentPane().removeAll();
					   new EPanel(frame); 
					   break;
			case "F" : frame.getContentPane().removeAll();
					   new FPanel(frame); 
					   break;
				
		}
	}
}
