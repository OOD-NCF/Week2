public class Main {
    public static void main(String[] args) {
        // Create a Rock playlist
        Playlist rockPlaylist = new Playlist("My Favorite Rock Songs", "Rock");
        rockPlaylist.addSong("Bohemian Rhapsody - Queen");
        rockPlaylist.addSong("Stairway to Heaven - Led Zeppelin");
        rockPlaylist.playAll();

        // Create a Pop playlist
        Playlist popPlaylist = new Playlist("Top Pop Hits", "Pop");
        popPlaylist.addSong("Shape of You - Ed Sheeran");
        popPlaylist.addSong("Blinding Lights - The Weeknd");
        popPlaylist.playAll();

        // Try creating a playlist with another genre
        Playlist jazzPlaylist = new Playlist("Smooth Jazz", "Jazz");
        jazzPlaylist.addSong("So What - Miles Davis");
        jazzPlaylist.playAll();
    }
}
