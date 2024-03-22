import java.util.*;

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
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.size() == 0){
            System.out.println("This playlist does not contain any song");
        }
        else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!exit){
            int action = sc.nextInt();
            sc.nextLine();
            if(action == 0){
                System.out.println("Playlist complete");
                exit = true;
            }
            else if(action == 1){
                if(!forward){
                    if(listIterator.hasNext()){
                        listIterator.next();
                    }
                    forward = true;
                }
                if(listIterator.hasNext()){
                    System.out.println("Now playing "+listIterator.next().toString());
                }
                else {
                    System.out.println("This is the last song");
                    forward = false;
                }
            }
            else if(action == 2){
                if(forward){
                    if (listIterator.hasPrevious()){
                        listIterator.previous();
                    }
                    forward = false;
                }
                if(listIterator.hasPrevious()){
                    System.out.println("Now playing "+listIterator.previous().toString());
                }
                else {
                    System.out.println("This is the first song");
                    forward = false;
                }
            }
            else if(action == 3){
                if(forward){
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                        forward = false;
                    }
                    else {
                        System.out.println("At the start of the list");
                    }
                }else {
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+listIterator.next().toString());
                        forward = true;
                    }
                    else {
                        System.out.println("Reached to the end of list");
                    }
                }
            }
            else if(action == 4){
                printList(playList);
            }
            else if(action == 5){
                if (playList.size() > 0){
                    listIterator.remove();
                    if(listIterator.hasNext()){
                        System.out.println("now playing "+listIterator.next().toString());
                    }
                    else {
                        if(listIterator.hasPrevious()){
                            System.out.println("now playing "+listIterator.previous().toString());
                        }
                    }
                }
            }
            else{
                printMenu();
            }


        }

    }
    private static void printMenu(){
        System.out.println("Please pick the option:");
        System.out.println("0 - exit");
        System.out.println("1 - play next song");
        System.out.println("2 - play previous song");
        System.out.println("3 -  replay current song");
        System.out.println("4 - list of all songs");
        System.out.println("5 - delete current song");
        System.out.println("6 - all options");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("-----------------");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------");
    }

}
