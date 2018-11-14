package com.jcbauman.cratedigger;

import java.util.ArrayList;
import java.util.List;

public class DisplaySong
{
    SQLiteDBHelper dbHelper = null;

    // Handles backend operations
    private List<SongObject> songObjectsList = new ArrayList<SongObject>();

    public void addSongObject(SongObject songObject)
    {
        // See if song has already been shown

        songObjectsList.add(songObject);
    }

    public void removeSoundObject()
    {
        songObjectsList.remove(0);
    }

    public List<SongObject> getSongObjectsList()
    {
        return this.songObjectsList;
    }

    public void likedSong()
    {
        // Add SongObject to database
        dbHelper.addSong(this.songObjectsList.get(0));
    }

    public void dislikedSong()
    {
        // Do Something
    }
}
