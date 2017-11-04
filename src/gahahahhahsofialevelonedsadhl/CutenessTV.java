package gahahahhahsofialevelonedsadhl;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
public class CutenessTV implements ActionListener {
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	//Make a user interface with 3 buttons that will play different videos depending on which button is clicked. Use the methods below to play the cutest videos ever.

	void showDucks() {
			playVideo("1LTxZ2aNytc");
		}

		void showFrog() {
			playVideo("dQw4w9WgXcQ");
		}
		
		void showFluffyUnicorns() {
			playVideo("J---aiyznGQ");
		}

		void playVideo(String videoID) {
			try {
		URI uri = new URI("https://www.youtube.com/watch?v=" + videoID );
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static void main(String[] args) {
			CutenessTV run = new CutenessTV();
			run.runner();
		}
		public void runner() {
			JPanel panel = new JPanel();
			JFrame frame = new JFrame();
			frame.add(panel);
			frame.setVisible(true);
			button3.setText("Cats:");
			button2.setText("Frog:");
			button.setText("Screaming animals:");
			panel.add(button);
			panel.add(button3);
			panel.add(button2);
			button.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);		
			frame.pack();
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {
				showDucks();
				
			}
			if(e.getSource()==button2) {
				showFrog();
				
			}
			if(e.getSource()==button3) {
				showFluffyUnicorns();
				
			}
			
		}
}
