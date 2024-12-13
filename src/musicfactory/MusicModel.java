/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicfactory;

import java.time.LocalDate;

/**
 *
 * @author chick
 */
public class MusicModel {
    private int songId;
    private String songTitle;
    private String artist;
    private int view;
    private String genre;  // New field for genre
    private LocalDate releaseDate; // New field for release date

    // Constructor with new fields
    public MusicModel(int songId, String songTitle, String artist, int view, String genre, LocalDate releaseDate) {
        this.songId = songId;
        this.songTitle = songTitle;
        this.artist = artist;
        this.view = view;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    // Getter and Setter methods
    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public String getGenre() { // Getter for genre
        return genre;
    }

    public void setGenre(String genre) { // Setter for genre
        this.genre = genre;
    }

    public LocalDate getReleaseDate() { // Getter for release date
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) { // Setter for release date
        this.releaseDate = releaseDate;
    }


    
}
