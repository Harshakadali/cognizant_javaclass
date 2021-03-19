/**
 * 
 */
package Lab1;

/**
 * @author K.Harsha sai sankar
 * description:create a class with a method to find the difference between sum of the squares and square of sum of 
 * the numbers
 *
 */
import java.util.Scanner;
public class CalculateDifference {
	public static int n;
	public static int sum;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the value for calculation :");
		n=in.nextInt();
		int k = n;
		int sum1=0,sum2=0;
		int square1=0,square2=0;
		
		for(int i=n;i>=0;i--) {
			 sum1  = sum1 + n;
			 int square = n*n;
			 n--;
			 square1=square1+square;
			 }
		 System.out.println(square1);
		 
		 for (int j=k;j>=0;j--) {
			 sum2=sum2+k;
			 k--;
			 square2=sum2*sum2;
			 
		 }
		 System.out.println(square2);
		 
		 int sum= square1 - square2;
		 System.out.println(sum);
		
		
		

	}

}
