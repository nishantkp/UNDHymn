package com.example.android.undhymn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    private static final int IDENTIFIER = 1;
    private ArrayList<TrackDetail> trackDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Set the action bar elevation to 0dp
        getSupportActionBar().setElevation(0);

        View header = View.inflate(this, R.layout.header_songs_list_view, null);

        // Create an arrayList of an object TrackDetail
        trackDetails = new ArrayList<>();
        // Add details about songs in ArrayList
        trackDetails.add(new TrackDetail(getString(R.string.song_1_name)
                , getString(R.string.song_1_artist)
                , R.drawable.akcent_my_passion));
        trackDetails.add(new TrackDetail(getString(R.string.song_2_name)
                , getString(R.string.song_2_artist)
                , R.drawable.avicii_nights_artwork));
        trackDetails.add(new TrackDetail(getString(R.string.song_3_name)
                , getString(R.string.song_3_artist)
                , R.drawable.hooked_on_a_feeling));
        trackDetails.add(new TrackDetail(getString(R.string.song_4_name)
                , getString(R.string.song_4_artist)
                , R.drawable.the_clash_should_i_stay_or_should_i_go));
        trackDetails.add(new TrackDetail(getString(R.string.song_5_name)
                , getString(R.string.song_5_artist)
                , R.drawable.sweet_disaster));
        trackDetails.add(new TrackDetail(getString(R.string.song_6_name)
                , getString(R.string.song_6_artist)
                , R.drawable.eminem_not_afraid));
        trackDetails.add(new TrackDetail(getString(R.string.song_7_name)
                , getString(R.string.song_7_artist)
                , R.drawable.hall_of_fame));
        trackDetails.add(new TrackDetail(getString(R.string.song_8_name)
                , getString(R.string.song_8_artist)
                , R.drawable.ed_sheeran_photograph));
        trackDetails.add(new TrackDetail(getString(R.string.song_9_name)
                , getString(R.string.song_9_artist)
                , R.drawable.alone));
        trackDetails.add(new TrackDetail(getString(R.string.song_10_name)
                , getString(R.string.song_10_artist)
                , R.drawable.dusk_till_dawn_zayn_malik));

        ListView listView = findViewById(R.id.songs_list);
        // Attach a header to ListView
        listView.addHeaderView(header);
        TrackAdapter trackAdapter = new TrackAdapter(this, trackDetails, IDENTIFIER);
        listView.setAdapter(trackAdapter);

        // Attach listener on list item view to play a song when clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Create a new Intent to {@link PlayingSongActivity}
                Intent intent = new Intent(SongsActivity.this, PlayingSongActivity.class);

                // Get the detail of song at which user has clicked
                TrackDetail track = trackDetails.get(position - 1);

                /**
                 * Create a Bundle and put all the track related data
                 * into Bundle in (key, value) pair
                 * */
                Bundle bundle = new Bundle();
                bundle.putString("song_name", track.getSongName());
                bundle.putString("artist_name", track.getArtistName());
                bundle.putInt("album_cover", track.getAlbumArt());

                // Send bundle through Intent
                intent.putExtras(bundle);
                // Start activity
                startActivity(intent);
            }
        });

    }

    /***
     * Implement functionality of starting a new intent for going back to
     * {@link MainActivity} when user clicks the back button in action bar
     */
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SongsActivity.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
    }
}
