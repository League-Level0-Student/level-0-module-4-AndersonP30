package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = JOptionPane.showInputDialog("what is your test score");
		
		double score = Double.parseDouble(test);
		
		if (score >= 80) {
			JOptionPane.showMessageDialog(null, "Great job");
		}
		else JOptionPane.showMessageDialog(null, "Do better");
	}

}
