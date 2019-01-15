package com.stackroute.domain;

public class Quote {

    private String author;
    private String quotation;

    public Quote(){

    }

    Quote(String author, String quotation) {
        this.author = author;
        this.quotation = quotation;

    }

    public String getQuotation() {
        return quotation;
    }

    public void setQuotation(String quotation) {
        this.quotation = quotation;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
