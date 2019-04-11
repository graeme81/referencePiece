package reference;

import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import javax.swing.event.*;

public class EPanel {
	
	JLabel writing = new JLabel("We Are working here!");
	JLabel sliderVal = new JLabel("Slider Value is : 50");
	JSlider slide = new JSlider();
	JSpinner spin = new JSpinner(new SpinnerNumberModel(25,0,50,1));
	JToggleButton tog = new JToggleButton("OFF");
	JTextField tf = new JTextField(10);
	JButton click = new JButton("Click!");
	JProgressBar prog = new JProgressBar(0,100);
	
	int spinVal = (int)spin.getValue();	
	
	public EPanel(JFrame f) {
		
		
		
		slide.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				sliderVal.setText("Slider Value is : "+ ((JSlider)e.getSource()).getValue());
			}
		}); 
		
		spin.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				spinVal =  (int) ((JSpinner)e.getSource()).getValue();
			}
		});
		
		tog.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String text = (tog.isSelected())? "ON":"OFF";
				tog.setText(text);
			}
		});
		
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int total = 0;
				
				if(!tog.isSelected() && tf.getText().length() > 0) {
					
					int textLen = tf.getText().length();
					total = (slide.getValue()*2) + (spinVal/4) + textLen ;
					
					if(total > 100) {
						total = 100 - (total%100);
					}
						
				}else {
					total = ((int)(Math.random()*100));
				}
				
				for(int x = 0 ; x < total+1; x++) {
					prog.setValue(x);
//					swing worker needed?
				}
			}
		});
		
	
		
		
		
		buildPage(f);
		
	}


	
//	System.out.println("slider = " +slide.getValue());
//	System.out.println("spin = " + spinVal);
//	System.out.println("Text Length = " + textLen);
	
	
//	System.out.println(total);	
	
	
	
	
	
	
	
	
	
	private void buildPage(JFrame f) {
		JPanel page = new JPanel(new BorderLayout());
		   
		new Trims(page, "Random Things", f);
				
		JPanel outline = new JPanel(new GridLayout(1,2));
		JPanel left = new JPanel(new GridBagLayout());
			   
		GridBagConstraints lgb = new GridBagConstraints();
		   				   lgb.insets = new Insets(20, 0, 0, 0);
		   				   
		   				   lgb.gridy = 0;
		   				   left.add(sliderVal);
		   				   lgb.gridy = 1;
		   				   left.add(slide, lgb);
		   				   lgb.gridy = 2;
		   				   left.add(spin, lgb);
		   				   lgb.gridy = 3;
		   				   left.add(tog, lgb);
		   				   lgb.gridy = 4;
		   				   left.add(tf,lgb);
		   				   lgb.gridy = 5;
		   				   left.add(click, lgb);
		   				   lgb.gridy = 6;
		   				   left.add(writing,lgb);
			   
		JPanel right = new JPanel(new GridBagLayout());
			   right.add(prog);
			   
		outline.add(left);
		outline.add(right);
		
		page.add(outline);
		
		f.add(page);
		f.setVisible(true);
		
	}

}


