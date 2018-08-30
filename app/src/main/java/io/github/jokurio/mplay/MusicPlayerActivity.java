package io.github.jokurio.mplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MusicPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
        TextView homePage = findViewById(R.id.song_home);
        homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homePageIntent = new Intent(MusicPlayerActivity.this, MainActivity.class);
                startActivity(homePageIntent);
            }
        });
        TextView songList = findViewById(R.id.song_list);
        songList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songListIntent = new Intent(MusicPlayerActivity.this, SongsActivity.class);
                startActivity(songListIntent);
            }
        });
    }
}
