package webServer;

public class WebServerFactory {
    public WebServer getWebServer(String webServerType){
        if(webServerType == null){
            return null;
        }
        if(webServerType.equalsIgnoreCase("DJANGO")){
            return new Django();
        } else if(webServerType.equalsIgnoreCase("NODEJS")){
            return new Nodejs();
        } else if(webServerType.equalsIgnoreCase("RUBY")){
            return new Ruby();
        }
        return null;
    }
}
