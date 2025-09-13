package Arrays;

public class findingSalary {
    
    public static double[] findDetails(double[] salary) {
        //Implement your code here and change the return value accordingly
        double[] arr = new double[3];
        double sum = 0.0;
        double avg;
        for(double d : salary){
            sum += d;
        }
        avg = sum/salary.length;
        arr[0] = avg;
        double count1 = 0.0;
        double count2= 0.0;
        for(double d : salary){
            if(d>avg){
                count1+=1;
                arr[1] = count1;
            }
            else if(d<avg){
                count2+=1;
                arr[2] = count2;
            }
        }
        
        return arr;     

    }
       
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}
