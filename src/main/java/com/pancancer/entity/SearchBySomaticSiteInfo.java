package com.pancancer.entity;

public class SearchBySomaticSiteInfo {
    private String gene;
    private String transcript;
    private String exon;
    private String pid0;
    private String cid0;
    private String gid0;
    private String chr;
    private String func;
    private String exonicfunc;
    private String pid;
    private String cid;
    private String gid;

    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    public String getChr() {
        return chr;
    }

    public void setChr(String chr) {
        this.chr = chr;
    }

    public String getCid0() {
        return cid0;
    }
    public void setCid0(String cid0){
        this.cid0 = cid0;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getExon() {
        return exon;
    }

    public void setExon(String exon) {
        this.exon = exon;
    }

    public String getExonicfunc() {
        return exonicfunc;
    }

    public void setExonicfunc(String exonicfunc) {
        this.exonicfunc = exonicfunc;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getGid0() {
        return gid0;
    }

    public void setGid0(String gid0) {
        this.gid0 = gid0;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPid0() {
        return pid0;
    }

    public void setPid0(String pid0) {
        this.pid0 = pid0;
    }

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }
}
