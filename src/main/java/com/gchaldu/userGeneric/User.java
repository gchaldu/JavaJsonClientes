package com.gchaldu.userGeneric;

public class User {
    private String username;
    private String password;
    private Integer id;
    private Integer counter=0;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.id = ++counter;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }
}
