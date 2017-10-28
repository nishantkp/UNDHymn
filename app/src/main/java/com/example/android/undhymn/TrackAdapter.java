package com.example.android.undhymn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nishant on 10/28/2017.
 */

public class TrackAdapter extends ArrayAdapter<TrackDetail> {

    /* Context of App */
    private Context mContext;

    public TrackAdapter(@NonNull Context context, @NonNull List<TrackDetail> trackList) {
        super(context, 0, trackList);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView = convertView;
        if(listView == null){
            listView = LayoutInflater.from(mContext)
                    .inflate(R.layout.song_list_item, parent, false);
        }

        // Get the current track
        TrackDetail currentTrack = getItem(position);

        // Find the textView for track name from song_list_item.xml and set the text
        TextView trackNameTextView = listView.findViewById(R.id.song_list_item_track_name);
        trackNameTextView.setText(currentTrack.getSongName().toString());

        // Find the textView for track artist name from song_list_item.xml and set the text
        TextView trackArtistTextView = listView.findViewById(R.id.song_list_item_track_artist);
        trackArtistTextView.setText(currentTrack.getArtistName().toString());

        // Find the imageView for album art from song_list_item.xml and set the image
        ImageView albumArt = listView.findViewById(R.id.song_list_item_track_album_art);
        albumArt.setImageResource(currentTrack.getAlbumArt());

        return listView;
    }
}