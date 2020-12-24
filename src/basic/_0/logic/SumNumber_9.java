package basic._0.logic;

public class SumNumber_9 {
	
	public void printSumNumber(int inputNum){
		
		int sum=0;
		while (inputNum > 0) {
			
			sum += (inputNum%10);
			inputNum /= 10;
			
		}
		
		System.out.println("Sum is "+sum);
	}
	
	public void printSumNumberByCharArray(int inputNum) {
		
		int sum=0;
		String inputStr = Integer.toString(inputNum);
		char[] inputChrArr = inputStr.toCharArray();
		
		for (char c : inputChrArr) {
			sum += Character.getNumericValue(c);
		}
		
		System.out.println("Sum is "+sum);
	}

}
