package com.qa.fantasy.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "players"})
public class Team {

    @Id
    @GeneratedValue
    private Long tid;

    @Column
    private String teamName;

    @OneToMany(mappedBy = "enrollment", fetch = FetchType.EAGER)
    private List<Enrollment> players = new ArrayList<>();

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

    public List<Enrollment> getPlayers() {
        return players;
    }

    public void setPlayers(List<Enrollment> players) {
        this.players = players;
    }
}
