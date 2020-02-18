package com.orsi.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class doubling {

    private Integer result;
    private Integer received;
    private String error;

    public doubling(Integer received, Integer result){
        this.received = received;
        this.result = result;
    }

    public doubling(){
        this.received = null;
        this.result = null;
        this.error = "Please provide an input!";
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
