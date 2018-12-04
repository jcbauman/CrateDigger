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
    public static final String KEY_SONG_LIKED =  "song_liked";

    // Create Table Query
    private static final String SQL_CREATE_SONGS =
            "CREATE TABLE songs (" + KEY_SONG_ID + " INTEGER PRIMARY KEY, "
            + KEY_SONG_URI + " TEXT, " + KEY_SONG_NAME + " TEXT, " + KEY_SONG_ARTIST + " TEXT, "
            + KEY_SONG_GENRE + " TEXT, "
            + KEY_SONG_IMAGE_URL + " TEXT, " + KEY_SONG_PREVIEW_URL + " TEXT, "
            + KEY_SONG_SPOTIFY_LINK + " TEXT, " + KEY_SONG_LIKED + " INTEGER );";

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
        song_objects.put(KEY_SONG_LIKED, song.getSongLiked());

        long newRowId = db.insert(TABLE_NAME, null, song_objects);
        db.close();
        return newRowId;
    }

    public ArrayList<SongObject> getAllSongs()
    {
        ArrayList<SongObject> songObjectsList = new ArrayList<SongObject>();
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
                    songObject.setSongLiked(cursor.getInt(8));

                    // Add song object to list
                    songObjectsList.add(songObject);
                } while(cursor.moveToNext());
        }
        db.close();
        return songObjectsList;
    }

    public ArrayList<SongObject> getLikedSongs()
    {
        ArrayList<SongObject> songObjectsList = new ArrayList<SongObject>();
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
                if(cursor.getInt(8) == 1) {
                    SongObject songObject = new SongObject();
                    songObject.setSongId(cursor.getInt(0));
                    songObject.setSongURI(cursor.getString(1));
                    songObject.setSongName(cursor.getString(2));
                    songObject.setSongArtist(cursor.getString(3));
                    songObject.setSongGenre(cursor.getString(4));
                    songObject.setSongImageURL(cursor.getString(5));
                    songObject.setSongPreviewURL(cursor.getString(6));
                    songObject.setSongSpotifyLink(cursor.getString(7));
                    songObject.setSongLiked(cursor.getInt(8));

                    // Add song object to list
                    songObjectsList.add(songObject);
                }
            } while(cursor.moveToNext());
        }
        db.close();
        return songObjectsList;
    }

    public Boolean songSeen(String songLink){
        SQLiteDatabase database = getWritableDatabase();
        String query = "SELECT * FROM songs WHERE song_spotify_link = '" + songLink + "'";
        Cursor data = database.rawQuery(query, null);
        if(data.getCount() > 0)
        {
            System.out.println(data.getCount());
            return true;
        }
        return false;
    }

    public List<GenreData> getGenreData()
    {
//        GenreData topGenre = null;

        GenreData rockGenre = new GenreData("Rock", 1);
        GenreData soulFunkRBGenre = new GenreData("Soul/Funk/R&B", 1);
        GenreData hipHopRapGenre = new GenreData("Hip-Hop/Rap", 1);
        GenreData alternativeIndieGenre = new GenreData("Alternative/Indie", 1);
        GenreData danceElectronicGenre = new GenreData("Dance/Electronic", 1);
        GenreData worldGenre = new GenreData("World", 1);
        GenreData otherGenre = new GenreData("Other", 1);
        GenreData jazzGenre = new GenreData("Jazz", 1);

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
                if(cursor.getInt(8) == 1) {
                    String currentGenre = cursor.getString(4);
                    if(currentGenre.equals("Rock"))
                    {
                        rockGenre.incrementGenreAmount();
                    }
                    else if(currentGenre.equals("Soul/Funk/R&B"))
                    {
                        soulFunkRBGenre.incrementGenreAmount();
                    }
                    else if(currentGenre.equals("Hip-Hop/Rap"))
                    {
                        hipHopRapGenre.incrementGenreAmount();
                    }
                    else if(currentGenre.equals("Alternative/Indie"))
                    {
                        alternativeIndieGenre.incrementGenreAmount();
                    }
                    else if(currentGenre.equals("Dance/Electronic"))
                    {
                        danceElectronicGenre.incrementGenreAmount();
                    }
                    else if(currentGenre.equals("World"))
                    {
                        worldGenre.incrementGenreAmount();
                    }
                    else if(currentGenre.equals("Other"))
                    {
                        otherGenre.incrementGenreAmount();
                    }
                    else if(currentGenre.equals("Jazz"))
                    {
                        jazzGenre.incrementGenreAmount();
                    }
                }
            } while(cursor.moveToNext());
        }

        List<GenreData> genreDataList = new ArrayList<GenreData>();
        genreDataList.add(rockGenre);
        genreDataList.add(soulFunkRBGenre);
        genreDataList.add(hipHopRapGenre);
        genreDataList.add(alternativeIndieGenre);
        genreDataList.add(danceElectronicGenre);
        genreDataList.add(worldGenre);
        genreDataList.add(otherGenre);
        genreDataList.add(jazzGenre);

//        topGenre = rockGenre;

//        for(int i = 1; i < genreDataList.size(); i++)
//        {
//            if(genreDataList.get(i).getGenreAmount() > topGenre.getGenreAmount())
//            {
//                topGenre = genreDataList.get(i);
//            }
//        }

        db.close();
        return genreDataList;
    }
}

class GenreData
{
    private String genreName;
    private int genreAmount;

    public GenreData(String genre, int amount)
    {
        this.genreName = genre;
        this.genreAmount = amount;
    }

    public String getGenreName()
    {
        return this.genreName;
    }

    public int getGenreAmount()
    {
        return this.genreAmount;
    }

    public void incrementGenreAmount()
    {
        this.genreAmount++;
    }
}
