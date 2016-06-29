/**
 * Created by davidstone on 6/28/16.
 */
public class Song {
    // 3 member vars mSongName, mArtistName, mAlbumName
    protected String mSongName;
    protected String mArtistName;
    protected String mAlbumName;

    public Song (String songName, String artistName, String albumName) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
    }
    public String play(String mSongName) {
        System.out.println(mSongName + mArtistName + mAlbumName);
        return mSongName;
    }

    public String getmSongName() {
        return mSongName;
    }

    public void setmSongName(String mSongName) {
        this.mSongName = mSongName;
    }
}
