package com.example.animalsrecyclerview;

public class Animal_model {
    private int image;
    private String name;
    private  String type;

    public Animal_model(int image, String name, String type) {
        this.image = image;
        this.name = name;
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
