import operations.Loan;
import operations.Operations;
import operations.Savings;


import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        int userInput2 = 0;
        while(true){
            System.out.println("Select operation type");
            System.out.println("1. Savings Account");
            System.out.println("2. Loan");
            if(scanner.hasNextInt()){
                userInput = scanner.nextInt();
                if(userInput == 1 || userInput == 2){
                    break;
                }else {
                    System.out.println("Invalid input. Please enter a number between 1 and 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
        while(true){
            System.out.println("Select user type");
            System.out.println("1. VIP");
            System.out.println("2. Premium");
            System.out.println("3. Regular");
            if(scanner.hasNextInt()){
                userInput2 = scanner.nextInt();
                if(userInput2 == 1 || userInput2 == 2 || userInput2 == 3){
                    break;
                }else {
                    System.out.println("Invalid input. Please enter a number between 1 and 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
        System.out.println("Enter Amount: ");
        double capital = scanner.nextDouble();
        System.out.println("Enter Time period in month");
        double timePeriod = scanner.nextDouble();
        Operations operations;
        if(userInput == 1){
            operations = new Savings();
        }else{
            operations = new Loan();
        }
        if(userInput2 == 1){
            System.out.println("Total : " + operations.createVip().calculateTotal(capital,timePeriod));
        }else if(userInput2 == 2){
            System.out.println("Total : " + operations.createPremium().calculateTotal(capital,timePeriod));
        }else{
            System.out.println("Total : " + operations.createRegular().calculateTotal(capital,timePeriod));
        }
    }

}
