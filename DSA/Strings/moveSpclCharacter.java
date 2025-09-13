package String;

public class moveSpclCharacter {
    public static String moveSpecialCharacters(String str){
		String s = new String();
		String newStr = new String();
		for(int i=0;i<str.length();i++){
		    char ch = str.charAt(i);
		    if(!Character.isLetterOrDigit(ch)){
		        s+=ch; 
		    }
		    else if(Character.isLetterOrDigit(ch)){
		        newStr += ch;
		    }
		}
        return newStr+s;
	}
	public static void main(String[] args) {
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
		
	}

}
