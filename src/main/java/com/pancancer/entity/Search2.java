package com.pancancer.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Search2 {
    private int id;
    private String type;
    public int getId() { return id;}
    public void setId(int id) { this.id =id;}
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type =type;
    }
}
