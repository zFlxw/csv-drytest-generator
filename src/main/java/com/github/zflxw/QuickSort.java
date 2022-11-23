package com.github.zflxw;

public class QuickSort {
    public void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }

            Main.list.add(new Step(array.clone(), i, j, pivot, low, high));
        }

        swap(array, i + 1, high);
        Main.list.add(new Step(array.clone(), i, -1, pivot, low, high));
        return i + 1;
    }

    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int part = partition(array, low, high);

            quickSort(array, low, part - 1);
            quickSort(array, part + 1, high);
        }
    }
}