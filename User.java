import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Playlist> playlists;

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
    }

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
                System.out.println("Unknown playlist type: " + type);
                return null;
        }
        playlists.add(playlist);
        System.out.println(type + " playlist '" + name + "' created.");
        return playlist;
    }

    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist);
        System.out.println("Playlist '" + playlist.getName() + "' deleted.");
    }

    public void addSongToPlaylist(Playlist playlist, Song song) {
        playlist.addSong(song);
    }

    public void removeSongFromPlaylist(Playlist playlist, Song song) {
        playlist.removeSong(song);
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void recommendSongsByGenre(String genre) {
        System.out.println("Recommended songs for genre: " + genre);
        boolean found = false;
        for (Playlist playlist : playlists) {
            if (playlist.getGenre().equalsIgnoreCase(genre)) {
                found = true;
                System.out.println("From playlist: " + playlist.getName());
                for (Song song : playlist.getSongs()) {
                    System.out.println(song);
                }
            }
        }
        if (!found) {
            System.out.println("No playlists found for genre: " + genre);
        }
    }

    public String getUsername() {
        return username;
    }
}
