package com.example.android.undhymn;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistActivity extends Activity {

    /* Identifier for TrackAdapter to accurately display artist list item */
    private static final int IDENTIFIER = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Find the id page_title from activity_songs.xml and set text
        TextView pageTitle = findViewById(R.id.page_title);
        pageTitle.setText("Artist");

        // Find the shuffle button from activity_song.xml and set visibility to GONE
        Button shuffleButton = findViewById(R.id.shuffle_button);
        shuffleButton.setVisibility(View.GONE);

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

        ListView listView = findViewById(R.id.songs_list);
        TrackAdapter trackAdapter = new TrackAdapter(this, artistDetail, IDENTIFIER);
        listView.setAdapter(trackAdapter);
    }
}
