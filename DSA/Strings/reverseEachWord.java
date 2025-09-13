package String;

public class reverseEachWord {
    public static String reverseStr(String str){
        String s = new String();
	    for(int i=str.length()-1;i>=0;i--){
	        char ch = str.charAt(i);
	        s+=ch;
	    }
	    return s;
    }
    public static String reverseEachWords(String str){
	    //Implement your code here and change the return value accordingly
	   String finalStr = new String();
        String[] s = str.split(" ");
        for(String a : s){
            String reverseString = reverseStr(a);
            finalStr= finalStr + reverseString + " ";
        }
        //System.out.println(finalStr);
        String q = finalStr.substring(0,finalStr.length()-1);
        //System.out.println(q);
        return q;
	}
	
	public static void main(String args[]){
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWords(str));
	}
}
