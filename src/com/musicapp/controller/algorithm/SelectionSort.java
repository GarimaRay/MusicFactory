package com.musicapp.controller.algorithm;

import com.musicapp.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    // Method to sort MusicModel list by views
    public List<MusicModel> performSelectionSortByViews(List<MusicModel> unsortedData, boolean isDesc) {
        List<MusicModel> dataToSort = new ArrayList<>();
        dataToSort.addAll(unsortedData);
        
        for (int i = 0; i < dataToSort.size(); i++) {
            // Extremum value
            int extremumIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                if (isDesc) {
                    if (dataToSort.get(j).getView() > dataToSort.get(extremumIndex).getView()) {
                        extremumIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getView() < dataToSort.get(extremumIndex).getView()) {
                        extremumIndex = j;
                    }
                }
            }
            // Swap
            MusicModel tempMusicModel = dataToSort.get(i);
            dataToSort.set(i, dataToSort.get(extremumIndex));
            dataToSort.set(extremumIndex, tempMusicModel);
        }
        return dataToSort;
    }
}
