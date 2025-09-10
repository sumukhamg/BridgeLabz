package employee_promotion_system;

public enum Promotions {
    JUNIOR, MID, SENIOR, LEAD;

    public Promotions getNext() {
        switch (this) {
            case JUNIOR:
                return MID;
            case MID:
                return SENIOR;
            case SENIOR:
                return LEAD;
            default:
                return null;
        }
    }

    public double getSalaryIncrement() {
        switch (this) {
            case JUNIOR:
                return 2000;
            case MID:
                return 3000;
            case SENIOR:
                return 4000;
            default:
                return 0;
        }
    }
}
