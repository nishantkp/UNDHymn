package com.example.android.undhymn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
}