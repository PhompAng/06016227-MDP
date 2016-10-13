package com.example.phompang.myapplication.model;

import java.io.Serializable;

/**
 * Created by phompang on 10/13/2016 AD.
 */

public class User implements Serializable {
    private int id;
    private String fName;
    private String lName;
    private String phone;
    private int photo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String toString() {
        return id + ": " + fName + " " + lName;
    }
}
