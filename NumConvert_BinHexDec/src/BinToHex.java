import java.util.ArrayList;
        import java.util.Scanner;

public class BinToHex {

    ArrayList<String> binNumInput = new ArrayList<String>();
    ArrayList<String> hexAsBin = new ArrayList<String>();

    public BinToHex(Scanner input) {
        getHexNum(input);
        groupFourBin();
        printBinNum();
    }

    void getHexNum(Scanner keyboard) {
        String[] tokens;
        String inputLine;
        int count = 0;

        inputLine = keyboard.nextLine().trim();

        tokens = new String[inputLine.length()];

        while (((tokens.length + count) % 4) != 0) {
            binNumInput.add("0");
            count++;
        }

        inputLine = inputLine.trim();
        tokens = inputLine.split("");

        for (int i = 0; i < tokens.length; i++) {
            binNumInput.add(tokens[i]);
        }

        keyboard.close();
    }

    void groupFourBin() {
        for (int i = 0; i < binNumInput.size(); i += 4) {
            int counter = 0;
            String binHolder = "";

            while(counter != 4) {
                binHolder += binNumInput.get(i + counter);
                counter++;
            }
            hexAsBin.add(binHolder);
        }
    }

    void printBinNum() {

        for (int i = 0; i < hexAsBin.size(); i++) {
            String value;

            switch (hexAsBin.get(i)) {
                case "0000":
                    value = "0";
                    break;
                case "0001":
                    value = "1";
                    break;
                case "0010":
                    value = "2";
                    break;
                case "0011":
                    value = "3";
                    break;
                case "0100":
                    value = "4";
                    break;
                case "0101":
                    value = "5";
                    break;
                case "0110":
                    value = "6";
                    break;
                case "0111":
                    value = "7";
                    break;
                case "1000":
                    value = "8";
                    break;
                case "1001":
                    value = "9";
                    break;
                case "1010":
                    value = "A";
                    break;
                case "1011":
                    value = "B";
                    break;
                case "1100":
                    value = "C";
                    break;
                case "1101":
                    value = "D";
                    break;
                case "1110":
                    value = "E";
                    break;
                case "1111":
                    value = "F";
                    break;
                default:
                    value = "";
            }
            System.out.print(value);
        }

    }
}