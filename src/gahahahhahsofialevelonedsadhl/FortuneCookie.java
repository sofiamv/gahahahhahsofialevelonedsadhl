package gahahahhahsofialevelonedsadhl;
	import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
	import javax.swing.JFrame;
import javax.swing.JOptionPane;

	public class FortuneCookie implements ActionListener{
		JButton realbutton;
	//Make a class, main method and showButton method. Put a printout in the showButton method. Instantiate your class and see that your printout works. 
		// Fortune Cookie recipe: Create a button that gives one of five random
		// fortunes when clicked.

	//Make a JFrame in showButton method and get it to show.
		//Make a class, main method and showButton method. Put a printout in the
		// showButton method. Instantiate your class and see that your printout
		// works. done
		public static void main(String[] args) {
		new FortuneCookie().showButton();
		}

	//Make a JButton and add it to the JFrame.
		public void showButton() {
			System.out.println("yo");
			JFrame button = new JFrame();
			button.setVisible(true);
			realbutton = new JButton();
			button.add(realbutton);
			realbutton.addActionListener(this);
			
				
			}
		

		@Override
		public void actionPerformed(ActionEvent action) {
			// TODO Auto-generated method stu
			if(action.getSource() == realbutton){
				System.out.println("amadeo avogadro");
				Random random = new Random();
				int ranndom = random.nextInt(5);
				if(ranndom==0) {
					JOptionPane.showMessageDialog(null, "A fish shall kiss you on the tenth time you try to fish.");
				}else if (ranndom==1) {
					JOptionPane.showMessageDialog(null, "Your future husband/wife is currently in your school. Actually, is it? I don't know. I myself don't even know if I'm getting married.");
				}else if (ranndom==2) {
					JOptionPane.showMessageDialog(null, "Lol what?");
				}else if (ranndom==3) {
					JOptionPane.showMessageDialog(null, "The person sitting in front of you in art class is doomed to a terrible death.");
				}else if (ranndom==4) {
						JOptionPane.showMessageDialog(null, "You will soon get a pet cat. You will most likely name it a type of food.");
					}
		}
		
			
			
			}
		}

	//Add an action listener to the button (auto fix the errors!!). When the button is clicked, say “Woohoo”.
		
		// Make a JFrame in showButton method and get it to show. done

		// Make a JButton and add it to the JFrame. done

		// Add an action listener to the button (auto fix the errors!!). When the
		// button is clicked, say “Woohoo”.

		// Generate a random number between 0 and 4. Depending on the random number,
		// show on of five fortunes.

	//Generate a random number between 0 and 4. Depending on the random number, show on of five fortunes.


