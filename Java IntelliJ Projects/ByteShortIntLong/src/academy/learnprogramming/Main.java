package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {


		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Tim" , highScorePosition);

		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Bob" , highScorePosition);

		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Percy" , highScorePosition);

		highScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition("Gilbert" , highScorePosition);

	}

	public static void displayHighScorePosition (String playerName, int highScorePosition){
		System.out.println(playerName + " managed to get into position " +highScorePosition +
				" on the high score table");
	}

	public static int calculateHighScorePosition(int score) {
		if (score >= 1000)
			return 1;
		else if (score >= 500)
			return 2;
		else if (score >= 100)
			return 3;
		else return 4;

	}

//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//		if(gameOver) {
//			int finalScore = score + (levelCompleted * bonus);
//			finalScore+=2000;
//			System.out.println("Your final score was " +finalScore);
//			return finalScore;
//		}
//		return -1;
//	}





}
