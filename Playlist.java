import java.util.ArrayList;
import java.util.List;

public abstract class Playlist {
    protected String name;
    protected List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println(song.getTitle() + " added to " + name);
    }

    public void removeSong(Song song) {
        songs.remove(song);
        System.out.println(song.getTitle() + " removed from " + name);
    }

    public void playAllSongs() {
        System.out.println("Playing all songs in " + name + ":");
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }
    public abstract String getGenre();  // Abstract method for genre

}

