package com.pancancer.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Search1 {
    private int id;
    private String gene;
    public int getId() { return id;}
    public void setId(int id) { this.id =id;}
    public String getGene() {
        return gene;
    }
    public void setGene(String gene) {
        this.gene =gene;
    }
}
