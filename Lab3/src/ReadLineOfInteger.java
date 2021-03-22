/**
 * @author K.Harsha sai sankar
 *description:write a java program that reads line of integers and then displays each intezer and sum of all integers...
 */
import java.util.Scanner;
import java.util.StringTokenizer;
public class ReadLineOfInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items :");
		final int numberOfItems=sc.nextInt();
		int sum=0;
		String [] strArr=new String[numberOfItems];
		System.out.println("Enter the value of the items ");
		for(int i=0;i<strArr.length;i++)
			strArr[i]=sc.next();
         for(int i=0;i<strArr.length;i++)
         {
        	 sum+=(Integer.parseInt(strArr[i]));
         }
		System.out.println("the sum is :"+sum);

		

	}

}
