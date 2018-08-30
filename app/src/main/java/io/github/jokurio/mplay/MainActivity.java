package io.github.jokurio.mplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView song_info = findViewById(R.id.song_info);
        song_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songInfoIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songInfoIntent);
            }
        });
        TextView musicPlayer = findViewById(R.id.music_player);
        musicPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicPlayerIntent = new Intent(MainActivity.this, MusicPlayerActivity.class);
                startActivity(musicPlayerIntent);
            }
        });


    }
}



