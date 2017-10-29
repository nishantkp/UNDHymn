package com.example.android.undhymn;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends Activity {

    /* Identifier for TrackAdapter to accurately display artist list item */
    private static final int IDENTIFIER = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        // Create an arrayList of an object TrackDetail
        ArrayList<TrackDetail> artistDetail = new ArrayList<>();
        // Add details about artist in ArrayList
        artistDetail.add(new TrackDetail("Akcent", R.drawable.akcent_artist));
        artistDetail.add(new TrackDetail("Avicii", R.drawable.avicii_artist));
        artistDetail.add(new TrackDetail("Blue Swede", R.drawable.blue_swede_artist));
        artistDetail.add(new TrackDetail("The Clash", R.drawable.the_clash_artist));
        artistDetail.add(new TrackDetail("Dreamer", R.drawable.artist_placeholder));
        artistDetail.add(new TrackDetail("Eminem", R.drawable.eminem_not_afraid));
        artistDetail.add(new TrackDetail("The Script", R.drawable.the_script_artist));
        artistDetail.add(new TrackDetail("Ed Sheeran", R.drawable.ed_sheeran_artist));
        artistDetail.add(new TrackDetail("Marshmello", R.drawable.marshmellow_dj));
        artistDetail.add(new TrackDetail("Zyan Feat. Sia", R.drawable.zyan_artist));

        ListView listView = findViewById(R.id.artist_list);
        TrackAdapter trackAdapter = new TrackAdapter(this, artistDetail, IDENTIFIER);
        listView.setAdapter(trackAdapter);
    }
}
