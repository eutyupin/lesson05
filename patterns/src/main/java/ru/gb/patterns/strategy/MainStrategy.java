package ru.gb.patterns.strategy;

public class MainStrategy {
    public static void main(String[] args) {
        int[] dataset = {1, 5, 4, 3, 2, 8};

        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sort(dataset);

        Sorter sorterTwo = new Sorter(new QuickSortStrategy());
        sorterTwo.sort(dataset);
    }
}
