import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Kyle on 11/24/2014.
 */
public class FanTracking {
    private int manCount, womanCount;
    private Person[] men;
    private Person[] women;
    private MatchAttempts[][] matchAttempts;
    private ArrayList<MatchAttempts> successfulMatches;
    private ArrayList<Integer> matchKeys = new ArrayList<Integer>();
    private int weeks;

    private PrintWriter outputFile;

    public void generateIO() {
        String outputFileName = "C:\\Users\\Kyle\\SkyDrive\\Personal Dev\\AreYouTheOne_Viewer\\Contestants.txt";
        try {
            FileWriter outputDataFile = new FileWriter(outputFileName);
            outputFile = new PrintWriter(outputDataFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createInitialPanel() {
        JPanel contestantCreate = new JPanel(new GridLayout(0, 1));

        ArrayList<Integer> numberSelector = new ArrayList<Integer>(42);
        for (int i = 0; i < 21; i++) {
            numberSelector.add(i);
        }

        JComboBox manCountCombo = new JComboBox(numberSelector.toArray());
        JComboBox womanCountCombo = new JComboBox(numberSelector.toArray());

        contestantCreate.add(new JLabel("Enter number of male contestants:"));
        contestantCreate.add(manCountCombo);

        contestantCreate.add(new JLabel("Enter number of female contestants:"));
        contestantCreate.add(womanCountCombo);

        JOptionPane.showConfirmDialog(null, contestantCreate, "Initial Contestant Count", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE);

        manCount = Integer.parseInt(manCountCombo.getSelectedItem().toString());
        womanCount = Integer.parseInt(womanCountCombo.getSelectedItem().toString());
    }

    public void storeContestantInfo() {
        for (int i = 0; i < manCount; i++) {
            outputFile.println(men[i].getName());
        }
        for (int i = 0; i < womanCount; i++) {
            outputFile.println(women[i].getName());
        }
    }

    public void initializeContestantNames() {
        for(int i = 1; i <= manCount; i++) {
            JPanel menNames = new JPanel(new GridLayout(0, 1));
            JTextField name = new JTextField();
            menNames.add(new JLabel("Enter name for man number " + i));
            menNames.add(name);
            JOptionPane.showConfirmDialog(null, menNames, "Name of man " + i, JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE);

            men[i - 1] = new Person();
            men[i - 1].setName(name.getText());
            men[i - 1].setIndex(i - 1);
            men[i - 1].setKey(i - 1);
        }

        for(int i = 1; i <= womanCount; i++) {
            JPanel womenNames = new JPanel(new GridLayout(0, 1));
            JTextField name = new JTextField();
            womenNames.add(new JLabel("Enter name for woman number " + i));
            womenNames.add(name);
            JOptionPane.showConfirmDialog(null, womenNames, "Name of woman " + i, JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE);

            women[i - 1] = new Person();
            women[i - 1].setName(name.getText());
            women[i - 1].setKey(i - 1);

        }
    }

    public void weeklyInput() {
//        JPanel weeklyInput = new JPanel(new GridLayout(0, 1));
//
//        ArrayList<JPanel> panels = new ArrayList<JPanel>();
//        ArrayList<JComboBox> combosMen = new ArrayList<JComboBox>();
//        ArrayList<JComboBox> combosWomen = new ArrayList<JComboBox>();
//        ArrayList<JLabel> labels = new ArrayList<JLabel>();
//        for (int i = 0; i < manCount; i++) {
//            combosMen.add(new JComboBox(men));
//            combosWomen.add(new JComboBox(women));
//            labels.add(new JLabel("Match " + i));
//    }
//
//        weeklyInput.add(new JLabel("Truth Booth Match"));
//        JComboBox truthBoothMan = new JComboBox(men);
//        JComboBox truthBoothWoman = new JComboBox(women);
//        String[] success = new String[] {"false", "true"};
//        JComboBox truthBoothSuccess = new JComboBox(success);
//
//        for (int i = 0; i < manCount; i++) {
//            weeklyInput.add(labels.get(i));
//            combosMen.get(i);
//            combosWomen.get(i);
//        }
//
//
//        JOptionPane.showConfirmDialog(null, weeklyInput, "Weekly Matches", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE);

        JPanel weeklyInput = new JPanel(new GridLayout(0, 1));

        JComboBox man1 = new JComboBox(men);
        JComboBox man2 = new JComboBox(men);
        JComboBox man3 = new JComboBox(men);
        JComboBox man4 = new JComboBox(men);
        JComboBox man5 = new JComboBox(men);
        JComboBox man6 = new JComboBox(men);
        JComboBox man7 = new JComboBox(men);
        JComboBox man8 = new JComboBox(men);
        JComboBox man9 = new JComboBox(men);
        JComboBox man10 = new JComboBox(men);
        JComboBox woman1 = new JComboBox(women);
        JComboBox woman2 = new JComboBox(women);
        JComboBox woman3 = new JComboBox(women);
        JComboBox woman4 = new JComboBox(women);
        JComboBox woman5 = new JComboBox(women);
        JComboBox woman6 = new JComboBox(women);
        JComboBox woman7 = new JComboBox(women);
        JComboBox woman8 = new JComboBox(women);
        JComboBox woman9 = new JComboBox(women);
        JComboBox woman10 = new JComboBox(women);

        searchWindow.add(new JLabel("Enter weekly matches: "));
        searchWindow.add(new JLabel());

        searchWindow.add(new JLabel("Print Database?"));
        searchWindow.add(dataPrintCombo);

        searchWindow.add(new JLabel("Search Make:"));
        searchWindow.add(makeCombo);

        searchWindow.add(new JLabel("Search Model:"));
        searchWindow.add(modelCombo);

        searchWindow.add(new JLabel("Search Year:"));
        searchWindow.add(yearCombo);

        searchWindow.add(new JLabel("Search Color:"));
        searchWindow.add(colorCombo);

        searchWindow.add(new JLabel("Search Full License:"));
        searchWindow.add(fullLicenseBox);

        searchWindow.add(new JLabel("Search Partial License:"));
        searchWindow.add(partialLicenseBox);

        JOptionPane.showConfirmDialog(null, searchWindow, "Search Car Database", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE);
    }

    public void truthBooth(Person male, Person female, boolean isMatched) {
        matchAttempts[male.getIndex()][female.getIndex()].setMan(male);
        matchAttempts[male.getIndex()][female.getIndex()].setWoman(female);
        matchAttempts[male.getIndex()][female.getIndex()].setMatch(isMatched);
        matchAttempts[male.getIndex()][female.getIndex()].incrementPairCount();

        if(isMatched) {
            boolean unique = false;
            while(!unique) {
                Random rand = new Random(100);
                for (int i = 0; i < matchKeys.size(); i++) {
                    if (matchKeys.get(i).equals(rand)) {
                        break;
                    } else if (i == matchKeys.size() - 1) {
                        matchKeys.add(Integer.parseInt(rand.toString()));
                        unique = true;
                    }
                }
            }
            matchAttempts[male.getIndex()][female.getIndex()].setSuccessAverage(1);
            successfulMatches.add(matchAttempts[male.getIndex()][female.getIndex()]);
        } else {
            matchAttempts[male.getIndex()][female.getIndex()].setSuccessAverage(0);
        }
    }

    public void endOfWeekParing(Person male, Person female, int successfulMatches) {
        matchAttempts[male.getIndex()][female.getIndex()].setMan(male);
        matchAttempts[male.getIndex()][female.getIndex()].setWoman(female);
        matchAttempts[male.getIndex()][female.getIndex()].incrementPairCount();
        matchAttempts[male.getIndex()][female.getIndex()].setSuccessAverage(successfulMatches);
    }

    public void generateWeeklyStats() {

    }

    public static void main(String[] args) {
        FanTracking driver = new FanTracking();

        driver.generateIO();

        driver.createInitialPanel();

        driver.men = new Person[driver.manCount];
        driver.women = new Person[driver.womanCount];

        driver.matchAttempts = new MatchAttempts[driver.manCount][driver.womanCount];
        for (int i = 0; i < driver.manCount; i++) {
            for (int j = 0; j < driver.womanCount; j++) {
                driver.matchAttempts[i][j] = new MatchAttempts();
            }
        }

        driver.initializeContestantNames();

        driver.storeContestantInfo();

        driver.outputFile.close();
        System.exit(0);
    }
}
