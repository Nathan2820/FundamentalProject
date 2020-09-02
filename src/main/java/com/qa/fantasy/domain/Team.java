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

    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER)
    private List<Player> players = new ArrayList<>();

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

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
