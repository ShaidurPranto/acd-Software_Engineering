package displayUnit;

import display.Display;
import display.LCDdisplay;
import display.OLEDdisplay;
import microprocessor.ATMega;
import microprocessor.Microprocessor;
import microprocessor.RaspberryPi;

public class AdvancedDisplayUnit implements DisplayUnit{
    private Display display;
    private Microprocessor microprocessor;
    public AdvancedDisplayUnit(){
        this.display = new OLEDdisplay();
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
