package displayUnit;

import display.Display;
import display.LCDdisplay;
import microprocessor.ATMega;
import microprocessor.Microprocessor;

public class BasicDisplayUnit implements DisplayUnit{
    private Display display;
    private Microprocessor microprocessor;
    public BasicDisplayUnit(){
        this.display = new LCDdisplay();
        this.microprocessor = new ATMega();
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
