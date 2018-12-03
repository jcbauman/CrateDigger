package com.jcbauman.cratedigger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.master.glideimageview.GlideImageView;

import java.util.List;

public class CardArrayAdapter extends ArrayAdapter<SongObject>
{
    Context context;

    public CardArrayAdapter(Context context, int id, List<SongObject> items)
    {
        super(context, id, items);
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        SongObject song_item = getItem(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        TextView songName = (TextView) convertView.findViewById(R.id.songName);
        GlideImageView albulmArt = (GlideImageView) convertView.findViewById(R.id.image);

        songName.setText(song_item.getSongName());
        albulmArt.loadImageUrl(song_item.getSongImageURL());

        return convertView;
    }
}
