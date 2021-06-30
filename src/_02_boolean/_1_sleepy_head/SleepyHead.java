package _02_boolean._1_sleepy_head;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        
	String day = JOptionPane.showInputDialog("What day is it?");
		
		// Set the boolean isWeekend based on the value they enter
		
		if (day.equalsIgnoreCase("saturday")||day.equalsIgnoreCase("sunday")) {
			isWeekend = true;
			JOptionPane.showMessageDialog(null, "You can sleep in");
		}
		else {
			isWeekend = false;
			JOptionPane.showMessageDialog(null, "Go to school");
		}
	
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam

		String score = JOptionPane.showInputDialog("What score did you get on your last exam");
		int scoreint = Integer.parseInt(score);
		if (scoreint >= 70) {
			passedExam = true;
			JOptionPane.showMessageDialog(null, "Nice");
		}
		else {
			passedExam = false;
			JOptionPane.showMessageDialog(null, "too bad");
		}
		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		JOptionPane.showMessageDialog(null, "The game is over");
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String color = JOptionPane.showInputDialog("What color do you want");
		if (color.equalsIgnoreCase("red")) {
			isRed = true;
		}
		else {
			isRed = false;
		}
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		
		String shape = JOptionPane.showInputDialog("What shape do you want?");
		if (shape.equalsIgnoreCase("square")) {
			isSquare = true;
		}
		else {
			isSquare = false;
		}
		
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		if(isRed && isSquare) {
			drawRedSquare();
		}

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		rob.setSpeed(10000);
		rob.penDown();
		rob.setPenColor(250, 1, 2);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		// Complete the rest of this method
	}	
}

//class MyPanel extends JPanel{
//	public void paint(Graphics g) {
//		g.setColor(Color.RED);
//		g.fillRect(10, 10, 100, 100);
//	}
//}
