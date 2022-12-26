package com.pancancer.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Search0 {
    private int id;
    private String type;
    private String gene;
    private String chr;
    private String start;
    private String end;
    private String region;
    private String pathway;
    public int getId() { return id;}
    public void setId(int id) { this.id =id;}
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type =type;
    }
    public String getGene() {
        return gene;
    }
    public void setGene(String gene) {
        this.gene =gene;
    }
    public String getChr() {
        return chr;
    }
    public void setChr(String chr) {
        this.chr =chr;
    }
    public String getStart() {
        return start;
    }
    public void setStart(String start) {
        this.start =start;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end =end;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region =region;
    }
    public String getPathway() {
        return pathway;
    }
    public void setPathway(String pathway) {
        this.pathway =pathway;
    }
}
