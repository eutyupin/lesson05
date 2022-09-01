package ru.gb.patterns;

import java.util.Iterator;
import java.util.Random;

public class MainIterator {
    public static void main(String[] args) {
        Iterable<Integer> nums = () -> new Iterator<>() {
            int count = 7;
            Random rand;
            int current = 0;
            @Override
            public boolean hasNext() {
                return current <= count;
            }

            @Override
            public Integer next() {
                current++;
                return (Integer) rand.nextInt(count);
            }
        };
        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}
