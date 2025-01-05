/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.musicapp.controller.algorithm;

import com.musicapp.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

public class Search {

    // Method to find songs with titles containing a part of the given string
    public static List<MusicModel> findIntersectionByTitle(List<MusicModel> musicList, String searchString) {
        List<MusicModel> intersectedList = new ArrayList<>();
        for (MusicModel music : musicList) {
            if (music.getSongTitle().toLowerCase().contains(searchString.toLowerCase())) {
                intersectedList.add(music);
            }
        }
        return intersectedList;
    }
}

