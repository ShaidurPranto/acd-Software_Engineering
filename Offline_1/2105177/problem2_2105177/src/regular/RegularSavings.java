package regular;

public class RegularSavings implements Regular{
    private static double interestRate = 2.5;
    public double getInterestRate() {
        return interestRate;
    }
    public double calculateTotal(double amount , double timePeriodInMonths) {
        return amount + amount * (interestRate/100) * (timePeriodInMonths/12);
    }
}
