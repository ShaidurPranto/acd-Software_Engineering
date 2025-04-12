public class SingleItem implements Item{
    private String name;
    private double price;
    public SingleItem(String name,double price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public String getTitle(){
        return this.name;
    }
    @Override
    public double getPrice(){
        return this.price;
    }
    @Override
    public void showDetails(){
        System.out.println(this.getName() + " - " + this.price +"tk");
    }
}
