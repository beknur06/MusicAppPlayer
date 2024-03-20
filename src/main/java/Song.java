public class Song {
    String name;
    int duration;

    public Song(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    public Song(){

    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }
    public String about(){
        return "Song{ name: " + name + ", duration: " + duration + "}";
    }

}
