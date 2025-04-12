import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Menu menu = new Menu();

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Menu: ");
            menu.show();
            System.out.println("Press 1 to create a combo,2 to view menu and 0 to exit");
            int input = scanner.nextInt();
            if(input == 0){
                break;
            }else if(input == 1){
                System.out.println("Enter the name of the combo : ");
                String name = scanner.next();
                Combo combo = new Combo(name);

                System.out.println("Available commands:");
                System.out.println("Add [item]");
                System.out.println("Remove [item]");
                System.out.println("Free [item]");
                System.out.println("Discount [percentage]");
                System.out.println("Done");
                while(true){
                    String command = scanner.next();
                    if(command.equalsIgnoreCase("add")){
                        String itemName = scanner.next();
                        Item item = menu.getItem(itemName);
                        if(item == null){
                            System.out.println("Item not found");
                        }else{
                            combo.addItem(item);
                        }
                    }
                    if(command.equalsIgnoreCase("remove")){
                        String itemName = scanner.next();
                        Item item = menu.getItem(itemName);
                        if(item == null){
                            System.out.println("Item not found");
                        }else{
                            combo.removeItem(item);
                        }
                    }
                    if(command.equalsIgnoreCase("free")){
                        String itemName = scanner.next();
                        Item item = menu.getItem(itemName);
                        if(item == null){
                            System.out.println("Item not found");
                        }else{
                            combo.addFreeItem(item);
                        }
                    }
                    if(command.equalsIgnoreCase("discount")){
                        double discount = scanner.nextDouble();
                        combo.setDiscount(discount);
                    }
                    if(command.equalsIgnoreCase("done")){
                        System.out.println("Your combo: ");
                        combo.showDetails();
                        menu.addItem(combo);
                        System.out.println("Press 1 to create a combo,2 to view menu and 0 to exit");
                        break;
                    }
                }
            }else if(input == 2){

            }
        }
    }
}
