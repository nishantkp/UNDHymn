package com.example.android.undhymn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        // Create an arrayList of an object TrackDetail
        ArrayList<TrackDetail> trackDetails = new ArrayList<>();
        // Add details about songs in ArrayList
        trackDetails.add(new TrackDetail("My Passion","My Passion", "Akcent", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("Stories","The Nights", "Avicii", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("Blue Swede","Hooked Ona Feeling", "Blue Swede", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("Combat Rock","Should I Stay Or Should I Go", "The Clash", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("This Album Does Not Exist","Sweet Disaster", "Dreamer", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("Recovery","Not Afraid", "Eminem", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("3","Hall Of Fame", "The Script", R.drawable.album_placeholder));
        trackDetails.add(new TrackDetail("x","Photograph", "Ed Sheeran", R.drawable.album_placeholder));

        GridView gridView = findViewById(R.id.grid_view_album);

        GridAlbumAdapter gridAlbumAdapter = new GridAlbumAdapter(this, trackDetails);
        gridView.setAdapter(gridAlbumAdapter);
    }
}
