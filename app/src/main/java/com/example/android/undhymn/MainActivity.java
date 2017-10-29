package com.example.android.undhymn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find textView with id main_songs_activity_link
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

        // Find textView with id main_playlist_activity_link
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

        // Find textView with id main_album_activity_link
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
    }
}
