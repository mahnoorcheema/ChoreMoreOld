package com.uottawa.choremore.models;

import java.util.Date;
import java.util.List;

public class Chore {

    private String title;
    private List<Individual> assignees;
    private boolean completed;
    private int cycleLength;
    private Date cycleStart;

    public Chore(String title, List<Individual> assignees, boolean completed, int cycleLength, Date cycleStart) {
        this.title = title;
        this.assignees = assignees;
        this.completed = completed;
        this.cycleLength = cycleLength;
        this.cycleStart = cycleStart;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Individual> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<Individual> assignees) {
        this.assignees = assignees;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getCycleLength() {
        return cycleLength;
    }

    public void setCycleLength(int cycleLength) {
        this.cycleLength = cycleLength;
    }

    public Date getCycleStart() {
        return cycleStart;
    }

    public void setCycleStart(Date cycleStart) {
        this.cycleStart = cycleStart;
    }
}
