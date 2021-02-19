package com.zht.beans;

public class Klass {
    private String id;

    @Override
    public String toString() {
        return "Klass{" +
                "id='" + id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Klass(String id) {
        this.id = id;
    }

    public Klass() {
    }
}
