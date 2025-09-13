package Arrays;
import java.util.*;
public class PrintElementsInAnArray {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println(Arrays.toString(arr)); // print all elements in a list with comma seperated
		for(int i=0;i<arr.length;i++) { // to access elements using index
			System.out.println(arr[i]);
		}
		for(int i:arr) { // to access elements directly
			System.out.println(i);
		}
	}

}
