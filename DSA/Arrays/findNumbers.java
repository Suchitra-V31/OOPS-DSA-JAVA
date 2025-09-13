package Arrays;

//Implement the method findNumbers accepting two numbers num1 and num2 based on the conditions given below:
//
//Validate that num1 should be less than num2
//
//If the validations are successful
//
//populate all the 2 digit positive numbers between num1 and num2 into the provided numbers array if
//
//sum of the digits of the number is a multiple of 3
//
//number is a multiple of 5
//Return the numbers array
public class findNumbers {
    public static int findSum(int num){
        int unitDigit=0;
        int sum=0;
        int temp=num;
        while(temp>0){
            unitDigit = temp%10;
            sum+=unitDigit;
            temp/=10;
        }
        return sum;
    }
	public static int[] findNumbers(int num1, int num2) {
	    int j=0;
	    String n1 = Integer.toString(num1);
	    String n2 = Integer.toString(num2);
		int[] numbers = new int[6];
        if((n1.length()==2 || n2.length()==2) && num1<num2){
            for(int i=num1;i<=num2;i++){
                //System.out.println("i" + i);
                if(i>=10 && j<6){
                    int s = findSum(i);
                    //System.out.println(s);
                    if(s%3==0 && i%5==0){
                        numbers[j]=i;
                        j++;
                    }
                    
                }
                
            }
        }

		return numbers;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}
}
