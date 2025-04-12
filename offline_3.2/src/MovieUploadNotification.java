import java.util.ArrayList;
import java.util.List;

public class MovieUploadNotification {
    private List<User> users;

    public MovieUploadNotification(List<User> users) {
        this.users = new ArrayList<>(users);
    }

    public void notifyUsers(String msg) {
        System.out.println("Making a new thread to notify users with message: " + msg);
        Thread t = new Thread(() -> {
            for (User user : users) {
                user.update(msg);
            }
        });
        t.start();
    }
}

