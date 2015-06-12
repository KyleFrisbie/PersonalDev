import java.util.Scanner;


public class NumberConverterDriver {

	public static void main(String[] args) {
//        boolean runAgain;
//        do {
//            runAgain = false;
            int conversionType;     // Holds user selected conversion type (see getConversion int values
            Scanner input;          // Holds the numerical value input by the user

            conversionType = getConversion();
            input = getValue(conversionType);
            runConversion(conversionType, input);
            input.close();
//            runAgain = convertAgain();
//        } while (runAgain);
	}

    private static int getConversion() {
        int selection;
        boolean valid;
        Scanner keyboard = new Scanner(System.in);

        do {
            valid = true;
            System.out.print("Select the conversion you would like to make:" +
                    "\n(1) DEC to BIN (1)" +
                    "\n(2) DEC to HEX (2)" +
                    "\n(3) BIN to DEC (3)" +
                    "\n(4) BIN to HEX (4)" +
                    "\n(5) HEX to DEC (5)" +
                    "\n(6) HEX to BIN (6)" +
                    "\n(enter selection, 1-6): ");
            selection = keyboard.nextInt();
            if(selection > 6 || selection < 1) {
                valid = false;
                System.out.println("Selection invalid, please make a valid selection.\n");
            }
        } while (!valid);
        return selection;
    }

    private static String[] setVerboseOutput(int input) {
        String[] data = new String[2];
        switch (input) {
            case 1:
                data[0] = "decimal";
                data[1] = "binary";
                break;
            case 2:
                data[0] = "decimal";
                data[1] = "hexadecimal";
                break;
            case 3:
                data[0] = "binary";
                data[1] = "decimal";
                break;
            case 4:
                data[0] = "binary";
                data[1] = "hexadecimal";
                break;
            case 5:
                data[0] = "hexadecimal";
                data[1] = "decimal";
                break;
            default:
                data[0] = "hexadecimal";
                data[1] = "binary";
                break;
        }
        return data;
    }

    private static Scanner getValue(int selection) {
		Scanner keyboard = new Scanner(System.in);
        String[] verboseData = new String[2];

        verboseData = setVerboseOutput(selection);
		System.out.print("Enter the " + verboseData[0] + " number you would like to convert to " + verboseData[1] + ": ");
		return keyboard;
	}

    private static void runConversion(int selection, Scanner input) {
        switch(selection) {
            case 1:
                DecToBin decToBin = new DecToBin(input);
                break;
            case 2:
                DecToHex decToHex = new DecToHex(input);
                break;
            case 3:
                BinToDec binToDec = new BinToDec(input);
                break;
            case 4:
                BinToHex binToHex = new BinToHex(input);
                break;
            case 5:
                HexToDec hexToDec = new HexToDec(input);
                break;
            case 6:
                HexToBin hexToBin = new HexToBin(input);
                break;
            default:
                System.out.println("There was an error processing your data.");
        }
    }

//     private static boolean convertAgain() {
//        Scanner keyboard = new Scanner(System.in);
//        String inputLine;
//        char answer;
//        boolean runAgain = false;
//
//        System.out.print("\nWould you like to convert another number? (Y) or (N): ");
//        inputLine = keyboard.nextLine().trim();
//        inputLine = inputLine.toLowerCase();
//        answer = inputLine.charAt(0);
//
//        if(answer == 'y') {
//            runAgain = true;
//        }
//
//        return runAgain;
//    }
}
