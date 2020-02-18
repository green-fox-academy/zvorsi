package com.orsi.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class greeter {

    private String welcome_message;
    private String error;

    public greeter(String name, String title) {

        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }

    public greeter() {

        this.error = "Please provide a name and a title!";
    }

    public greeter(String error) {
        this.error = error;
    }


    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
