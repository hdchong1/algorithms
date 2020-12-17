package basic._6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// the greatest common divisor

		Scanner scan = new Scanner(System.in);
		
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		
		int small = Math.min(firstNum, secondNum);
		int gcd0 = 1;
		int cnt0 = 0;
		
		for (int i = small; i >= 1; i--) {
			cnt0++;
			if (firstNum%i == 0 && secondNum%i ==0) {
				gcd0 = i;
				break;
			}
		}		
		System.out.println("cnt0:"+cnt0);
		System.out.println(gcd0);
	
		
		int gcd1 = 1;
		int cnt1 = 0;
		for (int i = 1; i <= small; i++) {
			cnt1++;
			if (firstNum%i == 0 && secondNum%i ==0) {
				gcd1 = i;
			}
			
		}		
		
		System.out.println("cnt1:"+cnt1);
		System.out.println(gcd1);
		
// second algorithm		
		
		int firstDivNum = firstNum;
		int secondDivNum = secondNum;
		
		int gcd2 = 1;
		int cnt2 = 0;
		
		int i = 2;
		while (firstDivNum/i>0 && secondDivNum/i>0) {
			cnt2++;
			if (firstDivNum%i == 0 && secondDivNum%i == 0) {
				
				firstDivNum /= i;
				secondDivNum /= i; 
				gcd2 *= i;
				
//				System.out.println(firstDivNum+";"+secondDivNum+";"+i);
			} else {
				i++;
			}
		}
		
		System.out.println("cnt2:"+cnt2);
		System.out.println(gcd2);
		
// forth algorithm		
		
		int smallDivNum = Math.min(firstNum, secondNum);
		int bigDivNum = Math.max(firstNum, secondNum);
//		int bigNum bigDivNum;
		
		int gcd3 = 1;
		int cnt3 = 0;
		
		int i3 = 2;
		while (smallDivNum/i3>0 && bigDivNum/i3>0) {
			cnt3++;

			if (bigDivNum%smallDivNum==0) {
				gcd3 *= smallDivNum;
				break;
				
			}else {
				if (smallDivNum%i3 == 0) {
					smallDivNum /= i3;

					if (bigDivNum%i3 == 0) {
					
						bigDivNum /= i3; 
						gcd3 *= i3;
					}
//					System.out.println(smallDivNum+";"+bigDivNum+";"+i3);
					
				} else {
					i3++;
				}
			}
		}
		
		System.out.println("cnt3:"+cnt3);
		System.out.println(gcd3);

		
		
		scan.close();
	}

}
