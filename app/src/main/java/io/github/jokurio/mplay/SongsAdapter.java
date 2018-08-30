package io.github.jokurio.mplay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {
    SongsAdapter(Context context, ArrayList<Songs> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Songs currentSong = getItem(position);
        TextView songTitleView = listItemView.findViewById(R.id.song_title);
        songTitleView.setText(currentSong.getSongTitle());
        TextView artistNameView = listItemView.findViewById(R.id.artist_name);
        artistNameView.setText(currentSong.getArtist());
        TextView albumNameView = listItemView.findViewById(R.id.album_name);
        albumNameView.setText(currentSong.getAlbum());
        TextView songTypeView = listItemView.findViewById(R.id.song_type);
        songTypeView.setText(currentSong.getGenre());
        return listItemView;
    }
}
