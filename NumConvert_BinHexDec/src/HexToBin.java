import java.util.ArrayList;
import java.util.Scanner;


public class HexToBin {

    private ArrayList<String> hexNumInput = new ArrayList<String>();
    private String[] tokens;


    public HexToBin(Scanner input) {
        getHexNum(input);
        printBinNum();
    }

    void getHexNum(Scanner keyboard) {
        String inputLine;
        inputLine = keyboard.nextLine();
        setHexAry(inputLine);
        keyboard.close();
    }

    void setHexAry(String inputLine) {
        tokens = new String[inputLine.length()];

        tokens = inputLine.split("");

        for (int i = 0; i < tokens.length; i++) {
            hexNumInput.add(tokens[i]);
        }
    }

    void printBinNum() {

        for (int i = 0; i < hexNumInput.size(); i++) {
            String value;

            switch (hexNumInput.get(i)) {
                case "0":
                    value = "0000 ";
                    break;
                case "1":
                    value = "0001 ";
                    break;
                case "2":
                    value = "0010 ";
                    break;
                case "3":
                    value = "0011 ";
                    break;
                case "4":
                    value = "0100 ";
                    break;
                case "5":
                    value = "0101 ";
                    break;
                case "6":
                    value = "0110 ";
                    break;
                case "7":
                    value = "0111 ";
                    break;
                case "8":
                    value = "1000 ";
                    break;
                case "9":
                    value = "1001 ";
                    break;
                case "A":
                case "a":
                    value = "1010 ";
                    break;
                case "B":
                case "b":
                    value = "1011 ";
                    break;
                case "C":
                case "c":
                    value = "1100 ";
                    break;
                case "D":
                case "d":
                    value = "1101 ";
                    break;
                case "E":
                case "e":
                    value = "1110 ";
                    break;
                case "F":
                case "f":
                    value = "1111 ";
                    break;
                default:
                    value = "";
                    break;
            }

            System.out.print(value);
        }

    }
}
