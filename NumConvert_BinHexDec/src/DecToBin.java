import java.util.ArrayList;
import java.util.Scanner;


public class DecToBin {
	
	int decimalNum;
	ArrayList<Integer> binAry = new ArrayList<Integer>();
	
	public DecToBin(Scanner input) {
		getDecimal(input);
		convertToBin();
		printBin();
	}
	
	void getDecimal(Scanner keyboard) {
		decimalNum = keyboard.nextInt();
		
		keyboard.close();
	}
	
	void convertToBin() {
		int holder = decimalNum;
		while((holder/2.0) != 0) {
			binAry.add(holder % 2);
			holder /= 2;
		}
	}
	
	void printBin() {
		int spacer = 0;
		
		if(binAry.size() % 4 != 0) {
			while((binAry.size() + spacer) % 4 != 0) {
				System.out.print("0");
				spacer++;
			}
		}
		for(int i = binAry.size() - 1; i >= 0; i--) {
			
			if(spacer % 4 == 0) {
				System.out.print(" ");
			}
			System.out.print(binAry.get(i));
			spacer++;
		}
	}

}
