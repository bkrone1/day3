
public class SimulatingBowling {

	public static void main(String[] args) {
		int frames = 10;
		int pins = 11;
		int totalScore = 0;
		for (int i = 1; i <= frames; i++) {


				int throw1 = (int) (Math.random() * pins);
				if (throw1 == 10) {
					totalScore += throw1;
					System.out.println("STRIKE!");
					System.out.println(totalScore);
					System.out.println();
				} else {
					int throw2 = (int) (Math.random() * (pins - throw1));
					if (throw1 + throw2 == 10) {
						System.out.println(throw1);
						System.out.println("SPARE!");
					} else {
						System.out.print(throw1 + " ");
						System.out.print(throw2);
						System.out.println();
							
					}
					int score = (throw1 + throw2);
					totalScore = totalScore + score;
					System.out.println(totalScore);
					System.out.println();
			}
		}
	}
}