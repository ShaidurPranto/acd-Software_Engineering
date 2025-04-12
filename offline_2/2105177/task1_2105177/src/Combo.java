import java.util.ArrayList;
import java.util.List;

public class Combo implements Item{
    private String name;
    private double price = 0;
    private List<Item> items;
    private double discount;
    private List<Item> freeItems;

    private double getTotal(){
        if(price != 0){
            return price;
        }
        return this.items.stream().mapToDouble(Item::getPrice).sum();
    }

    public Combo(String name){
        this.name = name;
        this.items = new ArrayList<>();
        this.discount = 0;
        this.freeItems = new ArrayList<>();
    }

    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public String getTitle(){
        List<String> names = this.items.stream().map(Item::getName).toList();
        String allNames = String.join("+",names);
        return this.name + "(" + allNames + ")";
    }
    @Override
    public double getPrice(){
        if(price != 0){
            return price;
        }
        double total = this.items.stream().mapToDouble(Item::getPrice).sum();
        return total - total * (discount/100);
    }
    @Override
    public void showDetails(){
        System.out.println(this.name);
        for(int i=0;i<this.items.size();i++){
            System.out.println("    - " + this.items.get(i).getTitle());
        }
        for(int i=0;i<this.freeItems.size();i++){
            System.out.println("    - " + this.freeItems.get(i).getTitle() + " (Free!!!)");
        }
        System.out.println("\n");
        System.out.println("Total - "+getTotal()+"tk");
        System.out.println("Discount - "+getDiscount()+"%");
        System.out.println("Discounted total - "+getPrice()+"tk");
    }

    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }
    public void addFreeItem(Item item){
        this.freeItems.add(item);
    }
    public void removeFreeItem(Item item){
        this.freeItems.remove(item);
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
    public List<Item> getItems() {
        return this.items;
    }
    public double getDiscount() {
        return this.discount;
    }
    public List<Item> getFreeItems() {
        return this.freeItems;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
