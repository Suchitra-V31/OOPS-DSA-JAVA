package String;

public class removeDuplicatesandSpaces {
    public static String removeDuplicatesandSpace(String str){
        //Implement your code here and change the return value accordingly
        String result = "";
        str = str.replace(" ","");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(result.indexOf(ch)==-1){
                result+=ch;
            }
        }
        return result;
	}
	
	public static void main(String args[]){
	    String str = "object oriented programming";
	    System.out.println(removeDuplicatesandSpace(str));
	}
}
