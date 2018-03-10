 package gahahahhahsofialevelonedsadhl;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	// Create a window with 2 JTextFields and 4 JButtons to function as a simple
	// calculator.
	// Each mathematical function must be contained in its own method. Display the
	// answer as a JLabel.
	float num1;
	JFrame frame = new JFrame("Calculator :D");
	JPanel panel = new JPanel();
	JButton button1 = new JButton("add");
	JButton button2 = new JButton("subtract");
	JButton button3 = new JButton("divide");
	JButton button4 = new JButton("multiply");
	JTextField text = new JTextField();
	JTextField text2 = new JTextField();
	JLabel label = new JLabel();

	public static void main(String[] args) {
		Calculator a = new Calculator();
		a.everythingelse();

	}

	public void everythingelse() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(text);
		panel.add(text2);
		text.setPreferredSize(new Dimension(70, 20));
		text2.setPreferredSize(new Dimension(70, 20));
		panel.add(label);
		frame.setVisible(true);
		frame.setSize(380, 150);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {

		}
	}
}
