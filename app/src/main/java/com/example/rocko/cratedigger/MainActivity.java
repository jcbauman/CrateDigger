package com.example.rocko.cratedigger;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;
import com.spotify.android.appremote.api.ConnectionParams;
import com.spotify.android.appremote.api.Connector;
import com.spotify.android.appremote.api.SpotifyAppRemote;
import com.spotify.protocol.client.Subscription;
import com.spotify.protocol.types.Album;
import com.spotify.protocol.types.PlayerState;
import com.spotify.protocol.types.Track;

import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;
import java.util.List;

import kaaes.spotify.webapi.android.SpotifyApi;
import kaaes.spotify.webapi.android.SpotifyService;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends AppCompatActivity {


    //UI
    ImageButton dislikeBtn;
    ImageButton likeBtn;
    SwipeFlingAdapterView flingContainer;

    //Hardcoded song metadata
    private Card cards_data[];
    private ArrayList<String> al;
    private ArrayList<String> audioSample;
    private ArrayList<String> artwork;
    ListView listview;
    List<Card> rowItems;

    private CardArrayAdapter arrayAdapter;

    //Spotify API data
    private int i;
    private static final String CLIENT_ID = "b25d7e2520a046158aaaa51094859686";
    private static final String REDIRECT_URI = "https://jcbauman.portfoliobox.net/";
    private SpotifyAppRemote mSpotifyAppRemote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SpotifyApi api = new SpotifyApi();
        api.setAccessToken("BQDKZmqNvqvHzuXbTK8nS2MVlWOEpsWm-HtFhl7ZJh7B8jpDCl0oIHkvq1qSh-ZQJ70WCCgyCRAfxJ8rpaChdMjrxdB1sUAc2CbFmpJlgEC506m528Az4x38i0WBYjZuiGdkuJzEdgCFFhcY");
        SpotifyService spotify = api.getService();
//        spotify.getAlbum("2dIGnmEIy1WZIcZCFSj6i8", new Callback<Album>() {
//
//            @Override
//            public void success(Album album, Response response) {
//                Log.d("Album success", album.name);
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                Log.d("Album failure", error.toString());
//            }
//        });




        rowItems = new ArrayList<Card>();

        //add new Card item
        Card item;
        item = new Card("Curtis Mayfield", "Superfly", "https://i.scdn.co/image/755a2683937d13f338c1aa09284db25ff50e9b70", "https://p.scdn.co/mp3-preview/4ab4720efd311ee87a1fafe4ed7f65605addd8cc?cid=774b29d4f13844c495f206cafdad9c86");
        rowItems.add(item);
        item = new Card("UMO", "Can't Keep Checking My Phone", "https://i.scdn.co/image/879df86e1d1c7652be108979817c5ec60025cf07", "https://p.scdn.co/mp3-preview/9e9c97ac933fe93e2ebb145167944c9223872c71?cid=774b29d4f13844c495f206cafdad9c86");
        rowItems.add(item);
        item = new Card("Selda Bagcan", "Ince Ince", "https://i.scdn.co/image/c06b3625deb852d3ef626c8675374c15d60b446e", "https://p.scdn.co/mp3-preview/5d4526279529c64246cf8f76810e3602fb07ee61?cid=774b29d4f13844c495f206cafdad9c86");
        rowItems.add(item);
        item = new Card("Eminem", "Without Me","https://i.scdn.co/image/d6aebc8455b303340e188c20fd4f562a2ab980e0", "https://p.scdn.co/mp3-preview/c2b67567f040b2c924aed143ba21748b7ce092f6?cid=774b29d4f13844c495f206cafdad9c86");
        rowItems.add(item);
        item = new Card("Steve Watson", "Born to Boogie", "https://i.scdn.co/image/a501f65666e035306dcbb1411ae855270f1acbd7","https://p.scdn.co/mp3-preview/4819fcee8a3258b7a47d9d8d9eb328ddb7e89971?cid=774b29d4f13844c495f206cafdad9c86");
        rowItems.add(item);

        arrayAdapter = new CardArrayAdapter(this, R.layout.item, rowItems);
        //CardArrayAdapter.notifyDataSetChanged();

        //---------------------------------------------
        //Swipe Card controls
        flingContainer = (SwipeFlingAdapterView) findViewById(R.id.frame);
        flingContainer.setAdapter(arrayAdapter);
        flingContainer.setFlingListener(new SwipeFlingAdapterView.onFlingListener() {
            @Override
            public void removeFirstObjectInAdapter() {
                // this is the simplest way to delete an object from the Adapter (/AdapterView)
                Log.d("LIST", "removed object!");
                rowItems.remove(0);
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onLeftCardExit(Object dataObject) {
                //Do something on the left!
                //You also have access to the original object.
                //If you want to use it just cast it (String) dataObject
                Toast.makeText(MainActivity.this, "Dislike", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRightCardExit(Object dataObject) {
                Toast.makeText(MainActivity.this, "Like", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdapterAboutToEmpty(int itemsInAdapter) {
                // Ask for more data here
            }

            @Override
            public void onScroll(float scrollProgressPercent) {

            }
        });


//        // Optionally add an OnItemClickListener
//        flingContainer.setOnItemClickListener(new SwipeFlingAdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClicked(int itemPosition, Object dataObject) {
//                Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
//            }
//        });

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
    }

    @Override
    protected void onStart() {
        super.onStart();
        // We will start writing our code here.

        // Set the connection parameters
        ConnectionParams connectionParams =
                new ConnectionParams.Builder(CLIENT_ID)
                        .setRedirectUri(REDIRECT_URI)
                        .showAuthView(true)
                        .build();

        SpotifyAppRemote.connect(this, connectionParams,
                new Connector.ConnectionListener() {

                    @Override
                    public void onConnected(SpotifyAppRemote spotifyAppRemote) {
                        mSpotifyAppRemote = spotifyAppRemote;
                        Log.d("MainActivity", "Connected! Yay!");
                        Toast.makeText(MainActivity.this, "login success", Toast.LENGTH_SHORT).show();
                        // Now you can start interacting with App Remote
                        connected();
                    }

                    @Override
                    public void onFailure(Throwable throwable) {
                        Log.e("MainActivity", throwable.getMessage(), throwable);
                        Toast.makeText(MainActivity.this, "login failure", Toast.LENGTH_SHORT).show();

                        // Something went wrong when attempting to connect! Handle errors here
                    }
                });
    }

    @Override
    protected void onStop() {
        super.onStop();
        SpotifyAppRemote.disconnect(mSpotifyAppRemote);
        // Aaand we will finish off here.
    }

    private void connected() {
        // Play a playlist
        mSpotifyAppRemote.getPlayerApi().play("spotify:user:spotify:playlist:37i9dQZF1DX2sUQwD7tbmL");

        // Subscribe to PlayerState
        mSpotifyAppRemote.getPlayerApi()
                .subscribeToPlayerState()
                .setEventCallback(new Subscription.EventCallback<PlayerState>() {

                    public void onEvent(PlayerState playerState) {
                        final Track track = playerState.track;
                        if (track != null) {
                            Log.d("MainActivity", track.name + " by " + track.artist.name);
                        }
                    }
                });
    }


//    @OnClick(R.id.right)
//    public void right() {
//        /**
//         * Trigger the right event manually.
//         */
//        flingContainer.getTopCardListener().selectRight();
//    }
//
//    @OnClick(R.id.left)
//    public void left() {
//        flingContainer.getTopCardListener().selectLeft();
//    }
}
