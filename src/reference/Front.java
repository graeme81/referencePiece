package reference;

import java.awt.*;

import javax.swing.*;

public class Front {
	
	JLabel one = new JLabel("Pick From", SwingConstants.CENTER);
	JLabel two = new JLabel("The Menus", SwingConstants.CENTER);
	JLabel three = new JLabel("Above", SwingConstants.CENTER);
	
	public Front() {
		JFrame f = new JFrame("Front Page");
		 	   f.setSize(700, 500);
		 	   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 	   f.setLocation(300, 100);
		 	   
		createMenus(f);
		
		JPanel p = new JPanel();
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
		JMenuItem b = new JMenuItem("B");
		JMenuItem c = new JMenuItem("C");
		JMenuItem d = new JMenuItem("D");
		JMenuItem e = new JMenuItem("E");
		JMenuItem f = new JMenuItem("F");
		
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
}
