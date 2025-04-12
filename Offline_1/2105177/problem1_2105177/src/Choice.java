import displayUnit.*;
import internet.*;
import microprocessor.RaspberryPi;
import webServer.*;

import java.util.Scanner;

public class Choice {
    private Scanner scanner;
    private DisplayUnit displayUnit;
    private Internet internet;
    private WebServer webServer;
    public Choice(){
        scanner = new Scanner(System.in);
    }
    private void makeDisplayUnitChoice(){
        String userInput = "";
        while (true) {
            System.out.println("Enter package name");
            System.out.println("Basic(ATMega32 with LCD display)");
            System.out.println("Standard(Arduino Mega with LED display)");
            System.out.println("Advanced(Raspberry Pi with OLED display)");
            System.out.println("Premium(Raspberry Pi with touch screen display)");
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("Basic") || userInput.equalsIgnoreCase("Standard") || userInput.equalsIgnoreCase("Advanced") || userInput.equalsIgnoreCase("Premium")){
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid package name.");
            }
        }
        displayUnit = new DisplayUnitFactory().getDisplayUnit(userInput);
    }
    private void makeInternetConnectionChoice(){
        String userInput = "";
        boolean extraOption = false;
        if(displayUnit.getMicroprocessor() instanceof RaspberryPi){extraOption = true;}
        while (true) {
            System.out.println("Select an Internet Connection");
            System.out.println("Wifi");
            System.out.println("GSM module");
            if(extraOption){
                System.out.println("Ethernet");
            }
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("Wifi") || userInput.equalsIgnoreCase("GSM module") || userInput.equalsIgnoreCase("GSM") || (extraOption && userInput.equalsIgnoreCase("Ethernet"))){
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid internet connection.");
            }
        }
        internet = new InternetFactory().getInternet(userInput);
    }
    private void makeWebServerChoice(){
        String userInput = "";
        while (true) {
            System.out.println("Select a Web Server");
            System.out.println("Nodejs");
            System.out.println("Django");
            System.out.println("Ruby");
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("Nodejs") || userInput.equalsIgnoreCase("Django") || userInput.equalsIgnoreCase("Ruby")){
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid web server.");
            }
        }
        webServer = new WebServerFactory().getWebServer(userInput);
    }

    public void makeChoices(){
        makeDisplayUnitChoice();
        makeInternetConnectionChoice();
        makeWebServerChoice();
    }
    public DisplayUnit getDisplayUnit(){
        return displayUnit;
    }
    public Internet getInternet(){
        return internet;
    }
    public WebServer getWebServer(){
        return webServer;
    }
}
