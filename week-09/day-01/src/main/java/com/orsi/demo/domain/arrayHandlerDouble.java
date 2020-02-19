package com.orsi.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class arrayHandlerDouble extends arrayHandler{

    @JsonProperty("result")
    private Integer[] resultArray;

    public arrayHandlerDouble(String what, Integer[] numbers) {
        super(what, numbers);
    }

    private Integer[] doubleNumber(Integer[] numbers) {
        for (Integer number : numbers) {
            number = number * 2;
        }
        return numbers;
    }

    public Integer[] getResultArray() {
        return resultArray;
    }

    public void setResultArray(Integer[] resultArray) {
        this.resultArray = resultArray;
    }
}
