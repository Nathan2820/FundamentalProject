package com.qa.fantasy.domain;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Enrollment {

    @Id
    @GeneratedValue
    private Long eid;

    @ManyToOne(targetEntity = Team.class)
    private Team team;

    @ManyToOne(targetEntity = Player.class)
    private Player player;

    public Enrollment() {
    }

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
