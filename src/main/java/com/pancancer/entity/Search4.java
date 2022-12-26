package com.pancancer.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Search4 {
    private int id;
    private String site;

    public int getId() { return id;}
    public void setId(int id) { this.id =id;}

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
