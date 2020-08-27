package com.example.fantasy.domain;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int uid;

    @Column
    private String forename;

    @Column
    private String surname;

    public User() {
    }

    public User(String forename, String surname) {
        this.forename = forename;
        this.surname = surname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
