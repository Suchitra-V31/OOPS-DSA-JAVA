package Arrays;
import java.util.*;
public class BuildArrayFromPermutations {
	static int[] buildArray(int[] nums) {
		int l = nums.length;
		int arr[] = new int[l];
		int j=0;
        for(int i=0;i<nums.length;i++) {
        	arr[j]= nums[nums[i]];
        	j++;
        }
        return arr;
	}
	public static void main(String[] args) {
		int[] nums = new int[]{0,2,1,5,3,4};
		int [] result = buildArray(nums);
		System.out.print(Arrays.toString(result));
		
	}
}
