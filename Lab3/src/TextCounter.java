import java.util.Scanner;

/**
 * @author K.Harsha sai sankar
 *description:to count the total number od lines, words,characters in a given text...
 */

public class TextCounter{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text in normal paragraph rules and defnitions :");
		String str=sc.nextLine();
		int lineCount=str.split("\\.").length;
		int wordCount=str.split(" ").length+lineCount-1;
		int charCount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' '&&str.charAt(i)!='.')
				charCount++;
				
		}
		
			 System.out.println("Number of words :"+wordCount);
			 System.out.println("Number of lines :"+lineCount);
			 System.out.println("Number of charecters :"+charCount);
	}
}
			
		

	



