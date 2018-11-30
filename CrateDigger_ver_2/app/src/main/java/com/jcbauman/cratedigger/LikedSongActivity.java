package com.jcbauman.cratedigger;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
        System.out.println("yo check out: " + songobjectsList.get(0).getSongName());
    }
}
