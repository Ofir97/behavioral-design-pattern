package songs;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator{

    private SongInfo[] bestSongs;

    int arrayIndex = 0;

    public SongsOfThe80s() {
        bestSongs = new SongInfo[3];

        addSong("Roam", "B 52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears For Fears", 1985);
    }

    // Add a SongInfo Object to the array and increment to the next position

    public void addSong(String songName, String bandName, int yearReleased){
        SongInfo song = new SongInfo(songName, bandName, yearReleased);
        bestSongs[arrayIndex] = song;
        arrayIndex++;
    }

    public SongInfo[] getBestSongs(){
        return bestSongs;
    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
