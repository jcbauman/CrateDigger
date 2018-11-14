package com.example.rocko.cratedigger;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.master.glideimageview.GlideImageView;

import java.io.IOException;
import java.util.List;

public class CardArrayAdapter extends ArrayAdapter<Card> {

    Context context;

    public CardArrayAdapter(Context context, int id, List<Card> items){
        super(context, id, items);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        Card card_item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        TextView songName = (TextView) convertView.findViewById(R.id.songName);
        GlideImageView albumArt = (GlideImageView) convertView.findViewById(R.id.image);

        songName.setText(card_item.getName());
        //albumArt.setImageResource(R.drawable.superfly);
        //Glide.with(getContext()).load(card_item).into(albumArt);
        albumArt.loadImageUrl(card_item.getImageURL());

        return convertView;
    }
}
