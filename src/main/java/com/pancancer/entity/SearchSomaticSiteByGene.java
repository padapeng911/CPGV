package com.pancancer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SearchSomaticSiteByGene {
    private String gene;
    private String gnumber;
    private String func;
    private String chr;
    private String exonicFunc;

    public String getGene() {
        return gene;
    }
    public void setGene(String gene) {
        this.gene =gene;
    }

    public String getGnumber() {
        return gnumber;
    }

    public void setGnumber(String gnumber) {
        this.gnumber = gnumber;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public String getChr() {
        return chr;
    }

    public void setChr(String chr) {
        this.chr = chr;
    }

    public String getExonicFunc() {
        return exonicFunc;
    }

    public void setExonicFunc(String exonicFunc) {
        this.exonicFunc = exonicFunc;
    }

}
