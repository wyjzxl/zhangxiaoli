package com.baidu;

public class User {
    private String username;
    private int password;

    public User(String username, int password) {
        this.username = username;
        this.password = password;
    }
    public User()
    {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

}
