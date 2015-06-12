/**
 * Created by Kyle on 11/24/2014.
 */
public class MatchAttempts {
    private Person man;
    private Person woman;
    private boolean match;
    private int pairCount = 0;
    private double successAverage;

    public Person getMan() {
        return man;
    }

    public void setMan(Person man) {
        this.man = man;
    }

    public Person getWoman() {
        return woman;
    }

    public void setWoman(Person woman) {
        this.woman = woman;
    }

    public boolean isMatch() {
        return match;
    }

    public void setMatch(boolean match) {
        this.match = match;
    }

    public int getPairCount() {
        return pairCount;
    }

    public void incrementPairCount() {
        this.pairCount ++;
    }

    public double getSuccessAverage() {
        return successAverage;
    }

    public void setSuccessAverage(double successAverage) {
        this.successAverage = (this.successAverage + successAverage)
                                / this.pairCount;
    }
}
