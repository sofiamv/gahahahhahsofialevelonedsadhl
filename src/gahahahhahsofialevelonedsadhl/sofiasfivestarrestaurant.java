package gahahahhahsofialevelonedsadhl;
import javax.swing.JOptionPane;
public class sofiasfivestarrestaurant {
private String guest;
private String food;
private String drink;
private boolean isBirthday;
sofiasfivestarrestaurant(String guest, String food, String drink, boolean isBirthday){
	this.food = food;
	this.drink = drink;
	this.isBirthday = isBirthday;
	this.guest = guest;
}
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Welcome to Sofia's five star restaurant! I'm your waiter Basal Ganglia.");
	String inputGuest = JOptionPane.showInputDialog("First inquiry: what is your name?");
	String inputFood = JOptionPane.showInputDialog("That is an exceptional name. What would you like to eat today?");
	String inputDrink = JOptionPane.showInputDialog("What would you like to drink today? Refills are free.");
	String inputBDay = JOptionPane.showInputDialog("Finally: is it your Birthday?");
	JOptionPane.showMessageDialog(null, "Thank you. You're order");
	sofiasfivestarrestaurant a1 = new sofiasfivestarrestaurant();
}
}
