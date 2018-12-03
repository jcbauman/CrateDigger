package com.jcbauman.cratedigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

// TEST CODE START 1

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.media.AudioManager;
import android.media.MediaPlayer;
import java.io.IOException;
import java.util.List;
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
    Button likedSongBtn;
    Button statsBtn;
    SwipeFlingAdapterView flingContainer;

    // Variables
    private CardArrayAdapter arrayAdapter;

    // MediaPlayer
    MediaPlayer mediaPlayer;
    String songPreviewURL;

    // SQLiteHelper
    SQLiteDBHelper dbHelper = null;

    // TEST CODE END 2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TEST CODE STARTS 3

        dbHelper = new SQLiteDBHelper(MainActivity.this);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        getSupportActionBar().setTitle("Crate Digger");

        final HardcodedSongs hardcodedSongs = new HardcodedSongs();

        // Start playing music for first card
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(hardcodedSongs.getSongObjectsList().get(0).getSongPreviewURL());
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        arrayAdapter = new CardArrayAdapter(this, R.layout.item, hardcodedSongs.getSongObjectsList());

        // Swipe Card Controls
        flingContainer = (SwipeFlingAdapterView) findViewById(R.id.frame);
        flingContainer.setAdapter(arrayAdapter);
        flingContainer.setFlingListener(new SwipeFlingAdapterView.onFlingListener() {
            @Override
            public void removeFirstObjectInAdapter() {
                // this is the simplest way to delete an object from the Adapter (/AdapterView)
                Log.d("LIST", "removed object!");
                hardcodedSongs.removeSoundObject();
                arrayAdapter.notifyDataSetChanged();

                mediaPlayer.stop();
                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.setDataSource(hardcodedSongs.getSongObjectsList().get(0).getSongPreviewURL());
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

                // TEST CODE START 5
                hardcodedSongs.dislikedSong();
                Toast.makeText(MainActivity.this, "Disliked", Toast.LENGTH_SHORT).show();
                // TEST CODE END 5
            }

            @Override
            public void onRightCardExit(Object dataObject) {
                // TEST CODE START 6
                dbHelper.addSong((SongObject) dataObject);
                List<SongObject> songObjects = dbHelper.getAllSongs();
                for(int i = 0; i < songObjects.size(); i++)
                {
                    System.out.println("LOOK OVER HERE!!!!!!!!!!!!!! " + songObjects.get(i).getSongName());
                }

                hardcodedSongs.likedSong();
                // TEST CODE END 6
                Toast.makeText(MainActivity.this, "Liked", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdapterAboutToEmpty(int itemsInAdapter) {
                // Ask for more data here

                // TEST CODE START 4
                HardcodedSongs newHardcodedSongs = new HardcodedSongs();
                List<SongObject> newSongObjects = newHardcodedSongs.getSongObjectsList();
                for(int i = 0; i < newSongObjects.size(); i++)
                {
                    hardcodedSongs.addSongObject(newSongObjects.get(i));
                }
                // TEST CODE END 4
            }

            @Override
            public void onScroll(float scrollProgressPercent) {

            }
        });

        dislikeBtn = (ImageButton) findViewById(R.id.left);
        likeBtn = (ImageButton) findViewById(R.id.right);
        likedSongBtn = (Button) findViewById(R.id.likedSongBtn);
        statsBtn = (Button) findViewById(R.id.statsBtn);

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
        likedSongBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToLikedSongsActivity(v);
            }
        });
        statsBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goToStatsActivity(v);
            }
        });

        // TEST CODE ENDS 3
    }
    public void goToLikedSongsActivity(View view){
        Intent intent = new Intent (this, LikedSongActivity.class);
        startActivity(intent);
    }

    public void goToStatsActivity(View view){
        Intent intent = new Intent (this, StatsActivity.class);
        startActivity(intent);
    }
}
