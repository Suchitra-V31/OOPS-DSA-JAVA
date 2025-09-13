package OOPS;

class Teacher {
    public String teacherName;
    public String subject;
    public double salary;
    
    public Teacher(String teacherName,String subject,double salary){
        this.setTeacherName(teacherName);
        this.setSubject(subject);
        this.setSalary(salary);
    }
    public String getTeacherName(){
        return teacherName;
    }
    public void setTeacherName(String teacherName){
        this.teacherName = teacherName;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void getTeacherDetails(){
        System.out.println("Name : "+ getTeacherName() + 
        ", Subject : "+ getSubject()+ ", Salary : "+ getSalary());
    }

}

public class displayTeacherDetails {
	public static void main(String[] args) {
	    // Implement your code here 
	    Teacher object1 = new Teacher("Alex","Java Fundamentals",1200.0);
	    Teacher object2 = new Teacher("John","RDBMS",800.0);
	    Teacher object3 = new Teacher("Sam","Networking",900.0);
	    Teacher object4 = new Teacher("Maria","Python",900.0);
	    object1.getTeacherDetails();
	    object2.getTeacherDetails();
	    object3.getTeacherDetails();
	    object4.getTeacherDetails();
	}
}
