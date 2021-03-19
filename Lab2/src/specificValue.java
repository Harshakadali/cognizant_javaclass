/**
 * 
 */

/**
 * @author K.Harsha sai sankar
 * Description:write a program to find the specific value in array...
 *
 */

public class specificValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] numberList = new int[] {1,2,3,4,5,6};
		int specificValue = 9;
		boolean value = false;
		
		for(int i=0;i<numberList.length;i++) {
			if(numberList[i]==specificValue) {
				System.out.println(!value);
			}
		}
		

	}

}
