package OOPS;


public class Tester {

	public static void main(String[] args) {
		
//		// call average class to calculate average
//		FindAverageClass avg = new FindAverageClass();
//		avg.findAverage(12,8,15);
//		avg.findAverage(10,20,30);
//		
//		// without this keyword
//		withoutThis w = new withoutThis();
//		w.customerID=0;
//		w.customerName="Suji";
//		w.contactNumber = 12345553;
//		w.address="2,raj st,mumbai";
//		System.out.println("Displaying Customer Details without this keyword");
//		System.out.println("*****************************");
//		System.out.println("Customer ID : "+ w.customerID);
//		System.out.println("Customer Name : "+ w.customerName);
//		System.out.println("Customer Number : "+ w.contactNumber);
//		System.out.println("Address : "+ w.address);
		

//		Employee employee = new Employee();
//		employee.setEmployeeId("C101");
//		employee.setEmployeeName("Steve");
//		employee.setSalary(650);
//		employee.setJobLevel(4);
//
//		employee.calculateSalary();
//
//		System.out.println("Employee Details");
//		System.out.println("Employee Id: " + employee.getEmployeeId());
//		System.out.println("Employee Name: " + employee.getEmployeeName());
//		System.out.println("Salary: " + employee.getSalary());
		
        MovieTicket movieTicket = new MovieTicket(111,2);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);

	}
		

	}


