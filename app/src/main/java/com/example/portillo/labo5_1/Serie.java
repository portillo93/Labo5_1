package com.example.portillo.labo5_1;

public class Serie{
    private String name, caps, desc;
    private int img;

    public Serie(String name, String caps, int img,String desc){
        this.name = name;
        this.caps = caps;
        this.img = img;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaps() {
        return caps;
    }

    public void setCaps(String caps) {
        this.caps = caps;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
