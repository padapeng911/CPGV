package com.pancancer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BrowseSomatic {
    private String gene;
    private String gnumber;
    private String chr;
    private String func;
    private String exonicFunc;
    private Integer pageNum;
    private Integer pageSize;
    public String getGene() {
        return gene;
    }
    public void setGene(String gene) {
        this.gene =gene;
    }
}
