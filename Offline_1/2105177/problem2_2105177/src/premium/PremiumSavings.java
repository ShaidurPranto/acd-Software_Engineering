package premium;

public class PremiumSavings implements Premium{
    private static double interestRate = 3.5;
    public double getInterestRate() {
        return interestRate;
    }
    public double calculateTotal(double amount , double timePeriodInMonths) {
        return amount + amount * (interestRate/100) * (timePeriodInMonths/12);
    }
}
