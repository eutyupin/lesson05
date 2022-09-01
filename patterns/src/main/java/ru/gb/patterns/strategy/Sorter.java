package ru.gb.patterns.strategy;

public class Sorter {
    private SortStrategy sorter;

    public Sorter(SortStrategy sorter) {
        this.sorter = sorter;
    }

    public int[] sort(int[] dataset) {
        return sorter.sort(dataset);
    }
}
