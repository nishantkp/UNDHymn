package com.example.android.undhymn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the action bar elevation to 0dp
        getSupportActionBar().setElevation(0);

        // Find TextView with id main_songs_activity_link
        TextView songsTextView = findViewById(R.id.main_songs_activity_link);
        // Attach a listener to  textView to listen to any touch event
        songsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * When user clicks the Songs, then start a new intent to navigate
                 * to {@link SongsActivity}
                 */
                Intent intent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });

        // Find TestView with id main_playlist_activity_link
        TextView playlistTextView = findViewById(R.id.main_playlist_activity_link);
        // Attach a listener to  textView to listen to any touch event
        playlistTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * When user clicks the Playlist, then start a new intent to navigate
                 * to {@link PlaylistActivity}
                 */
                Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });

        // Find TextView with id main_album_activity_link
        TextView albumTextView = findViewById(R.id.main_album_activity_link);
        // Attach a listener to  textView to listen to any touch event
        albumTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * When user clicks the Playlist, then start a new intent to navigate
                 * to {@link AlbumActivity}
                 */
                Intent intent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(intent);
            }
        });

        // Find TextView with id main_artist_activity_link
        TextView artistTextView = findViewById(R.id.main_artist_activity_link);
        // Attach a listener to  textView to listen to any touch event
        artistTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * When user clicks the Artist, then start a new intent to navigate
                 * to {@link ArtistActivity}
                 */
                Intent intent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(intent);
            }
        });

        // FInd the button with id play_button_main_activity
        Button playSong = findViewById(R.id.play_button_main_activity);
        // Attach a listener to button to listen for any touch event
        playSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * When user clicks the Play button, then start a new intent to navigate
                 * to {@link PlayingSongActivity}
                 */
                Intent intent = new Intent(MainActivity.this, PlayingSongActivity.class);
                startActivity(intent);
            }
        });
    }
}