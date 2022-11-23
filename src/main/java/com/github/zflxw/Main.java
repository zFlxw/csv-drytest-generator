package com.github.zflxw;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static final List<Step> list = new ArrayList<>();

    public static void main(String[] args) {
        File file = new File(System.getProperty("user.dir") + "/out", "output.csv");
        try {
            FileWriter fileWriter = new FileWriter(file);
            CSVWriter writer = new CSVWriter(fileWriter);
            QuickSort quickSort = new QuickSort();

            int[] numbers = {9, 2, 6, 1, 4, 5, 8};
            quickSort.quickSort(numbers, 0, numbers.length - 1);
            writer.writeNext(new String[]{ "Array", "i", "j", "pivot", "low", "high" });

            System.out.println(list);
            list.stream().map(Step::getAsArray).forEach(writer::writeNext);
            writer.close();
            System.out.println("Done! " + Arrays.toString(numbers));

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}