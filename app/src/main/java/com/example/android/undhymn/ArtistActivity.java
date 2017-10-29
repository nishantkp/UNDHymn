package com.example.android.undhymn;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        // Create an arrayList of an object TrackDetail
        ArrayList<TrackDetail> artistDetail = new ArrayList<>();
        // Add details about artist in ArrayList
        artistDetail.add(new TrackDetail("Akcent", R.drawable.artist_placeholder));
        artistDetail.add(new TrackDetail( "Avicii", R.drawable.artist_placeholder));
        artistDetail.add(new TrackDetail( "Blue Swede", R.drawable.artist_placeholder));
        artistDetail.add(new TrackDetail( "The Clash", R.drawable.artist_placeholder));
        artistDetail.add(new TrackDetail( "Dreamer", R.drawable.artist_placeholder));
        artistDetail.add(new TrackDetail( "Eminem", R.drawable.artist_placeholder));
        artistDetail.add(new TrackDetail( "The Script", R.drawable.artist_placeholder));
        artistDetail.add(new TrackDetail( "Ed Sheeran", R.drawable.artist_placeholder));
        artistDetail.add(new TrackDetail( "Marshmello", R.drawable.artist_placeholder));
        artistDetail.add(new TrackDetail( "Zyan Feat. Sia", R.drawable.artist_placeholder));

        ListView listView = findViewById(R.id.artist_list);
        ArtistAdapter artistAdapter = new ArtistAdapter(this, artistDetail);
        listView.setAdapter(artistAdapter);
    }
}
