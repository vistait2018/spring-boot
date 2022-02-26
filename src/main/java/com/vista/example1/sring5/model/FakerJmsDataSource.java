package com.vista.example1.sring5.model;

public class FakerJmsDataSource {

    String user;
    String password;
    String Url;

    public FakerJmsDataSource() {
    }

    public FakerJmsDataSource(String user, String password, String url) {
        this.user = user;
        this.password = password;
        Url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
