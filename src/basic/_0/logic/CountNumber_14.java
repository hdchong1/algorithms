package basic._0.logic;

public class CountNumber_14 {

	public void printCountNumber(int inputNum) {
		
		int[] countNum = new int[10];
		
		if (inputNum==0)
			countNum[inputNum]++;
		
		while(inputNum > 0) {			
			countNum[inputNum%10]++;			
			inputNum /= 10;			
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d: %d\n", i, countNum[i]);			
		}		
	}	
}
