/**
 * 
 */

/**
 * @author K.Harsha sai sankar
 * Description : Write a program to get the sorted list of products name
 *
 */
import java.util.Arrays;
import java.util.Collections;

public class productSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] list = new String[] {"appple","cape","ball","ice","dress"};
		Arrays.sort(list,Collections.reverseOrder());
		System.out.println("Array elements in descending order: " +Arrays.toString(list)); 
		Arrays.sort(list);
		System.out.println("Array elements in asending order: " +Arrays.toString(list));
		
		

	}

}
