package com.jcbauman.cratedigger;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

// TEST CODE START 1

import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Toast;
import android.media.AudioManager;
import android.media.MediaPlayer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.github.mikephil.charting.data.PieEntry;
import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import kaaes.spotify.webapi.android.SpotifyApi;
import kaaes.spotify.webapi.android.SpotifyService;
import kaaes.spotify.webapi.android.models.Album;
import kaaes.spotify.webapi.android.models.Artists;
import kaaes.spotify.webapi.android.models.Track;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

// TEST CODE END 1


public class MainActivity extends AppCompatActivity {
    // TEST CODE START 2

    // User Interface
    ImageButton dislikeBtn;
    ImageButton likeBtn;
    SwipeFlingAdapterView flingContainer;
    Toolbar toolbar;


    // Variables
    private CardArrayAdapter arrayAdapter;

    // MediaPlayer
    MediaPlayer mediaPlayer;
    String songPreviewURL;

    // SQLiteHelper
    SQLiteDBHelper dbHelper = null;

    //SongLists
    HardcodedSongs hardcodedSongs;
    List<SongObject> hardcodedSongos;
    List<SongObject> songObjectList;

    // Context
//    Context context = MainActivity.this;

    // TEST CODE END 2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TEST CODE STARTS 3

        //Save preferences
        final SharedPreferences pre = getSharedPreferences("Pref", Context.MODE_PRIVATE);
        pre.edit().putInt("Algorithm_Preference", 2).apply();

        dbHelper = new SQLiteDBHelper(MainActivity.this);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Crate Digger");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        hardcodedSongs = new HardcodedSongs();
        songObjectList = new ArrayList<SongObject>();
        Collections.shuffle(hardcodedSongs.getSongObjectsList());
        hardcodedSongos = hardcodedSongs.getSongObjectsList();

        for(int i = 0; i < 2; i++)
        {
            songObjectList.add(hardcodedSongos.get(0));
            hardcodedSongos.remove(0);
        }

        // Start playing music for first card
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(songObjectList.get(0).getSongPreviewURL());
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        arrayAdapter = new CardArrayAdapter(this, R.layout.item, songObjectList);

        // Swipe Card Controls
        flingContainer = (SwipeFlingAdapterView) findViewById(R.id.frame);
        flingContainer.setAdapter(arrayAdapter);
        flingContainer.setFlingListener(new SwipeFlingAdapterView.onFlingListener() {
            @Override
            public void removeFirstObjectInAdapter() {
                // this is the simplest way to delete an object from the Adapter (/AdapterView)
                Log.d("LIST", "removed object!");
                songObjectList.remove(0);
                arrayAdapter.notifyDataSetChanged();

                mediaPlayer.stop();
                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource(songObjectList.get(0).getSongPreviewURL());
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onLeftCardExit(Object dataObject) {
                //Do something on the left!
                //You also have access to the original object.
                //If you want to use it just cast it (String) dataObject
                SongObject song = (SongObject) dataObject;
                song.setSongLiked(0);
                dbHelper.addSong(song);

                // TEST CODE START 5

                addNextSong();
                //Toast.makeText(MainActivity.this, "Disliked", Toast.LENGTH_SHORT).show();
                // TEST CODE END 5
            }

            @Override
            public void onRightCardExit(Object dataObject) {
                // TEST CODE START 6
                SongObject song = (SongObject) dataObject;
                song.setSongLiked(1);
                dbHelper.addSong(song);
                List<SongObject> songObjects = dbHelper.getAllSongs();

                addNextSong();
                // TEST CODE END 6
                Toast.makeText(MainActivity.this, "Liked!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdapterAboutToEmpty(int numItems){

            }

            public void addNextSong() {
                // Ask for more data here
                if(hardcodedSongos.size()>0) {
                    // TEST CODE START 4
                    HardcodedSongs newHardcodedSongs = new HardcodedSongs();
                    List<SongObject> newSongObjects = newHardcodedSongs.getSongObjectsList();

                    //recommendation algorithm here:
                    RecommendationAlgorithm rec = new RecommendationAlgorithm();
                    rec.setGenreDataList(dbHelper.getGenreData());

                    rec.setAlgPref(pre.getInt("Algorithm_Preference", 2)); // 0: default value
                    songObjectList.add(getNextSongOfGenre(rec.generateBias(), hardcodedSongos));
                }
                else{
                    hardcodedSongs = new HardcodedSongs();
                    hardcodedSongos = hardcodedSongs.getSongObjectsList();
                    for(int i = 0; i < hardcodedSongos.size(); i++)
                    {
                        songObjectList.add(hardcodedSongos.get(0));
                        hardcodedSongos.remove(0);
                    }
                }
                // TEST CODE END 4
            }

            @Override
            public void onScroll(float scrollProgressPercent) {

            }
        });

        dislikeBtn = (ImageButton) findViewById(R.id.left);
        likeBtn = (ImageButton) findViewById(R.id.right);
        dislikeBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                flingContainer.getTopCardListener().selectLeft();
            }
        });
        likeBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                flingContainer.getTopCardListener().selectRight();
            }
        });

        // TEST CODE ENDS 3
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        mediaPlayer.pause();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.showLikedSong:
//                mediaPlayer.pause();
                Intent intent = new Intent (this, LikedSongActivity.class);
                startActivity(intent);
                break;
            case R.id.showStats:
//                mediaPlayer.pause();
                Intent intentt = new Intent (this, StatsActivity.class);
                startActivity(intentt);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    //returns the next song of chosen genre
    public SongObject getNextSongOfGenre(String genreChoice, List<SongObject> songos){
        String gen = "";
        int i = -1;
        while(gen != genreChoice && i<songos.size()-1){
            i++;
            String link = songos.get(i).getSongSpotifyLink();
            if(dbHelper.songSeen(link)){
                gen = songos.get(i).getSongGenre();
            }
            //System.out.println("Choice genre = " + genreChoice + " and found genre = " + gen);
        }
        if(i==songos.size()){i=songos.size()-1;}
        SongObject returnVal = songos.get(i);
        songos.remove(i);
        //System.out.println("It's genre is" + returnVal.getSongGenre());
        return returnVal;
    }


}
