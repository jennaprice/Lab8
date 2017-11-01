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
		String batterName;
		// prompt users for bases earned

		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter your batter's name:");
		batterName = scnr.nextLine();
		System.out.println("Please enter the number of at bats you would like to calculate:");
		numOfBats = scnr.nextInt();// needs validated
		Batter batter1 = new Batter(numOfBats, batterName);
		batter1.recordBats(scnr);
		System.out.printf(batter1.getName() + "'s batting Average is %.3f", batter1.calculateBattingAverage());
		System.out.println();
		System.out.printf(batter1.getName() + "'s slugging Percentage is %.2f", +batter1.calculateSluggingPercentage());
		scnr.close();

	}

}
