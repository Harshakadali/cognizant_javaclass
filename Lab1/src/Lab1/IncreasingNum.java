/**
 * 
 */
package Lab1;
import java.util.Scanner;

/**
 * @author K.Harsha sai sankar...
 * description: check the given number is increasing or not means 12345 is a increasing number....
 *
 */
public class IncreasingNum {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int number=sc.nextInt();
			if(checkNumber(number)==true)
				System.out.println("Increasing Number");
			else
				System.out.println("Not an increasing Number");
			}
			public static boolean checkNumber(int number)
			{
				String str=Integer.toString(number);
				int count=0;
				boolean status=false;
				for(int i=0;i<str.length()-1;i++)
				{
					if(str.charAt(i)<=str.charAt(i+1))
					{
						count++;
					}
				}
				if(count==str.length()-1)
				{
					status=true;
				}
				else
				{
					status=false;
				}
				return status;	
			}
		

		
		

	

}
