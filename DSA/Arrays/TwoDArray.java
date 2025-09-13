package Arrays;
import java.util.*;
public class TwoDArray {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Scanner  input = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) { // to get input 
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = input.nextInt();
			}
		}
//		for(int i=0;i<arr.length;i++) { // to print array
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		for(int[] i:arr) { // to print array elements - using enhanced for loop
			System.out.print(Arrays.toString(i));
		}
		
	}
}
