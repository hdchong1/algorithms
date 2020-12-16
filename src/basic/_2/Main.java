package basic._2;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		
		arr[0] = 1;
		arr[1] = 1;
		
		for (int i=2; i<100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println("First Method");
		for (int i=0; i<=10; i++) {
			System.out.print(arr[i]+" ");
		}
		
// second method		
		System.out.println();
		System.out.println("Second Method");
		
		int firstPrev = 1;
		int secondPrev = 1;
		System.out.print(firstPrev+" ");
		System.out.print(secondPrev+" ");		
		
		for (int i=0; i<9; i++) {
			int nextNum = firstPrev + secondPrev;
			firstPrev = secondPrev;
			secondPrev = nextNum;
			
			System.out.print(nextNum+" ");
		}	

	}

}
