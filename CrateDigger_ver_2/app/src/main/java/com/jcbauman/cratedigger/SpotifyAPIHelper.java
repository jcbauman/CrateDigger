package com.jcbauman.cratedigger;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import kaaes.spotify.webapi.android.SpotifyApi;
import kaaes.spotify.webapi.android.SpotifyService;
import kaaes.spotify.webapi.android.models.Album;
import kaaes.spotify.webapi.android.models.Artist;
import kaaes.spotify.webapi.android.models.Artists;
import kaaes.spotify.webapi.android.models.Track;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class SpotifyAPIHelper extends DisplaySong{

    SpotifyApi api = new SpotifyApi();
    SpotifyService spotify;

    Track track;
    Album album;
    Artist artist;

    public SpotifyAPIHelper() {
        //SPOTIFY ROCKO TEST CODE BEGINS

        // Most (but not all) of the Spotify Web API endpoints require authorisation.
        // If you know you'll only use the ones that don't require authorisation you can skip this step

        //ACCESS TOKEN NEEDS TO BE UPDATED PERIODICALLY AS OF NOW
        api.setAccessToken("BQBGrvS-RCxQl4oDJnQaFufLkHx6-AVWUtTzN_noNPJNfS07Xpb3r-3QU1E1mezjqgpyHXfd2eniygRaWrAdlw3yxaHFDChcfs0Cvlk8-3lxrkuxiz1A-kvDVWYMMieGBN_dlBdU17V2Azbz");
        spotify = api.getService();
    }


    public void getATrack(String songURI){
        SongObject song = new SongObject();
        spotify.getTrack(songURI,new Callback<Track>()
        {
            @Override
            public void success (Track track, Response response){
                Log.d("Song success: name = ", track.name);
            }

            @Override
            public void failure (RetrofitError error){
                Log.d("Song failure", error.toString());
            }
        });
        song = new SongObject(0,songURI,track.name,track.artists.toString(), "https://i.scdn.co/image/755a2683937d13f338c1aa09284db25ff50e9b70",track.preview_url,track.external_urls.get(0));
        this.addSongObject(song);
    }

    //THIS VERSION IS MORE EFFECTIVE BUT IT GIVES US ERRORS EVERY DAMN TIME
//    public void getATrack(String songURI){
//        try {
//            Track track = spotify.getTrack(songURI);
//            SongObject song = new SongObject(0, songURI, track.name, track.artists.toString(), "https://i.scdn.co/image/755a2683937d13f338c1aa09284db25ff50e9b70", track.preview_url, track.external_urls.get(0));
//            this.addSongObject(song);
//        }catch (Exception e){
//            System.out.println("Song failure.");
//        }
//    }



    //SPOTIFY ROCKO TEST CODE ENDS


}
