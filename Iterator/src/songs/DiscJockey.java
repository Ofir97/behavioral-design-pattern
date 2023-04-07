package songs;

import java.util.Iterator;

public class DiscJockey {

    private SongIterator iter70sSongs;
    private SongIterator iter80sSongs;
    private SongIterator iter90sSongs;

    public DiscJockey(SongIterator iter70sSongs, SongIterator iter80sSongs, SongIterator iter90sSongs) {
        this.iter70sSongs = iter70sSongs;
        this.iter80sSongs = iter80sSongs;
        this.iter90sSongs = iter90sSongs;
    }

    public void displaySongs() {
        Iterator Songs70s = iter70sSongs.createIterator();
        Iterator Songs80s = iter80sSongs.createIterator();
        Iterator Songs90s = iter90sSongs.createIterator();

        System.out.println("--- Songs of the 70s ---\n");
        printTheSongs(Songs70s);

        System.out.println("--- Songs of the 80s ---\n");
        printTheSongs(Songs80s);

        System.out.println("--- Songs of the 90s ---\n");
        printTheSongs(Songs90s);
    }

    public void printTheSongs(Iterator iterator) {
        while (iterator.hasNext()) {
            SongInfo songInfo = (SongInfo) iterator.next();

            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased() + "\n");
        }
    }
}
