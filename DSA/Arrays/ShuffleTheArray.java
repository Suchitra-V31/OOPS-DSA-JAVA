package Arrays;
import java.util.*;
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7] 
//Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
public class ShuffleTheArray {
	public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n*2];
        int j=n;  
        int k=0;              //[2,3,4]
        for(int i=0;i<n*2;i++){ //i=0,1,2,3,4
            if(i==0 || i%2==0){
                arr[i]=nums[k]; //arr[0]=nums[0]= 2;arr[2]=nums[1]=3
                k++; //k=1,2
            }
            else{
                arr[i]=nums[j]; // arr[1]=nums[3]=3 arr[3]=nums[4]=4
                j++;//j=4,5
            }
        }
        System.out.print(Arrays.toString(arr));
        return arr;
        
    }
    public int[] shuffle_1(int[] nums, int n) {
        int arr[] = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
            arr[(2 * i) + 1] = nums[i + n];
        }
        return arr;
    }
}


