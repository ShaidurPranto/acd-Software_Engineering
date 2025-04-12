import java.util.List;

public class MovieUploadNotification {
    private List<User> users;
    public MovieUploadNotification(List<User> users){
        this.users = users;
    }
    public void notifyUsers(String msg){
        System.out.println("making a new thread to notify users with message: "+msg);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(User user : users){
                    user.update(msg);
                }
            }
        });
        t.start();
    }
}
