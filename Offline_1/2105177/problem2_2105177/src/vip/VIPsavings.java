package vip;

public class VIPsavings implements VIP{
    private static double interestRate = 5;
    public double getInterestRate() {
        return interestRate;
    }
    public double calculateTotal(double amount , double timePeriodInMonths) {
        return amount + amount * (interestRate/100) * (timePeriodInMonths/12);
    }
}
