package io.github.jokurio.mplay;

/**
 * {@link Songs} represents a song the user wants to play.
 * It contains song title, artist,album and genre.
 */

public class Songs {
    private String mSongTitle;
    private String mArtist;
    private String mAlbum;
    private String mGenre;

    public Songs(String SongTitle, String Artist, String Album, String Genre) {
        mSongTitle = SongTitle;
        mArtist = Artist;
        mAlbum = Album;
        mGenre = Genre;
    }

    public String getSongTitle() {
        return mSongTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public String getGenre() {
        return mGenre;
    }
}
