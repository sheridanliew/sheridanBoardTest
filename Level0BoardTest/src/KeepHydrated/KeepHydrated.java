package KeepHydrated;

public class KeepHydrated {
	/**
	 * Nathan loves cycling.
	 * 
	 * Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres
	 * of water per hour of cycling.
	 * 
	 * Given the time in hours, you need to return the number of litres Nathan will
	 * drink, truncated to the smallest value.
	 * 
	 * <pre>
	 * For example:
	 * 
	 * time = 3 ----> litres = 1
	 * 
	 * time = 6.7---> litres = 3
	 * 
	 * time = 11.8--> litres = 5
	 * </pre>
	 **/
	public int Liters(double time) {
		// TODO Write your method here
		int litres = (int) (time / 2);
		return litres;
	}

}
