package OOPS;


class Student {
	private int[] marks;
	private char[] grade;
		
	public Student(int[] marks) {
		this.marks = marks;
		this.grade = new char[marks.length];
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setGrade(char[] grade) {
		this.grade = grade;
	}
	public char[] getGrade() {
		return grade;
	}
	public void findGrade() {
		for(int i=0;i<marks.length;i++) {
			int mark = marks[i];
			if(mark>=92) {
				grade[i] = 'E';
			}else if(mark>=85 && mark<92) {
				grade[i] = 'A';
			}else if(mark>=70 && mark<85) {
				grade[i] = 'B';
			}else if(mark>=65 && mark<70) {
				grade[i] = 'C';
			}
			else if(mark<65) {
				grade[i] = 'D';
			}
		}
	}
}
public class displayGradeForEachMark {
	public static void main(String[] args) {
		int[] marks = { 79, 87, 97, 65, 78, 99, 66 }; 
		Student student = new Student(marks);
		student.findGrade();
        System.out.println("Grades corresponding to the marks are : ");
		char[] grades = student.getGrade();
		for (int index = 0; index < grades.length; index++) {
			System.out.print(grades[index] + " ");
		}
	}
}
