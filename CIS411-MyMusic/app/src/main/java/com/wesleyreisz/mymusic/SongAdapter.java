package com.wesleyreisz.mymusic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.wesleyreisz.mymusic.model.Song;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by LilTyrant on 10/19/2015.
 */
public class SongAdapter extends ArrayAdapter<Song> {

    private SimpleDateFormat df = new SimpleDateFormat("MMM d, yyy (EEE)");
    private Context leContext;

    private List<Song> listSongs;

    //found this on the internet, see if it works.
    public SongAdapter(Context context, int textViewResourceId, List<Song> entries) {
        super(context, textViewResourceId, entries);

        leContext = context;
        listSongs = entries;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if(view==null){
            LayoutInflater inflater = (LayoutInflater)leContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.listview_song,parent,false);
        }

        final Song song = listSongs.get(position);

        TextView textViewTitle = (TextView)view.findViewById(R.id.textViewSongTitle);
        textViewTitle.setText(song.getSongTitle() + " (" + song.getArtistName() + ")");

        TextView textViewAlbum = (TextView)view.findViewById(R.id.textViewSongArtist);
        textViewAlbum.setText(song.getAlbumTitle());

        /*check formatting here*/

        TextView textViewPublishedDate = (TextView)view.findViewById(R.id.textViewSongDate);
        textViewPublishedDate.setText(df.format(song.getSongPublishedDate()));

        return view;
    }
}