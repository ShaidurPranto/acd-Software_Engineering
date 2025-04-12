package premium;

public class PremiumLoan implements Premium{
    private static double interestRate = 12;
    public double getInterestRate() {
        return interestRate;
    }
    public double calculateTotal(double amount , double timePeriodInMonths) {
        return amount + amount * (interestRate/100) * (timePeriodInMonths/12);
    }
}
