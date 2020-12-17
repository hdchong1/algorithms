package basic._4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		int inputNum = 13;
		int[] bin = new int[100];
		
		int i = 0;
		int mok = inputNum;
		
		while(mok>0) {		
			bin[i]= mok%2;
			mok /= 2;
			i++;
		}		
		i--;
		
		for (; i>=0; i--) {
			System.out.print(bin[i]);
		}
		
		String result = Integer.toBinaryString(inputNum);
		System.out.println();
		System.out.println(result);
		String resultWithPadding = String.format("%32s", result).replaceAll(" ", "0");
        System.out.println(resultWithPadding);
        
	}
	
    public static String printBinary(String binary, int blockSize, String separator) {

        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < binary.length()) {
            result.add(binary.substring(index, Math.min(index + blockSize, binary.length())));
            index += blockSize;
        }

        return result.stream().collect(Collectors.joining(separator));
    }

}
