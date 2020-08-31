package com.qa.fantasy.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Enrollment {

    @Id
    @GeneratedValue
    private Long eid;

    public Enrollment() {
    }

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }
}
