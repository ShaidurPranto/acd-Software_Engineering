package microprocessor;

import controllerUnit.ControllerUnit;
import identificationCard.IdentificationCard;
import identificationCard.RFIDcard;
import storage.Storage;

public class ATMega implements Microprocessor{
    private IdentificationCard identificationCard;
    public ATMega(){
        this.identificationCard = new RFIDcard();
    }
    public Boolean builtInSDcard(){
        return false;
    }
    public Storage getSDcard(){
        return null;
    }
    public Boolean builtInControlUnit(){
        return false;
    }
    public ControllerUnit getControlUnit(){
        return null;
    }

    @Override
    public IdentificationCard getIdentificationCard() {
        return identificationCard;
    }

    public String getProduct(){
        return "ATMEGA32 MICROPROCESSOR";
    }
}
