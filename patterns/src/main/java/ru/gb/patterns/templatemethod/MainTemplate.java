package ru.gb.patterns.templatemethod;

public class MainTemplate {
    public static void main(String[] args) {
        AndroidBuilder androidBuilder = new AndroidBuilder();
        androidBuilder.build();

        IosBuilder iosBuilder = new IosBuilder();
        iosBuilder.build();
    }
}
