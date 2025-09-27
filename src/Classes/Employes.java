package Classes;

public class Employes {
	public int id;
	public String name;
	public String department;
	int salary;
	
	public void display() {
		System.out.println("The Employe with id:" + id + " and name:" + name);
		System.out.println("from department: "+ department + " has a salary of Rs."+salary);
	}
	
}
