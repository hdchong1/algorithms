package basic._0;

import java.util.Scanner;

public class Common {
	
	private String varName;
	private int value;
	private Scanner sc = new Scanner(System.in);
	
	public String getVarName() {
		return varName;
	}
	public void setVarName(String varName) {
		this.varName = varName;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}	
	public void closeScanner() {
		sc.close();
	}
	
	public void printNameValue(String varName, int value) {
		
		System.out.println(varName + " is " + value);		
	}
	
	public int getInputNum(int i) {
		int inputNum = 0;
		
		System.out.println("input a new integer type number:");
		while(true){

			if(sc.hasNextInt()){ // 정수를 받는지 체크

				inputNum = sc.nextInt();
		        String[] lengthOfInput = sc.nextLine().split(" ");

		        if(lengthOfInput.length != 1)
		        { // 1개만 받는지 체크

		          System.err.println("1개의 숫자만 입력하세요.");
		          sc.reset();
		          continue;
		        }
		        if(inputNum >= 0) // 0 이상 자연수라면 차수 결정
		        	break;
		        else { // 음의 정수이면, 재입력 요구

		          System.err.println("0 또는 자연수를 입력하세요.");
		          sc.reset();
		          continue;
		        }
	        } else { // 실수이면, 재입력 요구

		        String[] lengthOfInput = sc.nextLine().split(" ");

		        if(lengthOfInput.length != 1)
		        { // 1개만 받는지 체크

		          System.err.println("1개의 숫자만 입력하세요.");
		          sc.reset();
		          continue;
		        }
		        
		        System.err.println("정수를 입력하세요.");				
	        }
	    }
		return inputNum;
	}

	public long getInputNum(long l) {
		System.out.println("input a new long type number:");
		long inputNum = sc.nextLong();
		return inputNum;
	}
	
	public boolean getInputYN() {

		System.out.println("run again?(Y/N)");
		String inputYN = "";
		
		while (true) {
			inputYN = sc.nextLine();
			
			if (inputYN.equalsIgnoreCase("Y"))
				return true;
			else if (inputYN.equalsIgnoreCase("N")) {
				System.out.println("goodbye");
				return false;	
			}
			else 
				System.out.println("please input Y or N");
		}
	}
	

	
//	void errorCheckNum(){ // 0또는 자연수 체크하는 메소드
//
//		while(true){
//
//			if(sc.hasNextInt()){ // 정수를 받는지 체크
//
//		        this.value = sc.nextInt();
//		        String[] lengthOfInput = sc.nextLine().split(" ");
//
//		        if(lengthOfInput.length != 1)
//		        { // 1개만 받는지 체크
//
//		          System.err.println("1개의 숫자만 입력하세요.");
//		          sc.reset();
//		          continue;
//		        }
//		        if(value >= 0) // 0 이상 자연수라면 차수 결정
//		        	break;
//		        else { // 음의 정수이면, 재입력 요구
//
//		          System.err.println("0 또는 자연수를 입력하세요.");
//		          sc.reset();
//		          continue;
//		        }
//	        } else { // 실수이면, 재입력 요구
//
//	          System.err.println("정수를 입력하세요.");				
//	          sc.next();
//	        }
//	    }
//	}
	
	


}
