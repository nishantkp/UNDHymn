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
        trackDetails.add(new TrackDetail("My Passion","My Passion", "Akcent", R.drawable.akcent_my_passion));
        trackDetails.add(new TrackDetail("Stories","The Nights", "Avicii", R.drawable.avicii_nights_artwork));
        trackDetails.add(new TrackDetail("Blue Swede","Hooked Ona Feeling", "Blue Swede", R.drawable.hooked_on_a_feeling));
        trackDetails.add(new TrackDetail("Combat Rock","Should I Stay Or Should I Go", "The Clash", R.drawable.the_clash_should_i_stay_or_should_i_go));
        trackDetails.add(new TrackDetail("This Album Does Not Exist","Sweet Disaster", "Dreamer", R.drawable.sweet_disaster));
        trackDetails.add(new TrackDetail("Recovery","Not Afraid", "Eminem", R.drawable.eminem_not_afraid));
        trackDetails.add(new TrackDetail("3","Hall Of Fame", "The Script", R.drawable.hall_of_fame));
        trackDetails.add(new TrackDetail("x","Photograph", "Ed Sheeran", R.drawable.sweet_disaster));

        GridView gridView = findViewById(R.id.grid_view_album);

        GridAlbumAdapter gridAlbumAdapter = new GridAlbumAdapter(this, trackDetails);
        gridView.setAdapter(gridAlbumAdapter);
    }
}
