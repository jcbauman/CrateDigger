package com.jcbauman.cratedigger;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class LikedSongActivity extends AppCompatActivity {

    Context ctx;
    SQLiteDBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liked_song);

        dbHelper = new SQLiteDBHelper(LikedSongActivity.this);
        dbHelper.getWritableDatabase();

        List<SongObject> songobjectsList = dbHelper.getAllSongs();
//        System.out.println("yo check out: " + songobjectsList.get(0).getSongName());

        String[] array = new String[songobjectsList.size()];
        for(int i = 0; i < songobjectsList.size(); i++)
        {
            array[i] = "";
            array[i] += songobjectsList.get(i).getSongName() + " by " + songobjectsList.get(i).getSongArtist();
        }

        ListAdapter A = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);
        ListView B = (ListView) findViewById(R.id.LikedSongList);
        B.setAdapter(A);
    }
}
