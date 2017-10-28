package gahahahhahsofialevelonedsadhl;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class ChuckleClicker implements ActionListener {
	JButton buttonone;
	JButton buttontwo;
	/*Make a ChuckleClicker class, a main method and a makeButtons method. Put a pop-up in the makeButtons method and get it working. You will need to instantiate your class and call method an instance of it. 

	Make a JFrame in makeButtons() method and get it to show.

	Add a JPanel and two JButtons and get them to show up like this:

	*[Optional] Customize your GUI with setText, setSize, etc.

	Make a pop-up that says “hi” when either of the buttons are pressed. You will need to add listeners to the buttons for this to work.

	Check if the ActionEvent came from the joke button or the punchline button.  
	if(arg0.getSource() == jokeButton)
	You might need to move the declaration of your buttons above the the makeButtons() method.

	Use JOptionPane to print the joke or the punchline depending on which button was clicked.*/
	public static void main(String[] args) {
		ChuckleClicker bah = new ChuckleClicker();
		bah.makeButtons();
		}
	 public void makeButtons() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		buttonone = new JButton();
		buttontwo = new JButton();
		panel.add(buttontwo);
		panel.add(buttonone);
		buttonone.setText("punchline");
		buttontwo.setText("joke");
		buttonone.addActionListener(this);
		buttontwo.addActionListener(this);
		frame.pack();
		
	
		
	
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==buttontwo) {
			JOptionPane.showMessageDialog(null, "What did the wall say to the ceiling?");
			
		}
		if(e.getSource()==buttonone) {
			JOptionPane.showMessageDialog(null,"'I'll meet you at the corner.'");
			
		}
		
	}


}
