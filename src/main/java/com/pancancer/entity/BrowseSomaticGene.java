package com.pancancer.entity;

public class BrowseSomaticGene {
    private String gene;
    private String names;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    public String getGene() {
        return gene;
    }
}
