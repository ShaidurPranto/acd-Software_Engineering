import Product.Product;
import builder.PackageBuilder;

public class Main {
    public static void main(String args[])
    {
        Product product;
        PackageBuilder packageBuilder = new PackageBuilder();
        Choice choice = new Choice();
        Director director = new Director();
        director.construct(choice,packageBuilder);
        product = packageBuilder.getProduct();
        product.showDetails();
    }
}
