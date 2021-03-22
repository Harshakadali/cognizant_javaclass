/**
 * @author K.Harsha sai sankar
 *write a program in which the method in the class gives mirror of given value and both
 *of them must be divided by pipe symbol
 *
 *
 */
import java.util.Scanner;
public class MirrorImage {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String :");
	String str=sc.next();
	System.out.println(getImage(str));
    
}
private static String getImage(String pStr)
{
	//reverse is used for the string reverse
	//getter method is used
	StringBuffer reverseStr=new  StringBuffer(pStr);
	reverseStr.reverse();
	return pStr+"|"+reverseStr;

}
}
