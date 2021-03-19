import java.util.Scanner;

/**
 * 
 */

/**
 * @author K.Harsha sai sankar
 * description:if there are odd number of string elements then (n/2)-1 elements are in upper case
 *
 */
import java.util.Arrays;
import java.util.Locale;
public class StringUppercase {
	public static void main(String[] args) {
		String[] arr = {"apple","Ball","Cat","dog","egg"};
		int n=arr.length-1;
		Arrays.sort(arr);
		int i=n/2-1;
		while(n>i) {
			System.out.println(arr[n].toUpperCase());
			n--;
		}
		
	}

}
