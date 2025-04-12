package builder;

import Product.Product;
import controllerUnit.ControllerUnit;
import displayUnit.DisplayUnit;
import identificationCard.IdentificationCard;
import internet.Internet;
import paymentTerminal.PaymentTerminal;
import storage.Storage;
import webServer.WebServer;

public interface Builder {
    public void buildDisplayUnit(DisplayUnit displayUnit);
    public void buildIdentificationCard(IdentificationCard identificationCard);
    public void buildPaymentTerminal(PaymentTerminal paymentTerminal);
    public void buildInternetConnection(Internet internet);
    public void buildStorage(Storage storage);
    public void buildController(ControllerUnit controllerUnit);
    public void buildWebServer(WebServer webServer);
    public Product getProduct();
}
