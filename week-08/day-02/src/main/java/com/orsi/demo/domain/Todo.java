package com.orsi.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    protected long id;
    protected String title;
    protected boolean urgent;
    protected boolean done;

}
