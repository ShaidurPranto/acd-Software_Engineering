package displayUnit;

import Product.Product;

public class DisplayUnitFactory {
    public DisplayUnit getDisplayUnit(String displayUnitName){
        if(displayUnitName == null){
            return null;
        }
        else if(displayUnitName.equalsIgnoreCase("PREMIUM")){
            return new PremiumDisplayUnit();
        }else if(displayUnitName.equalsIgnoreCase("BASIC")){
            return new BasicDisplayUnit();
        }else if(displayUnitName.equalsIgnoreCase("STANDARD")){
            return new StandardDisplayUnit();
        }else if(displayUnitName.equalsIgnoreCase("ADVANCED")){
            return new AdvancedDisplayUnit();
        }
        return null;
    }
}
