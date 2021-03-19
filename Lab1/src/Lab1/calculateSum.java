/**
 * 
 */
package Lab1;

/**
 * @author K.Harsha sai sankar
 * to calculate the sum of numbers which are divisible by 3 and 5....
 *
 */
public class calculateSum {
	public static int sum=0;
	public static int n=100;
	/**
	 * @param ar
	 */
	public static void main(String[] args) {
		
		for(int n1=n;n1>=0;n1--) {
			while(n1%3==0 || n1%5==0) {
			sum =sum+ n1;
			n1--;
			
			}
		
			
		
		}	
		System.out.println("the sum is :"+(sum-n));
	}

}
