package com.pancancer.entity;

public class BrowseGermlineGeneRatioVsCaspmi {

    private String gene;
    private String aachange;
    private String mafInGenecast;
    private String mafInCaspmi;

    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    public String getAachange() {
        return aachange;
    }

    public void setAachange(String aachange) {
        this.aachange = aachange;
    }

    public String getMafInGenecast() {
        return mafInGenecast;
    }

    public void setMafInGenecast(String mafInGenecast) {
        this.mafInGenecast = mafInGenecast;
    }

    public String getMafInCaspmi() {
        return mafInCaspmi;
    }

    public void setMafInCaspmi(String mafInCaspmi) {
        this.mafInCaspmi = mafInCaspmi;
    }
}
