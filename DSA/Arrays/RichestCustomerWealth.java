package Arrays;
import java.util.*;
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6.
public class RichestCustomerWealth {
    public static void main(String[] args) {
    	int[][] accounts = new int[][]{{1,2,3},{3,2,1}};
    	System.out.print(maximumWealth(accounts));
    	
}
	public static int maximumWealth(int[][] accounts) {
        int s=0;
        List<Integer> l = new ArrayList<>();
        for(int[] i:accounts){
            for(int j=0;j<i.length;j++){
                s+=i[j];
            }
            //System.out.println(s);
            l.add(s);
            s=0;
        }
        return Collections.max(l);
        
    }
    public static int maximumWealth_1(int[][] accounts) {
        int s=0;
        int max = 1;
        for(int[] i:accounts){
            for(int j=0;j<i.length;j++){
                s+=i[j];
            }
            System.out.println(s);
            if(s>max){
                max=s;
            }
            s=0;
        }
        return max;
    }

}


