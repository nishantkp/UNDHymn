package com.example.android.undhymn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    /* Identifier for TrackAdapter to accurately display artist list item */
    private static final int IDENTIFIER = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Set the action bar elevation to 0dp
        getSupportActionBar().setElevation(0);
        View header = View.inflate(this, R.layout.header_artist_list_view, null);

        // Find the button with id artist_activity_header_shuffle_button in header_artist_list_view.xml
        // Attach a listener to button
        Button shuffleButton = header.findViewById(R.id.artist_activity_header_shuffle_button);
        shuffleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * When user clicks on shuffle button start activity to {@link PlayingSongActivity}
                 * in order to play songs by random artist
                 */
                Intent intent = new Intent(ArtistActivity.this, PlayingSongActivity.class);
                startActivity(intent);
            }
        });

        // Create an arrayList of an object TrackDetail
        ArrayList<TrackDetail> artistDetail = new ArrayList<>();
        // Add details about artist in ArrayList
        artistDetail.add(new TrackDetail(getString(R.string.song_1_artist)
                , R.drawable.akcent_artist));
        artistDetail.add(new TrackDetail(getString(R.string.song_2_artist)
                , R.drawable.avicii_artist));
        artistDetail.add(new TrackDetail(getString(R.string.song_3_artist)
                , R.drawable.blue_swede_artist));
        artistDetail.add(new TrackDetail(getString(R.string.song_4_artist)
                , R.drawable.the_clash_artist));
        artistDetail.add(new TrackDetail(getString(R.string.song_5_artist)
                , R.drawable.artist_placeholder));
        artistDetail.add(new TrackDetail(getString(R.string.song_6_artist
        )
                , R.drawable.eminem_not_afraid));
        artistDetail.add(new TrackDetail(getString(R.string.song_7_artist)
                , R.drawable.the_script_artist));
        artistDetail.add(new TrackDetail(getString(R.string.song_8_artist)
                , R.drawable.ed_sheeran_artist));
        artistDetail.add(new TrackDetail(getString(R.string.song_9_artist)
                , R.drawable.marshmellow_dj));
        artistDetail.add(new TrackDetail(getString(R.string.song_10_artist)
                , R.drawable.zyan_artist));

        ListView listView = findViewById(R.id.songs_list);
        // Attach a header to ListView
        listView.addHeaderView(header);
        TrackAdapter trackAdapter = new TrackAdapter(this, artistDetail, IDENTIFIER);
        listView.setAdapter(trackAdapter);
    }

    /***
     * Implement functionality of starting a new intent for going back to
     * {@link MainActivity} when user clicks the back button in action bar
     * in order to avoid looping problem
     */
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ArtistActivity.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
    }
}