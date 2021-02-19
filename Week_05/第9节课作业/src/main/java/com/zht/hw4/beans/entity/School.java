package com.zht.hw4.beans.entity;

import org.springframework.stereotype.Component;

@Component
public class School {
    private int id;

    public School() {
    }

    public School(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                '}';
    }
}
