package String;

public class findingHighestFreqChar {
	public static int findHighestOccurrence(String str){
		//Implement your code here and change the return value accordingly
        int[] freq = new int[str.length()];
        char[] ch = str.toCharArray(); // converts char into array

        // Count frequencies
        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0'; // mark duplicate
                }
            }
        }

        // Find max
        int maxFreq = -1;
        for (int i = 0; i < freq.length; i++) {
            if (ch[i] != '0' && freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }
        return maxFreq;
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}
}
