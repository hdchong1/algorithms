package basic._7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int inputNum = scan.nextInt();
		int cnt = 1;
		String typeNum = "prime";
		
		for (int i = 2; i <= inputNum/2; i++) {
			
			cnt = i;
			if (inputNum%i == 0) {
				typeNum = "regular";
				break;
			}
		}				
		System.out.println(cnt);
		System.out.println(inputNum + " 1nd is "+ typeNum);
		
		
		cnt = 1;
		typeNum = "prime";
		if (inputNum%2 == 0 && inputNum/2 > 1) {
			
			typeNum = "regular";
		}else {
			while ("prime".contentEquals(typeNum) || inputNum/2 < cnt) {
				
				if (inputNum%cnt == 0 && cnt > 1) {
					typeNum = "regular";
				}
				
				cnt+=2;			
			}	
			System.out.println(cnt/2);
		}
		System.out.println(inputNum + " 2st is "+ typeNum);
		
		scan.close();
	}

}
