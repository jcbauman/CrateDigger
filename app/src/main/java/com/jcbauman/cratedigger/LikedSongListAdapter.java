package com.jcbauman.cratedigger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.master.glideimageview.GlideImageView;

import java.util.ArrayList;
import java.util.List;


public class LikedSongListAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<SongObject> songList;

    public LikedSongListAdapter(Context context, int layout, ArrayList<SongObject> songList) {
        this.context = context;
        this.layout = layout;
        this.songList = songList;
    }

    @Override
    public int getCount() {
        return songList.size();
    }

    @Override
    public Object getItem(int position) {
        return songList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder{
        GlideImageView albumArt;
        TextView songText;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View row = view;
        ViewHolder holder = new ViewHolder();

        if(row == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout, null);

            holder.songText = (TextView) row.findViewById(R.id.songTitle);
            holder.albumArt = (GlideImageView) row.findViewById(R.id.albumArt);
            row.setTag(holder);

        }
        else{
            holder = (ViewHolder) row.getTag();
        }
        SongObject songo = songList.get(position);
        holder.songText.setText(songo.getSongName() + " by " + songo.getSongArtist());

        holder.albumArt.loadImageUrl(songo.getSongImageURL());
        return row;
    }
}
