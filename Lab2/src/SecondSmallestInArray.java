/*
 * K.Harsha sai sankar
 * description:to accept numbers into an array and sort and give the second smallest number....
 * 
 */


import java.util.Scanner;
import java.util.Arrays;

public class SecondSmallestInArray {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements you want in array:");
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter all the elements:");
		for(int i=0; i<n; i++)  
		{     
		a[i]=sc.nextInt();  
		}
		 Arrays.sort(a);
		 
		 System.out.println("the second smallest is :"+a[1]);
	}

}
