package regular;

public class RegularLoan implements Regular{
    private static double interestRate = 14;
    public double getInterestRate() {
        return interestRate;
    }
    public double calculateTotal(double amount , double timePeriodInMonths) {
        return amount + amount * (interestRate/100) * (timePeriodInMonths/12);
    }
}
