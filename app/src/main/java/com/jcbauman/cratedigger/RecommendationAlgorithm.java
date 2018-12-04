package com.jcbauman.cratedigger;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class RecommendationAlgorithm
{
//    private List<SongObject> songObjectList = new ArrayList<SongObject>();
    private List<GenreData> genreDataList = new ArrayList<GenreData>();
    int algPref = 2;
    // Constructor

//    public void setContext(Context context)
//    {
//        this.context = context;
//    }

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
    public void setGenreDataList(List<GenreData> genreDataList)
    {
        this.genreDataList = genreDataList;
    }

    public void setAlgPref(int pref){
        algPref = pref;
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
       // System.out.println("Alg pref: " + algPref);

        //change alg based on preferences
        int topGenre = getTopGenre(probs);
        if(topGenre>-1){
            probs[topGenre] = (probs[topGenre]+(algPref-2));
            total += (algPref - 2);
            }
            while(probs[topGenre]<0){
                probs[topGenre] = (probs[topGenre] + 1);
                total++;
        }

        for(int i = 0; i < this.genreDataList.size(); i++)
        {
            probs[i] /= total;
        }

        int index = 0;
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

        System.out.println("Bias" + bias);
        return bias;
    }

    public int getTopGenre(double[] songVal) {
        double maxVal = 0;
        int maxIndex = -1;
        for (int i = 0; i < songVal.length; i++) {
            if (songVal[i] > maxVal) {
                maxVal = songVal[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
