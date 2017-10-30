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

        // Set the action bar elevation to 0dp
        getSupportActionBar().setElevation(0);

        // Create an arrayList of an object TrackDetail
        ArrayList<TrackDetail> trackDetails = new ArrayList<>();
        // Add details about songs in ArrayList
        trackDetails.add(new TrackDetail(getString(R.string.song_1_album)
                ,getString(R.string.song_1_name)
                , getString(R.string.song_1_artist)
                , R.drawable.akcent_my_passion));
        trackDetails.add(new TrackDetail(getString(R.string.song_2_album)
                ,getString(R.string.song_2_name)
                , getString(R.string.song_2_artist)
                , R.drawable.avicii_nights_artwork));
        trackDetails.add(new TrackDetail(getString(R.string.song_3_album)
                ,getString(R.string.song_3_name)
                , getString(R.string.song_3_artist)
                , R.drawable.hooked_on_a_feeling));
        trackDetails.add(new TrackDetail(getString(R.string.song_4_album)
                ,getString(R.string.song_4_name)
                , getString(R.string.song_4_artist)
                , R.drawable.the_clash_should_i_stay_or_should_i_go));
        trackDetails.add(new TrackDetail(getString(R.string.song_5_album)
                ,getString(R.string.song_5_name)
                , getString(R.string.song_5_artist)
                , R.drawable.sweet_disaster));
        trackDetails.add(new TrackDetail(getString(R.string.song_6_album)
                ,getString(R.string.song_6_name)
                , getString(R.string.song_6_artist)
                , R.drawable.eminem_not_afraid));
        trackDetails.add(new TrackDetail(getString(R.string.song_7_album)
                ,getString(R.string.song_7_name)
                , getString(R.string.song_7_artist)
                , R.drawable.hall_of_fame));
        trackDetails.add(new TrackDetail(getString(R.string.song_8_album)
                ,getString(R.string.song_8_name)
                , getString(R.string.song_8_artist)
                , R.drawable.sweet_disaster));

        GridView gridView = findViewById(R.id.grid_view_album);/**/
        GridAlbumAdapter gridAlbumAdapter = new GridAlbumAdapter(this, trackDetails);
        gridView.setAdapter(gridAlbumAdapter);
    }
}
