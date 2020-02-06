package com.orsi.reddit.model;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Reddit {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;
    private Integer likeCounter;
    @Temporal(TemporalType.DATE)
    private Date date;

    public Reddit() {
        this.likeCounter = 1;
        this.date = new Date();
    }

    public Reddit(String title, String url) {
    this.title = title;
    this.url = url;
    this.likeCounter = 1;
    this.date = new Date();
    }

    public Reddit(String title, String url, Integer likeCounter, Date date) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.likeCounter = likeCounter;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getLikeCounter() {
        return likeCounter;
    }

    public void setLikeCounter(Integer likeCounter) {
        this.likeCounter = likeCounter;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
