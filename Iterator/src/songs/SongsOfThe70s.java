package songs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongsOfThe70s implements SongIterator{

    private List<SongInfo> bestSongs;

    public SongsOfThe70s() {
        bestSongs = new ArrayList<SongInfo>();

        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);
    }

    public void addSong(String songName, String bandName, int yearReleased){
        bestSongs.add(new SongInfo(songName, bandName, yearReleased));
    }

    public List<SongInfo> getBestSongs(){
        return bestSongs;
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
