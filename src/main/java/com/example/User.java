package com.example;
import java.sql.*;

public class User {
    private int id;
    private String name;
    private String email;
    private Timestamp createdAt;

    public User(int id, String name, String email, Timestamp createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
    }

    // Геттеры и сеттеры

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', email='" + email + "', createdAt=" + createdAt + '}';
    }
}
