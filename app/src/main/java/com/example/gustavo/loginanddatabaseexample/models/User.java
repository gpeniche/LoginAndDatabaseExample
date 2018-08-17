package com.example.gustavo.loginanddatabaseexample.models;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {

    public String email;

    public User() {
    }

    public User(String email) {
        this.email = email;
    }

}
