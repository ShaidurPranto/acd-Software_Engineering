package operations;

import premium.Premium;
import premium.PremiumLoan;
import premium.PremiumSavings;
import regular.Regular;
import regular.RegularLoan;
import regular.RegularSavings;
import vip.VIP;
import vip.VIPloan;
import vip.VIPsavings;

public class Savings implements Operations{
    @Override
    public Premium createPremium() {
        return new PremiumSavings();
    }

    @Override
    public Regular createRegular() {
        return new RegularSavings();
    }

    @Override
    public VIP createVip() {
        return new VIPsavings();
    }
}
