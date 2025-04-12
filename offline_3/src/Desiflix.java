import java.util.ArrayList;
import java.util.List;

public class Desiflix {
    private List<User> users;
    public Desiflix(){
        users = new ArrayList<User>();
    }
    public void addUser(User user){
        users.add(user);
    }
    public void uploadMovie(Genre genre,Movie movie){
        genre.uploadMovie(movie);
        genre.notifyAll("a new movie (name: "+movie.getName()+" , genre: "+movie.getGenre()+") has been uploaded");
    }
    public void addFavourite(Genre genre,User user){
        if(users.contains(user)){
            genre.addFavourite(user);
        }
    }
    public void removeFavourite(Genre genre,User user){
        if(users.contains(user)){
            genre.removeFavourite(user);
        }
    }
}
