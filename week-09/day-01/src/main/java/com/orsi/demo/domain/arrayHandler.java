package com.orsi.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class arrayHandler {

    private String what;
    private Integer[] numbers;
    private Integer result;
    //@JsonProperty("result")
    private Integer[] resultArray;

    public arrayHandler(String what, Integer[] numbers) {
        switch (what) {
            case "sum":
                this.result = sum(numbers);
                break;
            case "multiply":
                this.result = multiply(numbers);
                break;
            case "double":
                this.resultArray = doubleNumber(numbers);
                break;
        }
    }

    private Integer[] doubleNumber(Integer[] numbers) {
        for (Integer number : numbers) {
            number = number * 2;
        }
        return numbers;
    }

    private Integer multiply(Integer[] numbers) {
        int result = 1;
        for (int i = 0; i <= numbers.length - 1; i++) {
            result *= numbers[i];
        }
        return result;
    }

    private Integer sum(Integer[] numbers) {
        int result = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            result += numbers[i];
        }
        return result;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public Integer[] getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer[] numbers) {
        this.numbers = numbers;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

   /* public Integer[] getResultArray() {
        return resultArray;
    }

    public void setResultArray(Integer[] resultArray) {
        this.resultArray = resultArray;
    }*/
}
