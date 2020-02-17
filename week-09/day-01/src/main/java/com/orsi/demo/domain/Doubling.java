package com.orsi.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Doubling {

    private Integer result;
    private Integer input;
    private String errorMessage;

    public Doubling(Integer input, Integer result){
        this.input = input;
        this.result = result;
    }

    public Doubling(){
        this.input = null;
        this.result = null;
        this.errorMessage = "provide an input number";
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getInput() {
        return input;
    }

    public void setInput(Integer input) {
        this.input = input;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
