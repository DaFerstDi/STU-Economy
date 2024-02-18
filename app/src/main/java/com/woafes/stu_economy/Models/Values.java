package com.woafes.stu_economy.Models;

public class Values {

    private String name; // название
    private String value;  // значение
    private int iconImage; // иконка

    public Values(String name, String value, int icon){

        this.name = name;
        this.value = value;
        this.iconImage = icon;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getIconImage() {
        return this.iconImage;
    }

    public void setIconImage(int iconImage) {
        this.iconImage = iconImage;
    }
}