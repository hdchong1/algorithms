package basic._0.logic;

import basic._0.Common;

public class Main {

	public static void main(String[] args) {

		boolean isContinue = true;
		Common com = new Common();
		while (isContinue) {
			
			// write here
//			CountNumber_14 cntNum = new CountNumber_14();		
//			cntNum.printCountNumber(com.getInputNum(1));
			// end 	
			
			// write here
			SumNumber_9 sumNum = new SumNumber_9();		
			sumNum.printSumNumber(com.getInputNum(1));
			sumNum.printSumNumberByCharArray(com.getInputNum(1));
			// end 	

			isContinue = com.getInputYN();
		}
		com.closeScanner();		
	}
}
