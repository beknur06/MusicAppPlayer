import java.util.ArrayList;
import java.util.LinkedList;

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
    public boolean addToPlayList(int trackValue, LinkedList<Song> PlayList){
        int index = trackValue - 1;
        if(index > 0 && index < this.songs.size()){
            PlayList.add(this.songs.get(index));
            System.out.println("The song has been added to Play List successfully");
            return true;
        }
        else{
            System.out.println("Out of the range of the album songs");
            return false;
        }
    }
    public boolean addToPlayList(String name, LinkedList<Song> PlayList){
        for(int i = 0 ; i < songs.size(); i++){
            if(songs.get(i).getName().equals(name)){
                PlayList.add(this.songs.get(i));
                System.out.println("The song has been added to Play List successfully");
                return true;
            }
        }
        System.out.println("There is no song named: " + name);
        return false;
    }
}
