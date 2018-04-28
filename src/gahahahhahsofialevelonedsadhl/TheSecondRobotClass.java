package gahahahhahsofialevelonedsadhl;

import org.jointheleague.graphical.robot.Robot;

public class TheSecondRobotClass {
Robot harry = new Robot();
private String shape;
private String imageURL;
TheSecondRobotClass(String shape, String imageURL){
	this.shape = shape;
	this.imageURL = imageURL;
	harry.changeRobot(imageURL);
}
public void setShape(String shape) {
	this.shape = shape;
}
public void setImageURL(String imageURL) {
	this.imageURL = imageURL;
	harry.changeRobot(imageURL);
}
public String getImageURL() {
	return this.imageURL;
}
public String getShape() {
	return this.shape;
}
public void Draw() {
	harry.setSpeed(100);
	if(shape.equals("Square")) {
		harry.penDown();
		for(int i = 0; i<4; i++) {
		harry.move(200);
		harry.turn(90);
		harry.setRandomPenColor();
		}
	}
	if(shape.equals("Triangle")) {
		harry.penDown();
		for(int i = 0; i<3; i++) {
			harry.move(200);
			harry.turn(60);
			harry.setRandomPenColor();
		}
	}
		if(shape.equals("Circle")) {
			harry.penDown();
			for(int i = 0; i<360; i++) {
				harry.move(3);
				harry.turn(1);
				harry.setRandomPenColor();
			}
		}
	}

}

