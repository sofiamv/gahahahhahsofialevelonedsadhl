package gahahahhahsofialevelonedsadhl;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class TypingTutor implements KeyListener {
	int scoretracker = 0;
	Date timeAtStart = new Date();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	char currentLetter = generateRandomLetter();
	JFrame frame;
public static void main(String[] args) {
	TypingTutor a = new TypingTutor();
	a.aaaaaaaaaaaaaaaaaaaaaa();
}
public void aaaaaaaaaaaaaaaaaaaaaa() {
	frame = new JFrame("Type or Die >:D");
	frame.setVisible(true);
	frame.add(panel);
	panel.add(label);
	label.setText(" " + currentLetter);
label.setFont(label.getFont().deriveFont(160.0f));
label.setHorizontalAlignment(JLabel.CENTER);
frame.addKeyListener(this);
frame.setSize(500, 500);

}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	if(e.getKeyChar()==(currentLetter)) {
		System.out.println(currentLetter);
		System.out.println("Correct");
		panel.setBackground(Color.green);
		scoretracker++;
		System.out.println(scoretracker);
		if(scoretracker==20) {
			showTypingSpeed(scoretracker);
		}
	}else {
		panel.setBackground(Color.RED);
		System.out.println(currentLetter);
		System.out.println("incorrect");
	}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
if(e.getKeyChar()==(currentLetter)) {
		currentLetter = generateRandomLetter();
		label.setText(" " + currentLetter);
		}
	}
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " CORRECT characters per minute.");
	}}

