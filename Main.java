// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a user
        User user = new User("Alice");

        // Create some songs
        Song song1 = new Song("Blinding Lights", "The Weeknd", 3.20);
        Song song2 = new Song("Bohemian Rhapsody", "Queen", 5.55);
        Song song3 = new Song("Take Five", "Dave Brubeck", 5.24);

        // Create playlists
        Playlist popPlaylist = user.createPlaylist("My Pop Hits", "pop");
        Playlist rockPlaylist = user.createPlaylist("Classic Rock", "rock");
        Playlist jazzPlaylist = user.createPlaylist("Smooth Jazz", "jazz");

        // Add songs to playlists
        user.addSongToPlaylist(popPlaylist, song1);
        user.addSongToPlaylist(rockPlaylist, song2);
        user.addSongToPlaylist(jazzPlaylist, song3);

        // List user's playlists
        user.listPlaylists();

        // Play songs from playlists
        popPlaylist.playAllSongs();
        rockPlaylist.playAllSongs();
        jazzPlaylist.playAllSongs();

        // Remove song from a playlist
        user.removeSongFromPlaylist(rockPlaylist, song2);

        // Play songs from rock playlist after removal
        rockPlaylist.playAllSongs();

        // Delete a playlist
        user.deletePlaylist(jazzPlaylist);

        // List playlists after deletion
        user.listPlaylists();
    }
}
