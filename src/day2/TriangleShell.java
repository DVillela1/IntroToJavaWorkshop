package day2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	
	Robot bot = new Robot();
	
	
	void go() {
		 // 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible

		// 4. make a variable to hold the length of the triangle and set it to 50
int kay = 50;
		// 7. Do the following (up to step 10) 60 times
for (int i = 0; i < 2; i++) {
	kay+=10;
	bot.setRandomPenColor();
	bot.turn(6);

			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length variable by 10
	
			// 5. call your drawTriangle() method using your length variable
	drawTriangle(kay);
			// 10. Turn the robot 6 degrees to the right
}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
		bot.penDown();
		bot.setSpeed(10);
		for (int i = 0; i < 2; i++) {
			bot.move(length);
			bot.turn(360/10);
		}
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
