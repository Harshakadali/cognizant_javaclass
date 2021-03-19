/**
 * 
 */

/**
 * @author K.Harsha sai sankar
 * date:16/03/21
 * Description:Exersise 1:write a program to get list of values with duplicate values....
 *
 */
public class dupVal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,23,4,5,40,86,5,50,1,2};
		
		System.out.print("Duplicate values in above array are :");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
				System.out.println(arr[j]);
			}
		}
		
		

	}

}
