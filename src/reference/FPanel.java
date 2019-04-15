package reference;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class FPanel {
	
	JLabel writing = new JLabel("This is the music");
	JTextArea ta = new JTextArea("file for notes");
	JScrollPane scroll = new JScrollPane(ta);  // add text area to scroll pane
	JButton load = new JButton("LOAD");
	JButton save = new JButton("SAVE");
	JButton clear = new JButton("CLEAR");
	BufferedReader inFile;
	
	public FPanel(JFrame f) {
		
		load.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String file = "src\\reference\\textFile.txt" ; 
				try {
					inFile = new BufferedReader(new FileReader(file));
					ta.setText("");
					String line;
					while((line = inFile.readLine()) != null) {
						ta.append(line+"\n");
					}
					inFile.close();	
				}catch(IOException e) {
					System.out.println("Error in File " + e.toString());
				};
			}
		});
		
		save.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String file = "src\\reference\\textFile.txt" ; 
				try {
					PrintWriter out = new PrintWriter(new FileWriter(file),true);
					out .print(ta.getText());
					out.close();
				}catch(IOException e) {
					System.out.println("NOT GOOD! " + e.toString());
					System.exit(1);
				};
			}
		});
		
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ta.setText("");
			}
		});
		
		bulidPage(f);
	}	
	
	private void bulidPage(JFrame f) {
		JPanel page = new JPanel(new BorderLayout());
		JPanel main = new JPanel(new BorderLayout(4,4));
		JPanel padderWest = new JPanel();
		JPanel padderEast = new JPanel();
//		JPanel center = new JPanel(new GridLayout(1,1));
		JPanel bottom = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		padderWest.setBackground(Color.BLACK);
		padderEast.setBackground(Color.BLACK);
		
		new Trims(page, "FILES", f);
		
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		ta.setWrapStyleWord(true);
	    ta.setLineWrap(true);
	    
//        center.add(scroll);
		
        bottom.add(clear);
		bottom.add(load);
		bottom.add(save);
		
		main.setBackground(Color.BLACK);
		main.add(padderWest,BorderLayout.WEST);
		main.add(padderEast, BorderLayout.EAST);
	   	main.add(scroll, BorderLayout.CENTER);
		main.add(bottom, BorderLayout.SOUTH);
		
		page.add(main,BorderLayout.CENTER);
		f.add(page);
		f.setVisible(true);	
	}
}
