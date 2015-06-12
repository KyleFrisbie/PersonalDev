import java.util.ArrayList;
import java.util.Scanner;

public class DecToHex {

	int decimalNum;
	ArrayList<Integer> hexAry = new ArrayList<Integer>();

	public DecToHex(Scanner input) {
        getDecimal(input);
        convertToHex();
        printHex();
	}

	void getDecimal(Scanner keyboard) {
		decimalNum = keyboard.nextInt();
		keyboard.close();
	}

	void convertToHex() {
		int holder = decimalNum;
		while ((holder / 16.0) != 0) {
			hexAry.add(holder % 16);
			holder /= 16;
		}
	}

	void changeToLetter(int i) {
		switch (hexAry.get(i)) {
		case 10:
			System.out.print("A");
			break;
		case 11:
			System.out.print("B");
			break;
		case 12:
			System.out.print("C");
			break;
		case 13:
			System.out.print("D");
			break;
		case 14:
			System.out.print("E");
			break;
		default:
			System.out.print("F");
			break;
		}
	}

	void printHex() {
		int spacer = 0;

		if (hexAry.size() % 4 != 0) {
			while ((hexAry.size() + spacer) % 4 != 0) {
				System.out.print("0");
				spacer++;
			}
		}
		for (int i = hexAry.size() - 1; i >= 0; i--) {

			if (spacer % 4 == 0) {
				System.out.print(" ");
			}
			if (hexAry.get(i) < 10) {
				System.out.print(hexAry.get(i));
			} else {
				changeToLetter(i);
			}
			spacer++;
		}
	}

}