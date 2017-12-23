package gahahahhahsofialevelonedsadhl;
/**
 * The Tea Party
 * 
 * Description
 * 
 * You are dead – but that doesn’t mean you can’t throw a social event. In heaven you are famous for your
 * extraordinary tea parties. This time the guest list is quite astonishing – 8 famous British people
   * announced their visit. So don’t mess up!
 * 
 * Your task is to welcome your guests properly: Some are female and some were knighted by the queen. So greet
 * them correctly – or this will be your last hosting.
 * 
 * For example: -Jane Austen is a women, so say Hello Ms. Austen -George Orwell is a man, so say Hello Mr.
 * Orwell -Isaac Newton was knighted, so say Hello Sir Newton
 * 
 * Here are unit tests you can use to check your welcome method: http://bit.ly/1ou3kOG
 *
 * Good luck with your party!
 **/
public class TeaParty {
private String lastName;
private boolean isWoman;
private boolean isKnighted;
TeaParty(){
	this.lastName = lastName;
	this.isWoman = isWoman;
	this.isKnighted = isKnighted;
}
public String welcome(String lastName, boolean isWoman, boolean isKnighted) {
if(isWoman==true) {
	System.out.println("Welcome Ms. "+lastName +".");
}
else if(isKnighted== true) {
	System.out.println("Welcome sir "+ lastName+".");
} 
else {
	System.out.println("Welcome Mr. "+ lastName+".");
}
return this.lastName;
}



public static void main (String[] args){
	TeaParty a1 = new TeaParty();
	a1.welcome("Spencer", true, false);
	TeaParty a2 = new TeaParty();
	a2.welcome("Newton", false, true);
	TeaParty a3 = new TeaParty();
	a3.welcome("Churchill", false, false);
	TeaParty a4 = new TeaParty();
	a4.welcome("Lennon", false, false);
	TeaParty a5 = new TeaParty();
	a5.welcome("Elizabeth I", true, false);
	TeaParty a6 = new TeaParty();
	a6.welcome("John", false, true);
	TeaParty a7 = new TeaParty();
	a7.welcome("Cromwell", false, false);
	TeaParty a8 = new TeaParty();
	a8.welcome("Bowie", false, false);
}
}



