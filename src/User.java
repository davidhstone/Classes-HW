import java.util.*;

/**
 * Created by davidstone on 6/28/16.
 */
public class User {
    protected String mName;
    protected HashMap<String, Playlist> mPlaylistsMap;

  //  HashMap<String,Integer> inventoryMap = new HashMap<String,Integer>();
  public User(String userName, HashMap Playlist) {
      mName = userName;
      mPlaylistsMap = new HashMap<String, Playlist>();
  }

   public void addPlayList (Playlist playlist) {
       mPlaylistsMap.add(playlist);   //why doesn't this work?
   }

   public Set<String> getAllPlayListNames(){
       return mPlaylistsMap.keySet();
   }

   public ArrayList getPlaylistByName(String Songs)  {
       return mPlaylistsMap.get(Songs);
   }
}
