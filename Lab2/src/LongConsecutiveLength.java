/*
 * K.Harsha sai sankar.
 * Demonstration:to print  the longest consecutine numbers and length....
 * 
 * 
 */
import java.util.HashSet;
public class LongConsecutiveLength {
    
public static void main(String[] args) {
	int nums[] = {50,1,3,4,56,8,9,10};  
	System.out.println("Original array length: "+nums.length);
	System.out.print("Array elements are: ");
		       for (int i = 0; i < nums.length; i++)
		        {
		            System.out.print(nums[i]+" ");
		        }
				System.out.println("\nThe new length of the array is: "+longestSequence(nums));
					
		    }
		    
		    public static int longestSequence(int[] nums) {
		      final HashSet<Integer> h_set = new HashSet<Integer>();
		        for (int i : nums) h_set.add(i);

		        int longestSequenceLen = 0;
		        for (int i : nums) {
		            int length = 1;
		            for (int j = i - 1; h_set.contains(j); --j) {
		                h_set.remove(j);
		                ++length;
		            }
		            for (int j = i + 1; h_set.contains(j); ++j) {
		                h_set.remove(j);
		                ++length;
		            }
		            longestSequenceLen = Math.max(longestSequenceLen, length);
		        }
		        return longestSequenceLen;
		    }
		

	}


