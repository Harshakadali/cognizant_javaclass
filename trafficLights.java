package Lab1;

import java.util.Scanner;

public abstract class trafficLights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1.RED");
		System.out.println("2.YELLOW");
		System.out.println("3.GREEN");
		Scanner sc = new Scanner (System.in);
		System.out.println("Select one number from the above 3 :");
		int number = sc.nextInt();
		switch(number) {
		case 1:
			System.out.println("stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
			
		}
		
		
		

	}

}
