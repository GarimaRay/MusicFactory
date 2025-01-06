/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.musicapp.model;

import java.time.LocalDate;

/**
 *
  * @author 23048613 Garima Ray
 */
public class MusicModel {
    private int songId;
    private String songTitle;
    private String artist;
    private int view;
    private String genre;  // New field for genre
    private LocalDate releaseDate; // New field for release date
    private String country; // New field for country
    private String album; // New field for album
    private int trackTotal; // New field for total tracks

    // Constructor with new fields
    public MusicModel(int songId, String songTitle, String artist, int view, String genre, LocalDate releaseDate, String country, String album, int trackTotal) {
        this.songId = songId;
        this.songTitle = songTitle;
        this.artist = artist;
        this.view = view;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.country = country;
        this.album = album;
        this.trackTotal = trackTotal;
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

    public String getCountry() { // Getter for country
        return country;
    }

    public void setCountry(String country) { // Setter for country
        this.country = country;
    }

    public String getAlbum() { // Getter for album
        return album;
    }

    public void setAlbum(String album) { // Setter for album
        this.album = album;
    }

    public int getTrackTotal() { // Getter for total tracks
        return trackTotal;
    }

    public void setTrackTotal(int trackTotal) { // Setter for total tracks
        this.trackTotal = trackTotal;
    }    
}
