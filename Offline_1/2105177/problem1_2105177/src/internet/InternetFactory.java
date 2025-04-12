package internet;

public class InternetFactory {
    public Internet getInternet(String internetType){
        if(internetType == null){
            return null;
        }
        if(internetType.equalsIgnoreCase("WIFI")){
            return new Wifi();
        } else if(internetType.equalsIgnoreCase("GSM") || internetType.equalsIgnoreCase("GSM MODULE")){
            return new GSMmodule();
        } else if(internetType.equalsIgnoreCase("ETHERNET")){
            return new Ethernet();
        }
        return null;
    }
}
