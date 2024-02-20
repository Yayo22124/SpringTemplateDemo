package com.spring.apimodelo.model;

import java.util.UUID;

public class Usuario {
    private UUID id;
    private String userName;
    private String userFullName;

    public Usuario(UUID id, String userName, String userFullName) {
        this.id = id;
        this.userName = userName;
        this.userFullName = userFullName;
    }
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserFullName() {
        return userFullName;
    }
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    
}
