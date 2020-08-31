package com.qa.fantasy.dto;

public class PlayerDTO {

    private Long id;
    private String name;
    private String position;
    private Long age;

    public PlayerDTO() {
    }

    public PlayerDTO(String name, String position, Long age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
