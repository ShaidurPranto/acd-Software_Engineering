package operations;

import premium.Premium;
import premium.PremiumLoan;
import regular.Regular;
import regular.RegularLoan;
import vip.VIP;
import vip.VIPloan;

public class Loan implements Operations{
    @Override
    public Premium createPremium() {
        return new PremiumLoan();
    }

    @Override
    public Regular createRegular() {
        return new RegularLoan();
    }

    @Override
    public VIP createVip() {
        return new VIPloan();
    }
}
