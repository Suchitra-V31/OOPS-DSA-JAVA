package String;

public class isPallindrome {
    public static boolean checkPalindrome(String str){
	    String s = new String();
	    //System.out.println(str.length());
	    for(int i=str.length()-1;i>=0;i--){
	        char ch = str.charAt(i);
	        s+=ch;
	    }
	    if(s.equals(str)){
	        return true;
	    }
	    else{
	        return false;
	    }
        //return false;
	}
	public static void main(String args[]){
		String str = "radaru";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}
