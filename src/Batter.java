
public class Batter {

	private double battingAverage;
	private double sluggingPercentage;
	private int[] atBatRecord;

	public Batter(int numOfAtBats) {
		atBatRecord = new int[numOfAtBats];
		sluggingPercentage = 0;
		battingAverage = 0;

	}

	public Batter(int[] atBats) {
		atBatRecord = atBats;
		sluggingPercentage = 0;
		battingAverage = 0;

	}

	public void recordBats(int[] atBats) {
		atBatRecord = atBats;
	}

	public double calculateSluggingPercentage() {
		double basesEarned = 0;
		// calculate slugging percentage = total number of bases earned/ total number at
		// bats
		for (int i : atBatRecord) {
			basesEarned = +i;// check the math
		}
		sluggingPercentage = basesEarned / atBatRecord.length;
		return sluggingPercentage;
	}

	public double calculateBattingAverage() {
		// calculate batting average= total number at bats(which the player earned at
		// least one base)/total number at bats
		double totalAtBats = 0;
		for (int i : atBatRecord) {
			if (i != 0) {
				totalAtBats = +i;
			}
		}
		battingAverage = totalAtBats / atBatRecord.length;
		return battingAverage;
	}

}
