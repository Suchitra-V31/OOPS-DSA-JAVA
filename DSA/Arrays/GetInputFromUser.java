package Arrays;
import java.util.*;
public class GetInputFromUser {
	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner input = new Scanner(System.in);
		for(int i =0;i<arr.length;i++) {
			arr[i]=input.nextInt(); // getting i/p
		}
		System.out.print(Arrays.toString(arr));
		arr[0] = 0; // to update / assign elements to an array
		System.out.print(Arrays.toString(arr));
		
		
	}
}
