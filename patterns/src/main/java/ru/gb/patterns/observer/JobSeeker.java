package ru.gb.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class JobSeeker implements Observer {
    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    public void onJobPosted(JobPost job) {
        System.out.println("Hi " + name + "! New job posted: " + job.getTitle());
    }

    @Override
    public void update(Observable observable, Object o) {

    }
}
