package com.pancancer.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Search3 {
    private int id;
    private String pathway;
    public int getId() { return id;}
    public void setId(int id) { this.id =id;}
    public String getPathway() {
        return pathway;
    }
    public void setPathway(String pathway) {
        this.pathway =pathway;
    }
}
