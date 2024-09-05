// User.java
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Playlist> playlists;

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    // Create a playlist of a specific type (Pop, Rock, Jazz)
    public Playlist createPlaylist(String name, String type) {
        Playlist playlist = null;

        switch (type.toLowerCase()) {
            case "pop":
                playlist = new PopPlaylist(name);
                break;
            case "rock":
                playlist = new RockPlaylist(name);
                break;
            case "jazz":
                playlist = new JazzPlaylist(name);
                break;
            default:
                System.out.println("Invalid playlist type. Please choose Pop, Rock, or Jazz.");
                return null;
        }

        playlists.add(playlist);
        System.out.println("Created " + type + " playlist: " + name);
        return playlist;
    }

    // Delete a playlist
    public void deletePlaylist(Playlist playlist) {
        if (playlists.remove(playlist)) {
            System.out.println("Deleted playlist: " + playlist.getName());
        } else {
            System.out.println("Playlist not found.");
        }
    }

    // Add a song to a specific playlist
    public void addSongToPlaylist(Playlist playlist, Song song) {
        if (playlists.contains(playlist)) {
            playlist.addSong(song);
        } else {
            System.out.println("Playlist not found.");
        }
    }

    // Remove a song from a specific playlist
    public void removeSongFromPlaylist(Playlist playlist, Song song) {
        if (playlists.contains(playlist)) {
            playlist.removeSong(song);
        } else {
            System.out.println("Playlist not found.");
        }
    }

    // List all playlists
    public void listPlaylists() {
        System.out.println("Playlists for " + username + ":");
        for (Playlist playlist : playlists) {
            System.out.println("- " + playlist.getName());
        }
    }
}
