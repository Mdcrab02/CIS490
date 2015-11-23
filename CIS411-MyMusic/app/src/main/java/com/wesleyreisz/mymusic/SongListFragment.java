package com.wesleyreisz.mymusic;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by LilTyrant on 10/19/2015.
 */
public class SongListFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.listview_frag,container,false);
        /*not sure if this was supposed to be added specifically as a fragment?*/
        //guess not
    }
}