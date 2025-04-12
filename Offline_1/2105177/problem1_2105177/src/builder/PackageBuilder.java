package builder;

import Product.Product;
import controllerUnit.ControllerUnit;
import displayUnit.DisplayUnit;
import identificationCard.IdentificationCard;
import internet.Internet;
import paymentTerminal.PaymentTerminal;
import storage.Storage;
import webServer.WebServer;

public class PackageBuilder implements Builder{
    private Product product;
    public PackageBuilder(){
        product = new Product();
    }
    @Override
    public void buildDisplayUnit(DisplayUnit displayUnit) {
        product.addParts(displayUnit);
    }

    @Override
    public void buildIdentificationCard(IdentificationCard identificationCard) {
        product.addParts(identificationCard);
    }

    @Override
    public void buildPaymentTerminal(PaymentTerminal paymentTerminal) {
        product.addParts(paymentTerminal);
    }

    @Override
    public void buildInternetConnection(Internet internet) {
        product.addParts(internet);
    }

    @Override
    public void buildStorage(Storage storage) {
        product.addParts(storage);
    }

    @Override
    public void buildController(ControllerUnit controllerUnit) {
        product.addParts(controllerUnit);
    }

    @Override
    public void buildWebServer(WebServer webServer) {
        product.addParts(webServer);
    }
    public Product getProduct(){
        return this.product;
    }
}
