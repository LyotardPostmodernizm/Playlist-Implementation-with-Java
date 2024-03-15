import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    // write code here
    private String name;
    private String artist;
    private ArrayList<Song>songs;
    
    public Album(String name, String artist){
        this.name = name;
        this. artist = artist;
        this.songs = new ArrayList<Song>();
    }
    
    public boolean addSong(String title, double duration){
        if(findSong(title)!=null) return false;
        
        
            Song asong = new Song(title,duration);
            songs.add(asong);
            return true;
        
    }
    
    private Song findSong(String title){
        for (Song asong:songs){
            if (asong.getTitle().equals(title)) return asong;
            
        }
        return null;
    }
    
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= songs.size())) {
            playList.add(songs.get(index));
            return true;
        }
        return false;
    }
    
    public boolean addToPlaylist(String title,LinkedList<Song>playlist){
        Song asong = findSong(title);
        if (asong != null){
            playlist.add(asong);
            return true;
        }
        return false;
    }
    
}
