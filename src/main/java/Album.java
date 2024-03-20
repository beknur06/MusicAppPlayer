import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private int releaseDate;
    private ArrayList<Song> songs;

    public Album(String name, String artist, int releaseDate, ArrayList<Song> songs) {
        this.name = name;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.songs = new ArrayList<Song>();
    }
    public Album(){

    }
    public Song findSong(String name){
        for(int i = 0 ; i < songs.size(); i++){
            if(songs.get(i).getName().equals(name)){
                return songs.get(i);
            }
        }
        return null;
    }
    public boolean addSong(String name, int duration){
        if(findSong(name) == null){
            songs.add(new Song(name,duration));
            System.out.println("The song has been added to this album successfully");
            return true;
        }
        else {
            System.out.println("The song has already been added to this album before");
            return false;
        }
    }
}
