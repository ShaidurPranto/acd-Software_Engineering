package displayUnit;

import display.Display;
import display.LCDdisplay;
import display.TouchScreenDisplay;
import microprocessor.ATMega;
import microprocessor.Microprocessor;
import microprocessor.RaspberryPi;

public class PremiumDisplayUnit implements DisplayUnit{
    private Display display;
    private Microprocessor microprocessor;
    public PremiumDisplayUnit(){
        this.display = new TouchScreenDisplay();
        this.microprocessor = new RaspberryPi();
    }
    public Display getDisplay(){
        return this.display;
    }
    public Microprocessor getMicroprocessor(){
        return this.microprocessor;
    }
    public String getProduct(){
        return "DISPLAY UNIT\nMICROPROCESSOR : " + microprocessor.getProduct() + " , DISPLAY : " + display.getProduct();
    }
}
