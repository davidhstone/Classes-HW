/**
 * Created by davidstone on 6/28/16.
 */
import java.util.*;


public class Playlist {
    protected String mName;
    protected ArrayList<Song> mSongs;



    public Playlist (String Songs) {
        mName = "Songs";
        mSongs = new ArrayList<Song>();


    }

    public String getName() {
        return mName;
    }

    public void addSong (Song song) {
        mSongs.add(song);
    }

    public void playAll (Song song) {
        for (int i = 0; i < mSongs.size(); i++){
            song.play();
        }  //why doesn't this work?
    }

    public String getmName() {
        return mName;
    }
}

