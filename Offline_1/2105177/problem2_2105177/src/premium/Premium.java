package premium;

public interface Premium {
    public double getInterestRate();
    public double calculateTotal(double amount,double timePeriodInMonths);
}
