package com.jcbauman.cratedigger;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LikedSongActivity extends AppCompatActivity {

    Context ctx;
    SQLiteDBHelper dbHelper;
    GridView gridView;
    ArrayList<SongObject> list;
    LikedSongListAdapter adapter = null;
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liked_song);

        //UI
        gridView = (GridView) findViewById(R.id.LikedSongList);
        list = new ArrayList<>();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Your Music");

        //list.clear();
        dbHelper = new SQLiteDBHelper(LikedSongActivity.this);
        dbHelper.getWritableDatabase();
        list = dbHelper.getLikedSongs();

        adapter = new LikedSongListAdapter(this, R.layout.liked_song_list_item, list);
        gridView.setAdapter(adapter);

        adapter.notifyDataSetChanged();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = gridView.getItemAtPosition(position);
                SongObject oo = (SongObject) o;
                System.out.println("SPOTIFY LINK: "+ oo.getSongSpotifyLink());
                Uri uri = Uri.parse(oo.getSongSpotifyLink());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.likes,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.backToMain:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
