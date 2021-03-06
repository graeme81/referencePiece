package reference;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class APanel{
	JLabel enter = new JLabel("Enter Your Name:");
	JTextField input = new JTextField(10);
	JLabel secret = new JLabel("Enter secret word: ");
	JPasswordField word = new JPasswordField(10);
	JButton click = new JButton("Enter Name");
	JLabel result = new JLabel("RESULT");

	public APanel(JFrame f){
		
		JPanel page = new JPanel(new BorderLayout());
		
		new Trims(page, "Simple Input", f);
		
		JPanel main = new JPanel(new GridBagLayout());
			   
			   GridBagConstraints gbc = new GridBagConstraints();
			   		   			  gbc.fill = GridBagConstraints.VERTICAL;
			   		   			  gbc.insets = new Insets(5, 5, 5, 5);
			   		   		
			   		   			  gbc.gridwidth = 2;
			   		   			  gbc.gridy = 0;
			   		   			  main.add(enter, gbc);
			   		   			  
			   		   			  gbc.gridy = 1;
			   		   			  main.add(input, gbc);
			   		   			  
			   		   			  gbc.gridy = 2;
			   		   			  gbc.gridwidth = 1;
			   		   			  main.add(secret, gbc);
			   		   			  main.add(word, gbc);
			   		   			  
			   		   			  gbc.gridwidth = 2;
			   		   			  gbc.gridy = 3;
			   		   			  main.add(click, gbc);
			   		   			  
			   		   			  gbc.gridy = 4;
			   		   			  main.add(result, gbc);
			   
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = input.getText();
				String secretWord = new String(word.getPassword());
				result.setText(name + ", your secret word is - " + secretWord);
			}
		});
		
		page.add(main,BorderLayout.CENTER);
		
		f.add(page);
		f.setVisible(true);
		
	}
}
