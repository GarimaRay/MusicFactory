/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.musicapp.controller.algorithm;

/**
 *
 * @author chick
 */
import com.musicapp.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public List<MusicModel> sortBySongTitle(List<MusicModel> unsortedData) {
        List<MusicModel> sortedData = new ArrayList<>(unsortedData);

        for (int i = 1; i < sortedData.size(); i++) {
            MusicModel key = sortedData.get(i);
            int j = i - 1;

            while (j >= 0 && sortedData.get(j).getSongTitle().compareTo(key.getSongTitle()) > 0) {
                sortedData.set(j + 1, sortedData.get(j));
                j = j - 1;
            }
            sortedData.set(j + 1, key);
        }

        return sortedData;
    }
}

