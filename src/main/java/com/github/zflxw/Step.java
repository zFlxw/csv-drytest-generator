package com.github.zflxw;

import java.util.Arrays;

public class Step {
    private final int[] array;
    private final int i;
    private final int j;
    private final int pivot;
    private final int low;
    private final int high;

    public Step(int[] array, int i, int j, int pivot, int low, int high) {
        this.array = array;
        this.i = i;
        this.j = j;
        this.pivot = pivot;
        this.low = low;
        this.high = high;
    }

    public String[] getAsArray() {
        return new String[] {
            Arrays.toString(array),
            String.valueOf(i),
            String.valueOf(j),
            String.valueOf(pivot),
            String.valueOf(high),
            String.valueOf(low),
        };
    }
}
