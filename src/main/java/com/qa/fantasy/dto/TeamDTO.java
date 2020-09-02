package com.qa.fantasy.dto;

import java.util.ArrayList;
import java.util.List;

public class TeamDTO {

    private Long tid;
    private String teamName;
    private List<PlayerDTO> players = new ArrayList<>();

    public TeamDTO() {

    }

    public TeamDTO(String teamName) {
        super();
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

    public List<PlayerDTO> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerDTO> players) {
        this.players = players;
    }
}
