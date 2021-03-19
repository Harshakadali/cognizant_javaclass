/**
 * 
 */
package Lab1;

import java.util.Scanner;

/**
 * @author K.Harsha sai sankar
 *
 */
public class primePrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get prime numbers below that number :");
		int givennum = sc.nextInt();
		int i,number,count;
		for(number=1;number<=givennum;number++)
		{
			count=0;
			for(i=2;i<=number/2;i++)
			{
				if(number%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && number !=1)
			{
				System.out.println(number);
			}
			
		}
			
	}

}
