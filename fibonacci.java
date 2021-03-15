/**
 * 
 */
package Lab1;

import java.util.Scanner;

/**
 * @author K.Harsha sai sankar
 *
 */
public class fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth number for fibonacci series :");
		int number = sc.nextInt();
		int num1=1;
		int num2=1;
		int num=0;
		System.out.println(num1);
		System.out.println(num2);
		while(number!=0) {
			num = num1 + num2;
			num1=num2;
			num2=num;
			System.out.println(num);
			number--;
		}
		
	}

}
