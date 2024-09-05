import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a user
        User user = new User("john_doe");

        // Create playlists
        Playlist popPlaylist = user.createPlaylist("John's Pop Hits", "pop");
        Playlist rockPlaylist = user.createPlaylist("John's Rock Collection", "rock");

        // Create songs
        Song song1 = new Song("Shape of You", "Ed Sheeran", 4.24);
        Song song2 = new Song("Bohemian Rhapsody", "Queen", 5.55);
        Song song3 = new Song("Blinding Lights", "The Weeknd", 3.20);

        // Add songs to playlists
        user.addSongToPlaylist(popPlaylist, song1);
        user.addSongToPlaylist(rockPlaylist, song2);
        user.addSongToPlaylist(popPlaylist, song3);

        // Get user input for genre recommendation
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a genre (pop, rock, jazz) for song recommendations:");
        String genre = scanner.nextLine();

        // Recommend songs based on genre
        user.recommendSongsByGenre(genre);
    }
}
