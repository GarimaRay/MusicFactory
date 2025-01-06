/* * @author 23048613 Garima Ray
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.musicapp.controller.algorithm;

import com.musicapp.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

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

    // Binary search method to find a song by its exact title
    public static int binarySearchByTitle(List<MusicModel> musicList, String targetTitle) {
        int left = 0;
        int right = musicList.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            String midTitle = musicList.get(mid).getSongTitle();

            if (midTitle.compareToIgnoreCase(targetTitle) == 0) {
                return mid;
            }

            if (midTitle.compareToIgnoreCase(targetTitle) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // If the title is not found
    }
}
