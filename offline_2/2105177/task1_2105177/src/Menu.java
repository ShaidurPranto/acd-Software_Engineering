import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Item> items;

    private List<Item> getDefaultItems(){
        SingleItem burger = new SingleItem("Burger",300);
        SingleItem fries = new SingleItem("Fries",100);
        SingleItem wedges = new SingleItem("Wedges",150);
        SingleItem shawarma = new SingleItem("Shawarma",200);
        SingleItem drink = new SingleItem("Drink",25);

        Combo combo1 = new Combo("Combo1");
        combo1.addItem(burger);
        combo1.addItem(fries);
        combo1.addItem(drink);
        combo1.setPrice(400);

        Combo combo2 = new Combo("Combo2");
        combo2.addItem(shawarma);
        combo2.addItem(drink);
        combo2.setPrice(215);

        List<Item> lists = new ArrayList<>();
        lists.add(burger);
        lists.add(fries);
        lists.add(wedges);
        lists.add(shawarma);
        lists.add(drink);
        lists.add(combo1);
        lists.add(combo2);
        return lists;
    }

    public Menu(){
        items = new ArrayList<>();
        items.addAll(getDefaultItems());
    }

    public void addItem(Item item){
        items.add(item);
    }
    public void show(){
        for(int i=0;i<items.size();i++){
            System.out.println(items.get(i).getTitle() + " - " + items.get(i).getPrice());
        }
    }
    public Item getItem(String name){
        for(int i=0;i<items.size();i++){
            if(items.get(i).getName().equalsIgnoreCase(name)){
                return items.get(i);
            }
        }
        return null;
    }
}
