package basic._3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] inputNum = new int[10];
		for (int i=0; i<10; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		int[] mode = new int[10];
		int modeNum = 0;
		int modeCnt = 0;
		
		for (int i = 0; i<10; i++) {
			mode[inputNum[i]]++;
		}
		
		
		for (int i = 0; i<10; i++) {
			if (modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.print("modeNum is "+modeNum+", modeCnt is "+modeCnt);
		
		
		System.out.println();
		System.out.println("Second Method");
		int[] max = new int[10];
		int maxNum = inputNum[0];
		int maxCnt = 0;
		int cnt = 0;
		 
//		System.out.println("0 maxNum is "+maxNum+", maxCnt is "+maxCnt);

		for (int i=0; i<10; i++) {
			
			cnt = ++max[inputNum[i]];
			
			if (maxCnt < cnt) {
				maxCnt = cnt;
				maxNum = inputNum[i];
			};
//			System.out.println(i+" maxNum is "+maxNum+", maxCnt is "+maxCnt);
			
		}		
		System.out.print("maxNum is "+maxNum+", maxCnt is "+maxCnt);
		
		scan.close();
		
	}

}
