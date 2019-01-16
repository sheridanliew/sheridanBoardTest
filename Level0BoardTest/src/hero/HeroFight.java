package hero;

public class HeroFight {
	/*
	 * A hero is on his way to the castle to complete his mission. However, he has
	 * been told that the castle is surrounded with several powerful dragons! Each
	 * dragon takes 2 bullets to be defeated; our hero has no idea how many bullets
	 * he should carry... Assuming he is going to grab a specific given number of
	 * bullets and move forward to fight another specific given number of dragons,
	 * will he survive? Return True if he survives, and False otherwise. :)
	 */
	public static boolean hero(int bullets, int dragons) {
		// TODO Write your method here
		if (dragons * 2 <= bullets) {
			return true;
		}
		return false;
	}
}
