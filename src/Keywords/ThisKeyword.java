package Keywords;

public class ThisKeyword {

	private int nums;
	private String name;
	
	ThisKeyword(int nums, String name){
		this.nums = nums;
		this.name = name;
	}
	
	void display() {
		System.out.println("The number is " + nums + " " + name);
	}
	
	void func() {
		this.display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword tk = new ThisKeyword(12, "Navneet");
		tk.func();
		

	}

}
