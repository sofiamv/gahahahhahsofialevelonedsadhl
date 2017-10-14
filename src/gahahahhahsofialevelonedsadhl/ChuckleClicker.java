package gahahahhahsofialevelonedsadhl;

import javax.swing.JFrame;
import javax.swing.JButton;

public class ChuckleClicker {
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
		}
	public void makeButtons() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		System.out.println("Neils Bohr");
		JButton buttonuno = new JButton();
		JButton buttondos = new JButton();
		frame.add(buttondos);
		frame.add(buttonuno);
	}


}
