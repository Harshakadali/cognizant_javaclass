/**
 * 
 */

/**
 * @author K.Harsha sai sankar
 *description:to get the 20 inputs and print all the positive negative odd even and 0's...
 */
import java.util.Scanner;

public class PrintByValue {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array:");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for(int i=0; i<n; i++)  
		{     
		a[i]=sc.nextInt();  
		}
		for (int i=0; i<n; i++) {
		if(a[i]>0 && a[i]!=0) {
			System.out.println("the positive numbers are :"+a[i]);
		}
		if(a[i]==0) {
			System.out.println("The zeros are :"+a[i]);
		}
		if(a[i]<0) {
			System.out.println("The negative numbers are :"+a[i]);
		}
		if(a[i]%2==0 && a[i]!=0) {
			System.out.println("the even numbers are :"+a[i]);
		}
		if(a[i]%2!=0) {
			System.out.println("the odd numbers are :"+a[i]);
		}
		
		
		}
	}

}
