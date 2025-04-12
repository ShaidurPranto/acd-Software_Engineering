package microprocessor;

import controllerUnit.ControllerUnit;
import controllerUnit.RaspBerryPiController;
import identificationCard.IdentificationCard;
import identificationCard.NFCcard;
import storage.RaspBerryPiStorage;
import storage.Storage;

public class RaspberryPi implements Microprocessor{
    private Storage storage;
    private ControllerUnit controllerUnit;
    private IdentificationCard identificationCard;
    public RaspberryPi(){
        this.storage = new RaspBerryPiStorage();
        this.controllerUnit = new RaspBerryPiController();
        this.identificationCard = new NFCcard();
    }
    public Boolean builtInSDcard(){
        return true;
    }
    public Storage getSDcard(){
        return storage;
    }
    public Boolean builtInControlUnit(){
        return true;
    }
    public ControllerUnit getControlUnit(){
        return controllerUnit;
    }
    public IdentificationCard getIdentificationCard(){
        return this.identificationCard;
    }
    public String getProduct(){
        return "RASPBERRY PI MICROPROCESSOR (SD card , Control Unit attached)";
    }
}
