public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();
        Album label1 = new Album("HUMBLE.","Kendrick Lamar",8,30);
        Album label2 = new Album("Shotta Flow","NLE Choppa",4,12.20);
        Album label3 = new Album("BOP","DaBaby",21,60);
        Album label4 = new Album("NEW MAGIC WAND","Tyler, The Creator",7,21);
        Album label5 = new Album("BLACKOUT","Lil Kapow",12,16);
        myLibrary.add(label1);
        myLibrary.add(label2);
        myLibrary.add(label5);
        System.out.println(myLibrary);
        System.out.println("(*)_(*)_(*)_(*)_(*)_(*)_(*)_(*)_(*)_(*)");
        myLibrary.doubleCapacity();
        System.out.println(myLibrary);
        System.out.println("(*)_(*)_(*)_(*)_(*)_(*)_(*)_(*)_(*)_(*)");
        myLibrary.remove(label1,0);
        myLibrary.add(label3);
        myLibrary.add(label4);
        System.out.println(myLibrary);
        System.out.println("(*)_(*)_(*)_(*)_(*)_(*)_(*)_(*)_(*)_(*)");
    }
}
