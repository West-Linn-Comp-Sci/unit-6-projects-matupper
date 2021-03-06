public class MusicLibrary
{
    int totalSongs = 0;
    double totalPlayTime = 0;
    Album[] library = new Album[10];

    public MusicLibrary (){
    }
    public int totalSongs() {
        return totalSongs;
    }
    public double totalPlayTime() {
        return totalPlayTime;
    }
    public String toString(){
        String result = "";
        for(int i = 0; i < library.length; i++){
            int albumSequence = i + 1;
            result += "--------------------------------- \n" +
                    "Album " + albumSequence + ": \n" + library[i] + "\n";
        }
        result += "\n" + "Total number of tracks: " + totalSongs + "\n";
        result += "Total playtime: " + totalPlayTime + "\n";
        return result;
    }
    public void doubleCapacity(){
        Album[] newLibrary = new Album[library.length * 2];
        for (int i = 0; i < library.length; i++){
            newLibrary[i] = library[i];
        }
        library = newLibrary;
    }
    public void add(Album album) {
        for(int i =0; i < library.length; i++) {
            if(library[i] == null) {
                totalSongs += album.songs();
                totalPlayTime = album.playTime();

                library[i] = album;
                break;
            }
        }
    }
    public void remove(Album album, int albumNum) {
        library[albumNum] = null;
        totalSongs -= album.songs();
        totalPlayTime -= album.playTime();
    }
    public void sortByNameAlpha() {
        for (int i = 0; i < library.length - 1; i++) {
            int min = i;
            for (int j = i; j < library.length; j++) {
                if (library[j] != null && library[j].name().compareToIgnoreCase(library[min].name()) < 0) {
                    min = j;
                }
            }
            Album temp;
            temp = library[i];
            library[i] = library[min];
            library[min] = temp;

        }
    }
    public void sortByDuration() {
        for (int i = 0; i < library.length - 1; i++) {
            int min = i;
            for (int j = i; j < library.length; j++) {
                if (library[j] != null && library[j].playTime < library[min].playTime) {
                    min = j;
                }
            }
            Album temp2;
            temp2 = library[i];
            library[i] = library[min];
            library[min] = temp2;
        }
    }
    public int binarySearchTitle(String title) {
        int realLength = library.length;
        for (int i = 0; i < library.length; i++){
            if (library[i] == null){
                realLength --;
            }
        }
        int high = realLength;
        int low = 0;
        int mid = (high + low) / 2;
        while(!library[mid].name().equals(title)) {
            if(library[mid].name().compareToIgnoreCase(title) < 0) {
                low = mid;
                mid = (high + low)/2;
            }
            else {
                high = mid;
                mid = (high + low) / 2;
            }
        }
        return mid;
    }
    public int binarySearchArtist(String artist) {
        int realLength = library.length;
        for (int i = 0; i < library.length; i++){
            if (library[i] == null){
                realLength --;
            }
        }
        int high = realLength;
        int low = 0;
        int mid = (high + low) / 2;
        while(!library[mid].artist().equals(artist)) {
            if(library[mid].artist().compareToIgnoreCase(artist) < 0) {
                low = mid;
                mid = (high + low)/2;
            }
            else {
                high = mid;
                mid = (high + low) / 2;
            }
        }
        return mid;
    }
    public int linearSearchTitle(String title){
        int realLength = library.length;
        for (int i = 0; i < library.length; i++){
            if (library[i] == null){
                realLength --;
            }
        }
        for (int i = 0; i < realLength; i++){
            if (library[i].name == title){
                return i;
            }
        }
        return -1;
    }
    public int linearSearchArtist(String artist){
        int realLength = library.length;
        for (int i = 0; i < library.length; i++){
            if (library[i] == null){
                realLength --;
            }
        }
        for (int i = 0; i < realLength; i++){
            if (library[i].artist == artist){
                return i;
            }
        }
        return -1;
    }
}