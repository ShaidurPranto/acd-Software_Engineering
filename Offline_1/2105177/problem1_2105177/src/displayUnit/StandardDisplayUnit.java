package displayUnit;

import display.Display;
import display.LCDdisplay;
import display.LEDdisplay;
import microprocessor.ATMega;
import microprocessor.ArduinoMega;
import microprocessor.Microprocessor;

public class StandardDisplayUnit implements DisplayUnit{
    private Display display;
    private Microprocessor microprocessor;
    public StandardDisplayUnit(){
        this.display = new LEDdisplay();
        this.microprocessor = new ArduinoMega();
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
