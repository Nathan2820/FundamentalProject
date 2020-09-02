package com.qa.fantasy.domain;

import javax.persistence.*;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private Long pid;

    @Column
    private String name;

    @Column
    private String position;

    @Column
    private Long age;

    @ManyToOne(targetEntity = Team.class)
    private Team team;

    public Player() {
    }

    public Player(String name, String position, Long age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public Long getId() {
        return pid;
    }

    public void setId(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
