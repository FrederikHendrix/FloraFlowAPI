package com.example.floraflowapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class users {
    @Id
    private int id;
    private String username;
    private String password;

    public users(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public users()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
