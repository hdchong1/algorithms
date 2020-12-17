package basic._5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		
		char[] inputArr;
		inputArr = inputStr.toCharArray();		
		
		for (int i=0; i<inputStr.length(); i++) {
			
			if (inputArr[i]>='a'&&inputArr[i]<='z') {
				
				inputArr[i] = (char) (inputArr[i]+'A'-'a');
				
			}else if (inputArr[i]>='A'&&inputArr[i]<='Z'){
				
				inputArr[i] = (char) (inputArr[i]-('A'-'a'));
				
			}
		}
		
		System.out.print(inputArr);
		
		scan.close();

	}

}
