package Product;

import subProduct.SubProduct;
import java.util.LinkedList;

public class Product {
    private LinkedList<String> parts;
    public Product(){
        this.parts = new LinkedList<>();
    }
    public void addParts(SubProduct subProduct){
        parts.add(subProduct.getProduct() + " installed");
    }
    public void showDetails(){
        for(String s : parts){
            System.out.println(s);
        }
    }
}
