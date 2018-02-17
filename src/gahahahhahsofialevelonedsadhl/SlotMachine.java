package gahahahhahsofialevelonedsadhl;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class SlotMachine implements ActionListener {
	JLabel label = new JLabel(new ImageIcon("pg.jpg"));
	JFrame frame;
	JButton button4 = new JButton("spin");

	public static void main(String[] args) {
		SlotMachine aa = new SlotMachine();
		aa.a();
	}

	public void a() {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame("Slot Machine");
		panel.add(label);
		panel.add(button4);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		button4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button4) {

		}
	}
}
