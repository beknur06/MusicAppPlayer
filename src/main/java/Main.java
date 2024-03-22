import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {

        Album album1 = new Album("The Slim Shady LP","Eminem",1999);
        album1.addSong("My Name Is [Explicit]", 279);
        album1.addSong("Brain Damage", 227);
        album1.addSong("My Name Is", 200);

        Album album2 = new Album("Joy Time","Marshmallow",2016);
        album2.addSong("Know Me", 205);
        album2.addSong("Summer", 203);
        album2.addSong("Find Me", 230);

        albums.add(album1);
        albums.add(album2);

        LinkedList<Song> playList_1 = new LinkedList<>();

        albums.get(0).addToPlayList("Know Me", playList_1);
        albums.get(0).addToPlayList("My Name Is",playList_1);
        albums.get(1).addToPlayList("Find Me",playList_1);
        albums.get(1).addToPlayList("Summer",playList_1);

        play(playList_1);
    }

    private static void play(LinkedList<Song> playList){

    }

}
