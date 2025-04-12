import java.util.ArrayList;
import java.util.List;

public abstract class Genre {
    private List<User> users;
    private List<Movie> movies;
    public Genre(List<User> users, List<Movie> movies){
        this.users = users;
        this.movies = movies;
    }
    public synchronized void addFavourite(User user) {
        users.add(user);
    }

    public synchronized void removeFavourite(User user) {
        users.remove(user);
    }

    public synchronized void uploadMovie(Movie movie) {
        movies.add(movie);
    }

    public synchronized void notifyAll(String msg) {
        MovieUploadNotification notification = new MovieUploadNotification(users);
        notification.notifyUsers(msg);
    }
}
