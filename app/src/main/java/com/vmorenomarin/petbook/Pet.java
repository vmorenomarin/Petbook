package com.vmorenomarin.petbook;

/**
 * Created by victor on 8/22/16.
 */
public class Pet {
    private int photo;
    private String name;
    private String age;

    public Pet(int photo, String name, String age) {
        this.photo = photo;
        this.name = name;
        this.age = age;

    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name; }

    public String getAge() {return age; }

    public void setAge(String age) {this.age = age; }

}



