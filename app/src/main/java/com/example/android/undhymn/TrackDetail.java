package com.example.android.undhymn;

/**
 * Custom class for Track detail with getter methods
 * Created by Nishant on 10/28/2017.
 */

public class TrackDetail {

    /* Name of song */
    private String mSongName;

    /* Artist of the song */
    private String mArtistName;

    /* Album art for the song*/
    private int mAlbumArt;

    /***
     *  Public constructor for detail of songs
     * @param songName name of song
     * @param artistName name of artist
     * @param albumArt drawable resource id for album art
     */
    public TrackDetail(String songName, String artistName, int albumArt){
        mSongName = songName;
        mArtistName = artistName;
        mAlbumArt = albumArt;
    }

    /**
     *  This method is called to get name of the song
     * @return name of song
     */
    public String getSongName(){
        return mSongName;
    }

    /**
     * This method is called to get name of artist
     * @return name of artist
     */
    public String getArtistName(){
        return mArtistName;
    }

    /**
     * This method is called to get resource is for drawable album art
     * @return resource id of drawable album art
     */
    public  int getAlbumArt(){
        return mAlbumArt;
    }
}
