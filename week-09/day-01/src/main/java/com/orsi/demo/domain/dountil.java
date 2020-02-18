package com.orsi.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class dountil {

    private Integer result;
    private String error;
    private Integer until;

    public dountil(){
    }

    public dountil(Integer until, String action) {
        if (until == null){
            this.error = "Please provide a until!";
        }else if (action.equals("sum")){
            this.result = sumUntil(until);
        }else if (action.equals("factor")){
            this.result = factorial(until);
        }
    }

    private Integer factorial(Integer until) {
        Integer result = 1;
        for (int i = 1; i <= until; i++) {
            result *= i;
        }
        return result;
    }

    private Integer sumUntil(Integer until) {
        Integer result = 0;
        for (int i = 0; i <= until ; i++) {
            result += i;
        }
        return result;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    public dountil(Integer result) {
        this.result = result;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
