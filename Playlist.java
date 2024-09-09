import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<String> songs;
    private String genre; // New field to specify the genre

    public Playlist(String name, String genre) {
        this.name = name;
        this.songs = new ArrayList<>();
        this.genre = genre; // Assign genre to the playlist
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public void playAll() {
        System.out.println("Playing all songs in the playlist: " + name);

        // Now genre-specific behavior is embedded in the Playlist class
        if (genre.equals("Rock")) {
            System.out.println("This is a Rock playlist!");
        } else if (genre.equals("Pop")) {
            System.out.println("This is a Pop playlist!");
        } else {
            System.out.println("This is a general playlist.");
        }

        for (String song : songs) {
            System.out.println("Playing: " + song);
        }
    }
}
