package com.vmorenomarin.petbook;

/**
 * Created by victor on 8/22/16.
 */
public class Pet {
    private int photo;
    private String name;
    private int age;
    private String master;
    private int phone;

    public Pet(int photo, String name, int age, String master,  int phone) {
        this.photo = photo;
        this.name = name;
        this.age = age;
        this.master = master;
        this.phone = phone;
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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}



