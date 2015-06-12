import java.util.ArrayList;
import java.util.Scanner;


public class BinToDec {
	
	private ArrayList<Character> binaryNum = new ArrayList<Character>();
	private ArrayList<Double> binPosVal = new ArrayList<Double>();

    public BinToDec(Scanner input) {
		getBinNum(input);
		calcPosVal();
		printDecNum();
    }
	
	void getBinNum(Scanner keyboard) {
        String inputLine;
        char[] tokens;
		inputLine = keyboard.nextLine().trim();

		tokens = new char[inputLine.length()];
		
		tokens = inputLine.toCharArray();
		
		for(int i = 0; i < tokens.length; i++) {
            if (tokens[i] == '0' || tokens[i] == '1') {
                binaryNum.add(tokens[i]);
            } else {
                System.out.println("Input a valid binary number consisting of only 0's and 1's (any other input is ignored in calculation.");
            }

		}
		
		keyboard.close();
	}
	
	void calcPosVal() {
		int power;
		power = binaryNum.size() - 1;
		for(int i = 0; i < binaryNum.size(); i++) {
			binPosVal.add((Integer.parseInt(binaryNum.get(i).toString())* Math.pow(2, power)));
			power--;
		}
	}
	
	void printDecNum() {
		int holder = 0;
		for(int i = 0; i < binPosVal.size(); i++) {
			holder += binPosVal.get(i);
		}
		
		System.out.print(holder);
	}
}
