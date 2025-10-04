package Keywords;

public class Static {
	int nums;
	static int arr;
	Static(int nums, int arr){
		this.nums = nums;
		Static.arr = arr;
	}
	
	void func() {
		System.out.println("The sum of number are " + nums + arr);
		function(20);
		
	}
	static void function(int n) {
		System.out.println("The sum of number are " + n + arr);
	}
	
	static void function1() {
		System.out.println(arr);
	}
}
