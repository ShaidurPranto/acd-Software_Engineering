public class User {
    private String name;
    public User(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void update(String msg){
        System.out.println("User : "+this.name+" , received the notification : "+msg);
    }
}
