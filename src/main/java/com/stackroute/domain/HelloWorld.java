package com.stackroute.domain;

public class HelloWorld {
    private Quote quote;
    private String msg = "helloworld";

    HelloWorld(Quote quote) {
        this.quote = quote;
    }

    public String getMessage() {
        return msg;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }
}
