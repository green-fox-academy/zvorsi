package com.orsi.w9d5.domain;

public class Yondu {

    private Double speed;
    private Double distance;
    private Double time;
    //private String error;

    public Yondu(Double distance, Double time) {
        if (time != null && distance != null){
            this.distance = distance;
            this.time = time;
            this.speed = distance / time;
        }
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

   /* public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }*/
}
