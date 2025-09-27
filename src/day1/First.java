package day1;

/* 
 1. Declare an array
 2. add values into array
 3. find size of an array
 4. read single value from an array
 5. read multiple values from an array
  */

public class First{
	
	public static void searchDublicate(int[] arr) {
		int n = arr.length;
		int ele = arr[0];
		int count = 1;
		for(int i = 1;i<n;i++) {
			if(arr[i] == ele) {
				count++;
			}else {
				count--;
			}
			
			if(count < 0) {
				ele = arr[i];
				count = 0;
			}
		}
		System.out.println(ele);
		
	}
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;

		int b[] = {0, 2, 0, 1, 3, 0};
		
		searchDublicate(b);
		
	}
}
