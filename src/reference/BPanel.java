package reference;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class BPanel {
	
	//may be better to use JTextPane than JTextArea;
	
	String[] go = {"1","2","3","4","5","6","7","8","9","10"};
	String[] stop = {"11","12","13","14","15","16","17","18","19","20"};
	
	JComboBox start = new JComboBox(go);
	JComboBox end = new JComboBox(stop);
	
	JTextArea textArea = new JTextArea(10, 10);
	JScrollPane scrollPane = new JScrollPane(textArea); 
	
	public BPanel(JFrame f) {
		
		JPanel page = new JPanel(new BorderLayout());
		
		new Trims(page, "B PAGE TITLE", f);
		
		JPanel main = new JPanel(new GridBagLayout());
			   main.setBackground(Color.orange);
			   
			   GridBagConstraints gbc = new GridBagConstraints();
			   					  gbc.fill = GridBagConstraints.VERTICAL;
			   					  gbc.insets = new Insets(5,5,5,5);
			   					  
			   					  main.add(start, gbc);
			   					  
			   					  gbc.gridx = 2;
			   					  main.add(end, gbc);
			   					  
			   					  gbc.gridwidth = 3;
			   					  gbc.gridx = 0;
			   					  gbc.gridy = 3;
			   					  
			   					  main.add(scrollPane, gbc);
			 
		start.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				updateList();
			}

		});	  

		end.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				updateList();
			}
		});	
			     
		page.add(main,BorderLayout.CENTER);
	
		f.add(page);
		f.setVisible(true);
	}

	private void updateList() {
		textArea.selectAll();
		textArea.replaceSelection("");
		
		int begin = Integer.parseInt(go[start.getSelectedIndex()]);
		int finish = Integer.parseInt(stop[end.getSelectedIndex()]);
		
		String list  = "numbers";
		
		for(int x = begin; x < finish+1; x++) {
			list = list +"\n"+ x;
		}
		textArea.append(list);
	}
}
