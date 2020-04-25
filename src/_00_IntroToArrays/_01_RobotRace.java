package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		boolean end = false;
		int robotNumber;
		// 2. create an array of 5 robots.
		Robot[] robot = new Robot[7];
		// 3. use a for loop to initialize the robots.
		int RobotX = 100;
		for (int i = 0; i < robot.length; i++) {
			robot[i] = new Robot();

			// 4. make each robot start at the bottom of the screen, side by side, facing u
			robot[i].setX(RobotX);
			robot[i].setY(550);
			RobotX += 100;

		}
		while (end == false) {
			// 5. use another for loop to iterate through the array and make each robot move
			// a random amount less than 50.
			Random random = new Random();
			RobotX = 100;
			for (int i = 0; i < robot.length; i++) {
				robot[i].setSpeed(10);
				robot[i].move(random.nextInt(51));
				random = new Random();
				RobotX += 100;
			}
			// 6. use a while loop to repeat step 5 until a robot has reached the top of the
			// screen.
			for (int i = 0; i < robot.length; i++) {
				if (robot[i].getY() <= 0) {
					end = true;

					// 7. declare that robot the winner and throw it a party!
					robotNumber = i + 1;
					JOptionPane.showMessageDialog(null, "Robot " + robotNumber + " won the race!");
				}
			}
		}
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}

}
