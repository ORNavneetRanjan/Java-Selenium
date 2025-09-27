package Constructor;

public class Student {
	String name;
	int roolno;
	String FavorateSubject;
	
	Student(){		
		this.name = "Unknown";
		this.roolno = 0;
		this.FavorateSubject = "Not Assigned";
	}
	
	Student(String name, int rollno, String subject){
		this.name = name;
		this.roolno = rollno;
		this.FavorateSubject = subject;
	}
	
	void Display() {
		System.out.println(name + " " + roolno + " " + FavorateSubject);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Display();
		
		Student s2 = new Student("Aman", 101, "Maths");
		s2.Display();
		
		Student s3 = new Student("Ravi", 102, "Science");
		s3.Display();
		
		Student s4 = new Student("Sita", 103, "English");
		s4.Display();
	}
}
