package Arrays;
import java.util.*;
public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(10);//Initialization
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.contains(20);
//		System.out.println(list);
//		list.remove(1);
//		System.out.println(list);
//		list.set(0,15);
//		System.out.println(list);
		Scanner in = new Scanner(System.in);
		// input
		for (int i = 0; i < 5; i++) {
			list.add(in.nextInt());
		}
		// get item at any index
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list);
	}

}
