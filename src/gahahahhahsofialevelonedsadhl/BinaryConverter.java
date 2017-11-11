package gahahahhahsofialevelonedsadhl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JButton button = new JButton("Convert –>");
	JTextField answer = new JTextField(20);
	JTextField input = new JTextField(20);
	public int num = 0;
	public String word = "";

	//*We’re going to make an application that converts binary codes (8-bits) into letters.

	///You’ll need a JFrame and a JPanel.
	public void dhfsdlfjh() {
	JFrame frame = new JFrame("Awesome binary converter :DDDDD");
	JPanel panel = new JPanel();
	frame.setVisible(true);
	//On the panel, put two text fields and a button. A text field is made like this:
	frame.add(panel);
	panel.add(input);
	panel.add(button);
	panel.add(answer);
	button.addActionListener(this);
	frame.pack();
	}
	public static void main(String[] args) {
		BinaryConverter hahaaa = new BinaryConverter();
		hahaaa.dhfsdlfjh();
	}

	// may look like this or you might have a better layout in mind.


//	Here is a method that will do the conversion for you.
	int convert(String binary) {
		//number = Integer.parseInt(input.getText());
			//if(binary.length() != 8){
				//JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
				
				//return 0;
		//}
			// if(!Pattern.matches("\2", binary)) {
				// JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
					//return 0;
			//}
			try {
				int asciiValue = Integer.parseInt(binary, 2);
				return asciiValue;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
				//question.setText("");
				return 0;
			}
		}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button) {
		System.out.println(convert(input.getText()));
		num = convert(input.getText());
		word = Integer.toString(num);
		answer.setText(word);
	}
		
	}
	    

}
