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

public class MergeSort {

    public List<MusicModel> sortByTrackTotal(List<MusicModel> unsortedData, boolean isDesc) {
        if (unsortedData.size() <= 1) {
            return unsortedData;
        }

        int mid = unsortedData.size() / 2;

        List<MusicModel> left = new ArrayList<>(unsortedData.subList(0, mid));
        List<MusicModel> right = new ArrayList<>(unsortedData.subList(mid, unsortedData.size()));

        return merge(sortByTrackTotal(left, isDesc), sortByTrackTotal(right, isDesc), isDesc);
    }

    private List<MusicModel> merge(List<MusicModel> left, List<MusicModel> right, boolean isDesc) {
        List<MusicModel> merged = new ArrayList<>();
        int leftIndex = 0, rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if ((isDesc && left.get(leftIndex).getTrackTotal() >= right.get(rightIndex).getTrackTotal()) ||
                (!isDesc && left.get(leftIndex).getTrackTotal() <= right.get(rightIndex).getTrackTotal())) {
                merged.add(left.get(leftIndex));
                leftIndex++;
            } else {
                merged.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        while (leftIndex < left.size()) {
            merged.add(left.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex < right.size()) {
            merged.add(right.get(rightIndex));
            rightIndex++;
        }

        return merged;
    }
}

