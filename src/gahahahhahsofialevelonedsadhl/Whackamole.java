package gahahahhahsofialevelonedsadhl;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whackamole implements ActionListener {
	JFrame frame1;
JButton buutton = new JButton("mole");
	boolean issetup = true;
	JPanel panel;
	int rand;
	JButton button;
	int scoretrackertwo = 0;
	int scoretracker = 0;
	Date a = new Date();
	// Make a drawButtons method that takes a random number as a parameter. It
	// should make a GUI like this, but the “mole!” location is random.
	// [Hint: set the size of the frame rather than packing it.]
	public static void main(String[] args) {
		Whackamole asdfg = new Whackamole();
		asdfg.DrawButtons();
	}

	public void DrawButtons() {
		frame1 = new JFrame("Whack a mole");
		panel = new JPanel();
		frame1.setVisible(true);
		frame1.setSize(500, 500);
		frame1.add(panel);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Random rando = new Random();
		rand = rando.nextInt(40);
		
		for (int a = 0; a <= 39; a++) {
			if (a == rand) {
				panel.add(buutton);


			} else {
				button = new JButton();
				panel.add(button);
				button.addActionListener(this);
			}
			if(issetup==true) {
				buutton.addActionListener(this);
				issetup = false;
			}

		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Dispose of the frame and draw the buttons anew.

	// After they’ve whacked 10 moles, call this endGame() method.
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / scoretracker) + " moles per second.");
	}

	// Progressively insult them if they hit something other than the mole! button.
	// If they get click an empty button twice, call them an idiot.
	// If they click an empty button three times, call them a moron.
	// If they click an empty button four times, call them a complete waste of
	// atoms.
	// [Use a switch statement for extra amazingness.]

	// Call this playSound() method when they hit a mole.
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (!(e.getSource() == buutton)) {
			scoretrackertwo++;
			System.out.println(scoretracker);
			System.out.println(scoretrackertwo);
			

		} else if(e.getSource()== buutton) {
			scoretracker++;
			System.out.println(scoretracker);
		
		}
		if (scoretracker >= 10) {
			endGame(a, scoretracker);
			frame1.dispose();
		}
		if (scoretrackertwo == 2) {
			speak1("Idiot.");
		} else if (scoretrackertwo == 3) {
			speak1("moron.");
		} else if (scoretrackertwo == 4) {
			speak1("you are a complete waste of atoms.");
		}
		frame1.dispose();
		this.DrawButtons();
	}
	void speak1(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
