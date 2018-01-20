package gahahahhahsofialevelonedsadhl;
import java.util.Random;

import javax.swing.JOptionPane;
public class MethodWritingTwo {
static String present(String a){
	if(a.equals("Hermione")) {
	return "Giraffe";
	}
	else if(a.equals("Tristan")) {
		return "jacket";
		}
	else if(a.equals("Cian")) {
		return "donut";
		}
	else {
		JOptionPane.showMessageDialog(null, "I don't know what "+ a + " wants for Christmas.");
		return "unknown";
		}
}
static boolean pigseat(String food) {
	if(food.equals("bananas")) {
		return false;
	}
	else {
		return true;
	}
}
static int getluckynumber() {
 Random ran = new Random();
	 int rando = ran.nextInt(655) + 13;
	return rando;
}
static int eggsmomwants() {
	Random ran = new Random();
	 int rando = ran.nextInt(8);
	return rando;
}
static int eggsdadwants() {
	Random ran = new Random();
	int rando = ran.nextInt(8);
	return rando;
}
static int eggscatwants() {
 Random ran = new Random();
	 int rando = ran.nextInt(8);
	return rando;
}
static int eggseveryonewants() {	
	return eggscatwants() + eggsmomwants() + eggsdadwants();
}
static int getAverageheight(int fdsasdf) {
	if(fdsasdf > 100) {
		return 34;
	}else if (fdsasdf >= 50 && fdsasdf <= 100) {
		return 30;
	}
	else if (fdsasdf >= 10 && fdsasdf <= 49) {
		return 26;
	}
	else {
		return 14;
	}
}
public static void main(String[] args) {
System.out.println(present("Hermione"));
System.out.println(present("Tristan"));
System.out.println(present("Cian"));
System.out.println(pigseat("quesadillas"));
System.out.println("Your lucky number is " + getluckynumber() + ".");
System.out.println("Mom wants " + eggsmomwants() + " eggs.");
System.out.println("Dad wants " + eggsdadwants() + " eggs.");
System.out.println("Daniel wants " + eggscatwants() + " eggs.");
System.out.println("Everyone wants " + eggseveryonewants() + " eggs.");
String a = JOptionPane.showInputDialog("Enter an integer:");
int b = Integer.parseInt(a);
System.out.println(getAverageheight(b));

}
}
