public class Movie {
    private String name;
    private String genre;
    public Movie(String name,String genre){
        this.name = name;
        this.genre = genre;
    }
    public String getName(){
        return this.name;
    }
    public String getGenre(){
        return this.genre;
    }
}
