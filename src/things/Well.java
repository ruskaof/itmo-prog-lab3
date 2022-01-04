package things;

public abstract class Well {
    protected double liquidAmount;

    Well(double liquidAmount) {
        this.liquidAmount = liquidAmount;
    }

    public double getLiquid(double amount) {
        if (liquidAmount - amount < 0) {
            System.out.println("Can't use the Well because you want too much liquid.");
            return 0;
        } else {
            liquidAmount -= amount;
            System.out.println("The Well now has less liquid, got it successfully.");
            return amount;
        }
    }
}
