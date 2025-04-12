package microprocessor;

import controllerUnit.ControllerUnit;
import identificationCard.IdentificationCard;
import storage.Storage;
import subProduct.SubProduct;

public interface Microprocessor extends SubProduct {
    public Boolean builtInSDcard();
    public Storage getSDcard();
    public Boolean builtInControlUnit();
    public ControllerUnit getControlUnit();
    public IdentificationCard getIdentificationCard();
}
