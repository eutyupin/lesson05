package ru.gb.patterns.observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class EmploymentAgency extends Observable {
    private ArrayList<JobSeeker> observers;

    protected void notify(JobPost jobPosting) {
        for (JobSeeker observer : observers) {
            observer.onJobPosted(jobPosting);
        }
    }

    public void attach(JobSeeker observer) {
        observers.add(observer);
    }

    public void addJob(JobPost jobPosting) {
        notify(jobPosting);
    }
}
