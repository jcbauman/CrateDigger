package com.jcbauman.cratedigger;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class RecommendationAlgorithm
{
    Context context;
//    private List<SongObject> songObjectList = new ArrayList<SongObject>();
    private List<GenreData> genreDataList = new ArrayList<GenreData>();

    // Constructor

    public void setContext(Context context)
    {
        this.context = context;
    }

//    // if you need to add songs one by one use this
//    public void addSongObject(SongObject songObject)
//    {
//        this.songObjectList.add(songObject);
//    }
//
//    // If you have a list of song objects use this
//    public void setSongObjectList(List<SongObject> songObjectList)
//    {
//        this.songObjectList = songObjectList;
//    }

    // Get genre stats
    public void setGenreDataList()
    {
        SQLiteDBHelper dbHelper = new SQLiteDBHelper(context);
        genreDataList = dbHelper.getGenreData();
    }

    // Algorithm for Bias Choice
    public String generateBias()
    {
        String bias = null;

        /*
        * Order of genreDataList
        *
        * 0. rock
        * 1. soulFunkRB
        * 2. hipHopRap
        * 3. alternativeIndie
        * 4. danceElectronic
        * 5. world
        * 6. other
        * 7. jazz
        */

        double[] probs = new double[this.genreDataList.size()];
        double total = 0.0;

        for(int i = 0; i < this.genreDataList.size(); i++)
        {
            probs[i] = this.genreDataList.get(i).getGenreAmount();
            total += this.genreDataList.get(i).getGenreAmount();
        }
        for(int i = 0; i < this.genreDataList.size(); i++)
        {
            probs[i] /= total;
        }

        int index = probs.length-1;
        double randomNumber = Math.random();

        for(int i = 0; i < probs.length; i++)
        {
            if(randomNumber < probs[i])
            {
                index = i;
                break;
            }
            else
                {
                    randomNumber -= probs[i];
                }
        }

        bias = this.genreDataList.get(index).getGenreName();

        return bias;
    }
}
