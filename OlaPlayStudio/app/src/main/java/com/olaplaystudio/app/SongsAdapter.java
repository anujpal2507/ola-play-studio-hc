package com.olaplaystudio.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.olaplaystudio.R;
import com.olaplaystudio.databases.SongsDTO;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by anujkumar on 17/12/17.
 */

public class SongsAdapter extends BaseAdapter {

    Context context;
    List<SongsDTO> songsDTOList;

    public SongsAdapter(Context context, List<SongsDTO> songsDTOList) {
        this.context = context;
        this.songsDTOList = songsDTOList;
    }

    @Override
    public int getCount() {
        return songsDTOList.size();
    }

    @Override
    public SongsDTO getItem(int i) {
        return songsDTOList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
//        SongsDTO songsDTO = getItem(i);
        SongsDTO songsDTO = getItem(0);
        ViewHolder viewHolder = null;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.songPlayButton = (ImageButton) view.findViewById(R.id.song_play_button);
            viewHolder.songTitleView = (TextView) view.findViewById(R.id.song_title);
            viewHolder.songArtistsView = (TextView) view.findViewById(R.id.song_artists);
            viewHolder.songDownloadProgressBar = (ProgressBar) view.findViewById(R.id.download_progress);
            viewHolder.moreActionButton = (ImageView) view.findViewById(R.id.more_action_button);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.songPlayButton.setBackgroundResource( R.drawable.afreen);
        viewHolder.songTitleView.setText(songsDTO.getSongTitle());
        viewHolder.songArtistsView.setText(songsDTO.getArtistsName());
        return view;
    }

    class ViewHolder {
        ImageButton songPlayButton;
        TextView songTitleView;
        TextView songArtistsView;
        ProgressBar songDownloadProgressBar;
        ImageView moreActionButton;
    }
}
