package basic._6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// the greatest common divisor

		Scanner scan = new Scanner(System.in);
		
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		
		int small = Math.min(firstNum, secondNum);

// first algorithm	
		
		int gcd0 = 1;
		int cnt0 = 0;
		
		for (int i = 1; i <= small; i++) {
			cnt0++;
			if (firstNum%i == 0 && secondNum%i ==0) {
				gcd0 = i;
			}
			
		}		
		
		System.out.println("cnt0:"+cnt0);
		System.out.println(gcd0);
	
// second algorithm		
		
		int gcd1 = 1;
		int cnt1 = 0;
		
		for (int i = small; i >= 1; i--) {
			cnt1++;
			if (firstNum%i == 0 && secondNum%i ==0) {
				gcd1 = i;
				break;
			}
		}		
		
		System.out.println("cnt1:"+cnt1);
		System.out.println(gcd1);
		
// third algorithm		
		
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
		
// forth algorithm		36966, 49288
		
		int smallDivNum = Math.min(firstNum, secondNum);
		int bigDivNum = Math.max(firstNum, secondNum);
		
		int gcd3 = 1;
		int cnt3 = 0;
		
		int i3 = 2;
		while (smallDivNum/i3>0) {
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
		
// fifth algorithm - recursive

        int a = 36966, b = 49288;
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b, 0));
		
	}
	
    // Recursive function to return gcd of a and b
    static int gcd(int a, int b, int c)
    {
    	c++;
    	System.out.println(c);
    	
        // Everything divides 0 
        if (a == 0)
          return b;
        if (b == 0)
          return a;
      
        // base case
        if (a == b)
            return a;
      
        // a is greater
        if (a > b)
            return gcd(a-b, b, c);
        return gcd(a, b-a, c);
    }


}
