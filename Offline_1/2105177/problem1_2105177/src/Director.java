import builder.Builder;
import controllerUnit.ExternalController;
import microprocessor.RaspberryPi;
import paymentTerminal.PaymentTerminal;
import storage.SDcard;

public class Director {
    public void construct(Choice choice,Builder builder){
        choice.makeChoices();
        builder.buildDisplayUnit(choice.getDisplayUnit());
        builder.buildIdentificationCard(choice.getDisplayUnit().getMicroprocessor().getIdentificationCard());
        builder.buildPaymentTerminal(new PaymentTerminal());
        builder.buildInternetConnection(choice.getInternet());
        if(!choice.getDisplayUnit().getMicroprocessor().builtInSDcard()){
            builder.buildStorage(new SDcard());
        }
        if(!choice.getDisplayUnit().getMicroprocessor().builtInControlUnit()){
            builder.buildController(new ExternalController());
        }
        builder.buildWebServer(choice.getWebServer());
    }
}
