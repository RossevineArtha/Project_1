package com.rossevine.project_1.Wrapper;

import com.rossevine.project_1.entity.User;

/**
 * Created by LENOVO on 2/22/2018.
 */

public class UserWrapper {
    private  int status;
    private  String message;
    private User user;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
