package com.example.a30daystolearningeverything.model;

public class RecyclerModel {
    private String days;
    private String title;
    private int image;
    private String description;

    public RecyclerModel(String days, String title, int image, String description) {
        this.days = days;
        this.title = title;
        this.image = image;
        this.description = description;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
