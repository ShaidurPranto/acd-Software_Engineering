public class Main {
    public static void main(String[] args) {
        Desiflix desiflix = new Desiflix();

        Genre comedy = new Comedy();
        Genre horror = new Horror();
        Genre thriller = new Thriller();

        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        desiflix.addUser(user1);
        desiflix.addUser(user2);
        desiflix.addUser(user3);

        desiflix.addFavourite(comedy, user1);
        desiflix.addFavourite(comedy, user3);
        desiflix.addFavourite(horror, user1);
        desiflix.addFavourite(horror, user3);
        desiflix.addFavourite(thriller, user2);
        desiflix.addFavourite(thriller, user3);

        desiflix.uploadMovie(comedy, new Movie("comedy movie1", "Comedy"));
        desiflix.uploadMovie(horror, new Movie("horror movie1", "Horror"));
        desiflix.uploadMovie(thriller, new Movie("thriller movie1", "Thriller"));

        desiflix.removeFavourite(comedy, user1);
//        desiflix.removeFavourite(thriller, user3);
//        System.out.println("uploading new movie");
//
        desiflix.uploadMovie(comedy, new Movie("comedy movie2", "Comedy"));
//        desiflix.uploadMovie(horror, new Movie("horror movie2", "Horror"));
//        desiflix.uploadMovie(thriller, new Movie("thriller movie2", "Thriller"));
    }
}
