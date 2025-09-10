package policy_management_system;

public class Policy {
    private int ID;
    private String type;
    private String premium;
    private int coverageAmount;
    private String expirtDate;

    public Policy(int iD, String type, String premium, int coverageAmount, String expirtDate) {
        ID = iD;
        this.type = type;
        this.premium = premium;
        this.coverageAmount = coverageAmount;
        this.expirtDate = expirtDate;
    }

    public int getID() {
        return ID;
    }

    public String getType() {
        return type;
    }

    public String getPremium() {
        return premium;
    }

    public int getCoverageAmount() {
        return coverageAmount;
    }

    public String getExpirtDate() {
        return expirtDate;
    }

    public String toString() {
        return "[ Policy Id: " + this.getID() +
                ", Policy Type: " + this.getType() +
                ", Premium Type: " + this.getPremium() +
                ", Coverage amount: " + this.getCoverageAmount() +
                ", Expiry date: " + this.getExpirtDate() + "]" + " \n";
    }

}
