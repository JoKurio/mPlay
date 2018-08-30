package io.github.jokurio.mplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        TextView homePage = findViewById(R.id.song_home);
        homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homePageIntent = new Intent(SongsActivity.this, MainActivity.class);
                startActivity(homePageIntent);
            }
        });
        TextView songPlayer = findViewById(R.id.song_player);
        songPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songPlayerIntent = new Intent(SongsActivity.this, MusicPlayerActivity.class);
                startActivity(songPlayerIntent);
            }
        });
        //create a list of songs
        ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("Bohemian Rhapsody", "Queen", "Hits", "Rock"));
        songs.add(new Songs("I don't wanna miss a thing", "Aerosmith", "Armageddon", "Rock"));
        songs.add(new Songs("Cryin'", "Aerosmith", "Get a Grip", "Rock"));
        songs.add(new Songs("Welcome to the jungle", "Guns N Roses", "Appetite For Destruction", "Rock"));
        songs.add(new Songs("Rebel Yell", "Billy Idol", "Rebel Yell", "Rock"));
        songs.add(new Songs("Smells like teen spirit", "Nirvana", "Nevermind", "Rock"));
        songs.add(new Songs("This mess we're in", "Thom Yorke", "Stories from the city..", "Pop Rock"));
        songs.add(new Songs("Jah seh no", "Peter Tosh", "Mystic Man", "Reggae"));
        songs.add(new Songs("Drops of Jupiter", "Train", "Drops of Jupiter", "Rock"));
        songs.add(new Songs("Off the wall", "Michael Jackson", "Off the wall", "Pop"));
        songs.add(new Songs("Sign your name", "Terence Trent O'Darby", "Greasy Chicken", "Soul"));
        songs.add(new Songs("Miss Sarajevo", "U2", "Collection", "Rock/Opera"));
        songs.add(new Songs("Move On", "ABBA", "Arrival", "Pop"));
        songs.add(new Songs("While my guitar gently weeps", "Beatles", "1967-1970", "Rock"));
        songs.add(new Songs("Hey Jude", "Beatles", "Collection", "Rock"));
        songs.add(new Songs("Eleanor Rigby", "Beatles", "Revolver", "Rock"));
        songs.add(new Songs("We're all alone", "Rita Coolidge", "Anytime...Anywhere", "Blues"));
        songs.add(new Songs("American Pie", "Don McLean", "American Pie", "Pop Rock"));
        songs.add(new Songs("Take A Bow", "Madonna", "Bedtime Stories", "Pop"));
        SongsAdapter adapter = new SongsAdapter(this, songs);
        ListView listView = findViewById(R.id.song_list);
        listView.setAdapter(adapter);

    }

}
