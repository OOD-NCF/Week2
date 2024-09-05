// Song.java
public class Song {
    private String title;
    private String artist;
    private double duration; // in minutes

    // Constructor to initialize the properties
    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + duration + " mins)";
    }
}
