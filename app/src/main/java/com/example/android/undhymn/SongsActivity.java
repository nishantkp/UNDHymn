package com.example.android.undhymn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Create an arrayList of an object TrackDetail
        ArrayList<TrackDetail> trackDetails = new ArrayList<>();
        // Add details about songs in ArrayList
        trackDetails.add(new TrackDetail("My Passion", "Akcent", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("The Nights", "Avicii", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("Hooked Ona Feeling", "Blue Swede", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("Should I Stay Or Should I Go", "The Clash", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("Sweet Disaster", "Dreamer", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("Not Afraid", "Eminem", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("Hall Of Fame", "The Script", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("Photograph", "Ed Sheeran", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("Alone", "Marshmello", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("Dusk Till Dawn", "Zyan Feat. Sia", R.drawable.album_placeholder));
    }
}
