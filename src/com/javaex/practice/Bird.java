package com.javaex.practice;

public abstract class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void sing();

    abstract public void fly();
    abstract public void showName();

}
