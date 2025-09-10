public class DRY {
    // -------- payment --------
    double applyGST(int amount) {
        return amount * 0.18;
    }

    double applyDiscount(int amount) {
        return amount * 0.18;
    }

}
