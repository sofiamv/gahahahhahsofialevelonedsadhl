package gahahahhahsofialevelonedsadhl;
import javax.swing.JOptionPane;
public class milkshakes {
private String type;
private int number;
milkshakes(int number, String type){
	this.type = type;
	this.number = number;
}
public String getType() {
	return this.type;
}
public int getNumber() {
	return this.number;
}
public void setType(String type) {
	this.type = type;
}
public void setNumber(int number) {
	if(number>=4) {
	this.number = number;
}}
public static void main(String[] args) {
	String inputflavor = JOptionPane.showInputDialog("I invite you to enter a satisfactory milkshake flavour in the box below:");
	String inputnumber = JOptionPane.showInputDialog("Next, please enter the number of milkshakes you wish to 'eat':");
	int nyoom = Integer.parseInt(inputnumber);
	milkshakes a1 = new milkshakes(nyoom, inputflavor);
	System.out.println("I'm drinking "+ a1.number +" " +a1.type + " milkshake(s).");
}}

