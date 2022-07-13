package dto;

public class Movie {
    int id;
    String name;
    Double durationInMin;
    String genre;
    String details;

    public Movie(int id, String name, Double durationInMin, String genre, String details) {
        this.id = id;
        this.name = name;
        this.durationInMin = durationInMin;
        this.genre = genre;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDurationInMin() {
        return durationInMin;
    }

    public void setDurationInMin(Double durationInMin) {
        this.durationInMin = durationInMin;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override public String toString() {
        return "Movie{" + "id=" + id + ", name='" + name + '\'' + ", durationInMin=" + durationInMin
            + ", genre='" + genre + '\'' + ", details='" + details + '\'' + '}';
    }
}
