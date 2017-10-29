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

public class ArtistAdapter extends ArrayAdapter<TrackDetail> {

    /* Context of App */
    private Context mContext;

    public ArtistAdapter(@NonNull Context context, @NonNull List<TrackDetail> artistDetail) {
        super(context, 0, artistDetail);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(mContext)
                    .inflate(R.layout.artist_list_item, parent, false);
        }

        // Get the current list item
        TrackDetail currentItem = getItem(position);

        // Find the id for artist photo ImageView in artist_list_item.xml and set the image
        ImageView artistPhoto = listItemView.findViewById(R.id.artist_list_item_image);
        artistPhoto.setImageResource(currentItem.getArtistPhoto());

        // Find the id for artist name TextView in artist_list_item.xml and set the name of artist
        TextView artistName = listItemView.findViewById(R.id.artist_list_item_name);
        artistName.setText(currentItem.getArtistName().toString());

        return listItemView;
    }
}
