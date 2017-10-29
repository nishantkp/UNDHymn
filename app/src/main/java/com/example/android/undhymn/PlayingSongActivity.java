package com.example.android.undhymn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayingSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_song);

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
    }
}
