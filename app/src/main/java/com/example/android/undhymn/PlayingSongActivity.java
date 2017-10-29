package com.example.android.undhymn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayingSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_song);

        // Set the action bar elevation to 0dp
        getSupportActionBar().setElevation(0);

        // Receive the intent send by {@link SongsActivity}
        Intent intent = getIntent();
        // Get name of the song with key "song_name"
        String songName = intent.getStringExtra("song_name");
        // Get the name of artist with key "artist_name"
        String artistName = intent.getStringExtra("artist_name");
        // Get the resource id of album cover with key "album_cover"
        int albumCover = intent.getIntExtra("album_cover", R.drawable.album_placeholder);

        // Find the ImageView with ID playing_song_album_cover and set the album cover for that song
        ImageView albumCoverImageView = findViewById(R.id.playing_song_album_cover);
        albumCoverImageView.setImageResource(albumCover);

        // Find the TextView with ID playing_song_name and set text with name of the song
        TextView songNameTextView = findViewById(R.id.playing_song_name);
        songNameTextView.setText(songName);

        // Find the TextView with ID playing_song_artist_name and set text with name of the artist
        // for that song
        TextView artistNameTextView = findViewById(R.id.playing_song_artist_name);
        artistNameTextView.setText(artistName);

        /** Find a TextView with ID back_to_song_list in order to going back to list of
         * when user clicks on the button
         */
        Button backToSongList = findViewById(R.id.back_to_song_list);
        // Attach a listener to button
        backToSongList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * Start a new intent to go to {@link SongsActivity}
                 * */
                Intent intent = new Intent(PlayingSongActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });
    }

}
