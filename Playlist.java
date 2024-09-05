// Playlist.java
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    protected String name;
    protected List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Method to add a song
    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Added song: " + song);
    }

    // Method to remove a song
    public void removeSong(Song song) {
        songs.remove(song);
        System.out.println("Removed song: " + song);
    }

    // Method to play all songs in the playlist
    public void playAllSongs() {
        System.out.println("Playing all songs from playlist: " + name);
        for (Song song : songs) {
            System.out.println("Playing: " + song);
        }
    }
}

