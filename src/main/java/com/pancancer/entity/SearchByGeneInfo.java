package com.pancancer.entity;

public class SearchByGeneInfo {

    private String symbol;
    private String hgnc_id;
    private String name;
    private String omim_id;
    private String alias_name;
    private String entrez_id;
    private String gene_synonym;
    private String ucsc_id;
    private String locus_group;
    private String vega_id;
    private String locus_type;
    private String ensembl_gene_id;
    private String refseq_accession;
    private String chr;
    private String start_coordinate;
    private String end_coordinate;
    private String uniprot_ids;
    private String strand;

    public String getStrand() {
        return strand;
    }

    public void setStrand(String strand) {
        this.strand = strand;
    }

    public String getUniprot_ids() {
        return uniprot_ids;
    }

    public void setUniprot_ids(String uniprot_ids) {
        this.uniprot_ids = uniprot_ids;
    }

    public String getEnd_coordinate() {
        return end_coordinate;
    }

    public void setEnd_coordinate(String end_coordinate) {
        this.end_coordinate = end_coordinate;
    }

    public String getStart_coordinate() {
        return start_coordinate;
    }

    public void setStart_coordinate(String start_coordinate) {
        this.start_coordinate = start_coordinate;
    }

    public String getChr() {
        return chr;
    }

    public void setChr(String chr) {
        this.chr = chr;
    }

    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getHgnc_id() {
        return hgnc_id;
    }
    public void setHgnc_id(String hgnc_id) {
        this.hgnc_id = hgnc_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOmim_id() {
        return omim_id;
    }
    public void setOmim_id(String omim_id) {
        this.omim_id = omim_id;
    }
    public String getAlias_name() {
        return alias_name;
    }
    public void setAlias_name(String alias_name) {
        this.alias_name = alias_name;
    }
    public String getEntrez_id() {
        return entrez_id;
    }
    public void setEntrez_id(String entrez_id) {
        this.entrez_id = entrez_id;
    }
    public String getGene_synonym() {
        return gene_synonym;
    }
    public void setGene_synonym(String gene_synonym) {
        this.gene_synonym = gene_synonym;
    }
    public String getUcsc_id() {
        return ucsc_id;
    }
    public void setUcsc_id(String ucsc_id) {
        this.ucsc_id = ucsc_id;
    }
    public String getLocus_group() {
        return locus_group;
    }
    public void setLocus_group(String locus_group) {
        this.locus_group = locus_group;
    }

    public String getVega_id() {
        return vega_id;
    }
    public void setVega_id(String vega_id) {
        this.vega_id = vega_id;
    }

    public String getLocus_type() {
        return locus_type;
    }

    public void setLocus_type(String locus_type) {
        this.locus_type = locus_type;
    }

    public String getEnsembl_gene_id() {
        return ensembl_gene_id;
    }

    public void setEnsembl_gene_id(String ensembl_gene_id) {
        this.ensembl_gene_id = ensembl_gene_id;
    }

    public String getRefseq_accession() {
        return refseq_accession;
    }

    public void setRefseq_accession(String refseq_accession) {
        this.refseq_accession = refseq_accession;
    }
}
