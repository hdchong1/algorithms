package basic._2;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		
		arr[0] = 1;
		arr[1] = 1;
//		arr[2] = 2;
		
		for (int i=2; i<100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for (int i=0; i<=10; i++) {
			System.out.println(arr[i]+" ");
		}

	}

}
