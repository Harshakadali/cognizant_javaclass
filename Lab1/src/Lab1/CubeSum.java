package Lab1;


/**
 * @author K.Harsha sai sankar
 *description: to get the sum after cubing all the numbers below ...
 */
public class CubeSum {
	public static int number=98765;
	static int totalsum=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		while(number!=0) {
			int remainder = number % 10;
			int sum =  remainder* remainder* remainder;
			number = number / 10;
			//System.out.println(sum);
		    totalsum +=sum;
			//System.out.println(totalsum);
		
		}
		System.out.println(totalsum);
	}

}
