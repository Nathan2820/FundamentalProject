package com.qa.fantasy.domain;

import javax.persistence.*;

@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long tid;

    @Column
    private String teamName;

    public Team() {
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
