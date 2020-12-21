package basic._8;

import java.util.Scanner;

import basic._0.Common;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		Common com = new Common();
		
		int inputNum = scan.nextInt();
		int ans = 1;
		
		for (int i = 1; i <= inputNum; i++) {
			ans *=i;
			
		}
		com.printNameValue("factorial_loop", ans);
		
		com.printNameValue("factorial_recursive", factorial(inputNum, 1, 0));
		
		scan.close();
	}	
	
	public static int factorial (int num, int ans, int cnt) {
		
		if (cnt==num) {
			return ans;
		}
		else {
			cnt++;
			ans*=cnt;
			return factorial (num, ans, cnt);
		}		
	}
}
