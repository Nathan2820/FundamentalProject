package com.example.fantasy.domain;

import javax.persistence.*;

@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long tid;

    public Team() {
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}
