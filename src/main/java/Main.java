import java.util.*;

public class Main {
    private boolean name;

    public static void main(String[] args) {

        Novels[] book = new Novels[2];
        book[0] = new Novels("Baltagul", 350, "politist");
        book[1] = new Novels("Morometii", 700, "social");

        ArtAlbums[] artAlbums = new ArtAlbums[2];
        artAlbums[0] = new ArtAlbums("Buchet de flori", 3, "lucioasa");
        artAlbums[1] = new ArtAlbums("Pisica colorata", 2, "vintage");

        for (Novels novels : book) {

            System.out.println("Add " + novels + " to inventory");
        }
        for (ArtAlbums artAlbum : artAlbums) {
            System.out.println("Add " + artAlbum + " to inventory");
        }

        //Lista carti:
        List<String> list = new ArrayList<>();
        list.add("Baltagul");
        list.add("Morometii");
        list.add("Buchet de flori");
        list.add("Pisica colorata");
        System.out.println(list);

        //Remove book:
        boolean isRemoved = list.remove("Baltagul");
        System.out.println(list);
        System.out.println(isRemoved);

        //Add book:
        boolean isAdded = list.add("Enigma Otiliei");
        System.out.println(list);
        System.out.println(isAdded);
    }
}


