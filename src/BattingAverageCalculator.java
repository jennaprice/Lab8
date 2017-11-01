import java.util.Scanner;

/**
 * Batting Average Calculator
 * 
 * @see java.lang.Object
 * @author Jenna Price
 * @version Date: 10-30-2017
 */
public class BattingAverageCalculator {

	public static void main(String[] args) {
		int numOfBats;
		// prompt users for bases earned

		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter the number of at bats you would like to calculate:");
		numOfBats = scnr.nextInt();// needs validated
		scnr.close();

	}

}
