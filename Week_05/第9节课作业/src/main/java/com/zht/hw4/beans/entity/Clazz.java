package com.zht.hw4.beans.entity;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Clazz {

    private int id;
    private String name;
    private String clazzNum;
    private int stuTotal;

    public Clazz() {
    }

    public Clazz(int id, String name, String clazzNum, int stuTotal) {
        this.id = id;
        this.name = name;
        this.clazzNum = clazzNum;
        this.stuTotal = stuTotal;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clazzNum='" + clazzNum + '\'' +
                ", stuTotal=" + stuTotal +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazzNum() {
        return clazzNum;
    }

    public void setClazzNum(String clazzNum) {
        this.clazzNum = clazzNum;
    }

    public int getStuTotal() {
        return stuTotal;
    }

    public void setStuTotal(int stuTotal) {
        this.stuTotal = stuTotal;
    }
}
