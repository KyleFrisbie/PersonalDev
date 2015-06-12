import java.util.ArrayList;
import java.util.Scanner;

public class HexToDec {

    private ArrayList<String> hexNumInput = new ArrayList<String>();
    private String[] tokens;

    public HexToDec(Scanner input) {
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
        int decSum = 0;
        int power = hexNumInput.size() - 1;

        for (int i = 0; i < hexNumInput.size() ; i++) {
            String value;

            switch (hexNumInput.get(i)) {
                case "0":
                    value = "0";
                    break;
                case "1":
                    value = "1";
                    break;
                case "2":
                    value = "2";
                    break;
                case "3":
                    value = "3";
                    break;
                case "4":
                    value = "4";
                    break;
                case "5":
                    value = "5";
                    break;
                case "6":
                    value = "6";
                    break;
                case "7":
                    value = "7";
                    break;
                case "8":
                    value = "8";
                    break;
                case "9":
                    value = "9";
                    break;
                case "A":
                case "a":
                    value = "10";
                    break;
                case "B":
                case "b":
                    value = "11";
                    break;
                case "C":
                case "c":
                    value = "12";
                    break;
                case "D":
                case "d":
                    value = "13";
                    break;
                case "E":
                case "e":
                    value = "14";
                    break;
                case "F":
                case "f":
                    value = "15";
                    break;
                default:
                    value = "";
                    break;
            }
            decSum += Integer.parseInt(value) * Math.pow(16, power);
            power--;
        }
        System.out.print(decSum);
    }
}