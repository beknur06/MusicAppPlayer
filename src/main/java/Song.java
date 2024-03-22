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
    @Override
    public String toString(){
        return "Song{ name: " + name + ", duration: " + duration + "}";
    }

}
