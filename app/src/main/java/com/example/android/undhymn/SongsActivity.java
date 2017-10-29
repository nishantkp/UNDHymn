package com.example.android.undhymn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    private ArrayList<TrackDetail> trackDetails;
    private static final int IDENTIFIER = 1;

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
        trackDetails.add(new TrackDetail("My Passion", "Akcent", R.drawable.akcent_my_passion));
        trackDetails.add(new TrackDetail("The Nights", "Avicii", R.drawable.avicii_nights_artwork));
        trackDetails.add(new TrackDetail("Hooked Ona Feeling", "Blue Swede", R.drawable.hooked_on_a_feeling));
        trackDetails.add(new TrackDetail("Should I Stay Or Should I Go", "The Clash", R.drawable.the_clash_should_i_stay_or_should_i_go));
        trackDetails.add(new TrackDetail("Sweet Disaster", "Dreamer", R.drawable.sweet_disaster));
        trackDetails.add(new TrackDetail("Not Afraid", "Eminem", R.drawable.eminem_not_afraid));
        trackDetails.add(new TrackDetail("Hall Of Fame", "The Script", R.drawable.hall_of_fame));
        trackDetails.add(new TrackDetail("Photograph", "Ed Sheeran", R.drawable.ed_sheeran_photograph));
        trackDetails.add(new TrackDetail("Alone", "Marshmello", R.drawable.alone));
        trackDetails.add(new TrackDetail("Dusk Till Dawn", "Zyan Feat. Sia", R.drawable.dusk_till_dawn_zayn_malik));

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
                TrackDetail track = trackDetails.get(position);

                /**
                 * Create a Bundle and put all the track related data
                 * into Bundle in (key, value) pair */
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
