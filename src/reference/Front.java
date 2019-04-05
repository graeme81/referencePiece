package reference;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Front implements ActionListener{
	
	JLabel one = new JLabel("Pick From", SwingConstants.CENTER);
	JLabel two = new JLabel("The Menus", SwingConstants.CENTER);
	JLabel three = new JLabel("Above", SwingConstants.CENTER);
	JFrame f = new JFrame("Front Page");
	JPanel p = new JPanel();
	
	public Front() {
		
		 	   f.setSize(700, 500);
		 	   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 	   f.setLocation(300, 100);
		 	   
		createMenus(f);
		
		
			   p.setLayout(new GridBagLayout());
		 	   
		Font font = new Font("serif", Font.BOLD, 24);	
			 one.setFont(font);
		 	 two.setFont(font);
			 three.setFont(font);
		 	   
		JPanel writing = new JPanel();
			   writing.setLayout(new BoxLayout(writing, BoxLayout.Y_AXIS));
			   writing.add(one);
			   writing.add(two);
			   writing.add(three);
		
		p.add(writing);   //, new GridBagConstraints());
		f.add(p);
		f.setVisible(true);
	}

	private void createMenus(JFrame f2) {
		
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
		
		f2.setJMenuBar(mb);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(e.getActionCommand() + " was Pressed!");
		
		switch(e.getActionCommand()) {
			case "A" : new APanel(p, f); break;
			case "B" : new BPanel(p, f); break;
			case "C" : new CPanel(p, f); break;
			case "D" : new DPanel(p, f); break;
			case "E" : new EPanel(p, f); break;
			case "F" : new FPanel(p, f); break;
				
		}
		
	}
}
