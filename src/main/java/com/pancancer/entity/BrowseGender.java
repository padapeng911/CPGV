package com.pancancer.entity;

public class BrowseGender {
    private String type;
    private String female;
    private String male;
    private String percent1;
    private String percent2;

    public String getPercent1() {
        return percent1;
    }

    public void setPercent1(String percent1) {
        this.percent1 = percent1;
    }

    public String getPercent2() {
        return percent2;
    }

    public void setPercent2(String percent2) {
        this.percent2 = percent2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFemale() {
        return female;
    }

    public void setFemale(String female) {
        this.female = female;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }
}
