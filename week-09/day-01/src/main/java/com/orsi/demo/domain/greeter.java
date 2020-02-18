package com.orsi.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class greeter {
    //private String name;
    //private String title;
    private String welcome_message;
    private String error;

    public greeter(String name, String title) {
        //this.name = name;
        //this.title = title;
        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }

    public greeter() {
        //this.name = null;
        //this.title = null;
        this.error = "Please provide a name and a title!";
    }

    public greeter(String error){
        this.error = error;
    }


/*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
*/

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
