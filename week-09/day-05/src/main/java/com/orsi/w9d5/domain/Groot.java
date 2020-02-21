package com.orsi.w9d5.domain;

public class Groot {

    private String message;

    private String translated;

    public Groot(String message) {
        this.message = message;
        this.translated = "I am Groot.";
    }

    public Groot(){
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }
}
