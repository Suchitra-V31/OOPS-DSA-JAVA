package Arrays;

//Find the next 15 leap years from the year passed as parameter to the findLeapYears() method. 
//Include the year passed as parameter if it is a leap year. Implement the logic inside findLeapYears() 
//method and return an int array containing all the leap years.
		
		
public class findFifteenLeapYears {
	   public static int[] findLeapYears(int year){

			int[] leapYear = new int[15];
			int count =0;
			while(count<15){
				boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
				//System.out.println("Boolean for year ::"+ year + "-"+ isLeap);
				if(isLeap){
				    
					leapYear[count] = year;
					count++;
				}
				year++;
			}
			return leapYear;
	   }
	    
	   public static void main(String[] args) {
	       int year = 2000;
		   int[] leapYears;
		   leapYears=findLeapYears(year);
		   for ( int index = 0; index<leapYears.length; index++ ) {
		       System.out.println(leapYears[index]);
		   }
	    }
}
