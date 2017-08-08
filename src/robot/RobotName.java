package robot;

import org.jointheleague.graphical.robot.Robot;

public class RobotName {
	public static void main(String[] args) {
		Robot robot = new Robot();
		
		robot.penDown();
		robot.setSpeed(10);
		
		//M
		robot.move(200);
		robot.turn(150);
		robot.move(100);
		robot.turn(-120);
		robot.move(100);
		robot.turn(150);
		robot.move(200);
		
		robot.penUp();
		robot.turn(-90);
		robot.move(50);
		robot.turn(-90);
		robot.penDown();
		
		//I
		robot.move(150);
		robot.penUp();
		robot.move(40);
		robot.penDown();
		robot.move(15);
		
		robot.penUp();
		robot.turn(90);
		robot.move(50);
		robot.turn(90);
		robot.penDown();
		
		//L
		robot.move(200);
		robot.turn(-90);
		robot.move(75);
		
		robot.penUp();
		robot.move(50);
		robot.penDown();
		
		//E
		robot.move(75);
		robot.turn(180);
		robot.move(75);
		robot.turn(90);
		robot.move(100);
		robot.turn(90);
		robot.move(75);
		robot.turn(180);
		robot.move(75);
		robot.turn(90);
		robot.move(100);
		robot.turn(90);
		robot.move(75);
		
		robot.penUp();
		robot.move(125);
		robot.turn(180);
		robot.penDown();
		
		//S
		robot.move(75);
		robot.turn(-90);
		robot.move(100);
		robot.turn(-90);
		robot.move(75);
		robot.turn(90);
		robot.move(100);
		robot.turn(90);
		robot.move(75);
		
		robot.penUp();
		robot.turn(180);
		robot.move(100);
		robot.turn(90);
		robot.move(20);
		robot.turn(90);
		robot.penDown();
		
		robot.move(600);
		
	}	
}
