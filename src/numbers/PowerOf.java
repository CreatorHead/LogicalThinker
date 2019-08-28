package numbers;

public class PowerOf {
	/**
	 * Power of a number
	 */
	public static int powOf(int num, int power){
		int result = 1;
		for(int i=0;i<power;i++){
			result = result * num;
		}
		return result;
	}
}
