/**
 * 
 */

/**
 * @author K.Harsha sai sankar
 * write a java program to convert an arraylist to array...
 *
 */
import java.util.ArrayList;
public class arrayListToArray {

	/**
	 * @param args
	 */
		  public static void main(String[] args) {
		    ArrayList<String> names= new ArrayList<>();

		    // Add elements in the arraylist

		    names.add("Apple");
		    names.add("Ball");
		    names.add("Cat");
		    names.add("Dog");
		    
		    System.out.println("ArrayList: " + names);

		    // Create a new array of String type
		    String[] arr = new String[names.size()];

		    // Convert ArrayList into the string array
		    names.toArray(arr);
		    System.out.print("Array: ");
		    for(String item:arr) {
		      System.out.print(item+", ");
		    }
		  }
		

	

}
