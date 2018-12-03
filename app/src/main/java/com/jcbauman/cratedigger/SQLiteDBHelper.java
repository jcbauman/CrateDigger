package com.jcbauman.cratedigger;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class SQLiteDBHelper extends SQLiteOpenHelper
{
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "SongObjects";

    public static final String TABLE_NAME = "songs";
    public static final String KEY_SONG_ID = "song_id";
    public static final String KEY_SONG_URI = "song_uri";
    public static final String KEY_SONG_NAME = "song_name";
    public static final String KEY_SONG_ARTIST = "song_artist";
    public static final String KEY_SONG_GENRE = "song_genre";
    public static final String KEY_SONG_IMAGE_URL = "song_image_url";
    public static final String KEY_SONG_PREVIEW_URL = "song_preview_url";
    public static final String KEY_SONG_SPOTIFY_LINK = "song_spotify_link";

    // Create Table Query
    private static final String SQL_CREATE_SONGS =
            "CREATE TABLE songs (" + KEY_SONG_ID + " INTEGER PRIMARY KEY, "
            + KEY_SONG_URI + " TEXT, " + KEY_SONG_NAME + " TEXT, " + KEY_SONG_ARTIST + " TEXT, "
            + KEY_SONG_GENRE + " TEXT, "
            + KEY_SONG_IMAGE_URL + " TEXT, " + KEY_SONG_PREVIEW_URL + " TEXT, "
            + KEY_SONG_SPOTIFY_LINK + " TEXT );";

    private static final String SQL_DELETE_SONGS =
            "DROP TABLE IF EXISTS " + TABLE_NAME;

    public SQLiteDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_SONGS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        //Drop the table while upgrading the database
        // such as adding new column or changing existing constraint
        db.execSQL(SQL_DELETE_SONGS);
        this.onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        this.onUpgrade(db, oldVersion, newVersion);
    }

    public long addSong(SongObject song)
    {
        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a map having song details to be inserted
        ContentValues song_objects = new ContentValues();
        song_objects.put(KEY_SONG_URI, song.getSongURI());
        song_objects.put(KEY_SONG_NAME, song.getSongName());
        song_objects.put(KEY_SONG_ARTIST, song.getSongArtist());
        song_objects.put(KEY_SONG_GENRE, song.getSongGenre());
        song_objects.put(KEY_SONG_IMAGE_URL, song.getSongImageURL());
        song_objects.put(KEY_SONG_PREVIEW_URL, song.getSongPreviewURL());
        song_objects.put(KEY_SONG_SPOTIFY_LINK, song.getSongSpotifyLink());

        long newRowId = db.insert(TABLE_NAME, null, song_objects);
        db.close();
        return newRowId;
    }

    public List<SongObject> getAllSongs()
    {
        List<SongObject> songObjectsList = new ArrayList<SongObject>();
        String selectQuery = "SELECT * FROM " + TABLE_NAME
                + " ORDER BY " + KEY_SONG_ID + " DESC";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // If TABLE had rows
        if(cursor.moveToFirst())
        {
            // Loop through the table rows
            do
                {
                    SongObject songObject = new SongObject();
                    songObject.setSongId(cursor.getInt(0));
                    songObject.setSongURI(cursor.getString(1));
                    songObject.setSongName(cursor.getString(2));
                    songObject.setSongArtist(cursor.getString(3));
                    songObject.setSongGenre(cursor.getString(4));
                    songObject.setSongImageURL(cursor.getString(5));
                    songObject.setSongPreviewURL(cursor.getString(6));
                    songObject.setSongSpotifyLink(cursor.getString(7));

                    // Add song object to list
                    songObjectsList.add(songObject);
                } while(cursor.moveToNext());
        }
        db.close();
        return songObjectsList;
    }
}