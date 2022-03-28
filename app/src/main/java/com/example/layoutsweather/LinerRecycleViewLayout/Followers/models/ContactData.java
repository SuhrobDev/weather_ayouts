package com.example.layoutsweather.LinerRecycleViewLayout.Followers.models;

public class ContactData {
    private final String name;
    private final String countFollower;
    private final int image;
    private final int color;

    public ContactData(String name, String countFollower, int image, int color) {
        this.name = name;
        this.countFollower = countFollower;
        this.image = image;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getCountF() {
        return countFollower;
    }

    public int getImage() {
        return image;
    }

    public int getColor(){
        return color;
    }
}
