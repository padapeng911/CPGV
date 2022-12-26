package com.pancancer.entity;

public class BrowseGermlineGeneRatio {
    private String gene;
    private String type;
    private String ratio;
    private String odds;
    private String pvalue;
    private String fdr;
    private Float log2odds;
    private Float log10fdr;
    private String log2odds0;
    private String log10fdr0;

    public String getLog2odds0() {
        return log2odds0;
    }

    public void setLog2odds0(String log2odds0) {
        this.log2odds0 = log2odds0;
    }

    public String getLog10fdr0() {
        return log10fdr0;
    }

    public void setLog10fdr0(String log10fdr0) {
        this.log10fdr0 = log10fdr0;
    }

    public Float getLog10fdr() {
        return log10fdr;
    }

    public void setLog10fdr(Float log10fdr) {
        this.log10fdr = log10fdr;
    }

    public Float getLog2odds() {
        return log2odds;
    }

    public void setLog2odds(Float log2odds) {
        this.log2odds = log2odds;
    }

    public String getFdr() {
        return fdr;
    }

    public void setFdr(String fdr) {
        this.fdr = fdr;
    }

    public String getPvalue() {
        return pvalue;
    }

    public void setPvalue(String pvalue) {
        this.pvalue = pvalue;
    }

    public String getOdds() {
        return odds;
    }

    public void setOdds(String odds) {
        this.odds = odds;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }
}
