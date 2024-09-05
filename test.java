interface Playable {
    void play();
}

interface Storable {
    void store();
}

class Song implements Playable, Storable {
    private String title;

    public Song(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title);
    }

    @Override
    public void store() {
        System.out.println("Storing " + title);
    }
}

