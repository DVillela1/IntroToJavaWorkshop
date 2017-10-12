package day2;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		// 1.  Create a new Robot
		Robot r2d2 = new Robot();
		// 2. Make the Robot draw the first letter of your name
		r2d2.setSpeed(10);
		r2d2.penDown();
		r2d2.setRandomPenColor();
r2d2.move(99);
r2d2.turn(180);
r2d2.move(99*2);
r2d2.turn(270);
r2d2.move(90);
r2d2.turn(299);
r2d2.move(110);
r2d2.turn(299*2);
r2d2.turn(45);
r2d2.move(200);
	}

}
