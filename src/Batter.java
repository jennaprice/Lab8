import java.util.Scanner;

public class Batter {

	private String name;
	private double battingAverage;
	private double sluggingPercentage;
	private int[] atBatRecord;

	public Batter(int numOfAtBats) {
		name = "John Smith";
		atBatRecord = new int[numOfAtBats];
		sluggingPercentage = 0;
		battingAverage = 0;

	}

	public Batter(int[] atBats) {
		atBatRecord = atBats;
		sluggingPercentage = 0;
		battingAverage = 0;
		name = "John Smith";

	}

	public Batter(int atBats, String batterName) {
		atBatRecord = new int[atBats];
		sluggingPercentage = 0;
		battingAverage = 0;
		name = batterName;

	}

	public void recordBats(Scanner in) {

		System.out.println("0 = out, 1 = single,2 = double, 3 = triple, 4 = home run");

		for (int i = 0; i < atBatRecord.length; i++) {
			System.out.println("Result for at-bat " + i + ":");
			atBatRecord[i] = in.nextInt();// needs to be validated
		}
	}

	public double calculateSluggingPercentage() {
		double basesEarned = 0;
		// calculate slugging percentage = total number of bases earned/ total number at
		// bats
		for (int i : atBatRecord) {
			basesEarned = basesEarned + i;
		}
		sluggingPercentage = basesEarned / (double) atBatRecord.length;
		return sluggingPercentage;
	}

	public double calculateBattingAverage() {
		// calculate batting average= total number at bats(which the player earned at
		// least one base)/total number at bats
		double totalAtBats = 0;
		for (int i : atBatRecord) {
			if (i != 0) {
				totalAtBats++;
			}

		}
		battingAverage = totalAtBats / (double) atBatRecord.length;
		return battingAverage;
	}

	public String getName() {
		return name;
	}

}
