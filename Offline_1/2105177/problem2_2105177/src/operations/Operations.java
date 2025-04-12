package operations;

import premium.Premium;
import regular.Regular;
import vip.VIP;

public interface Operations {
    public Premium createPremium();
    public Regular createRegular();
    public VIP createVip();
}
