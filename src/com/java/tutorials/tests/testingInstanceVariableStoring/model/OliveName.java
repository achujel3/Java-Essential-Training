package com.java.tutorials.tests.testingInstanceVariableStoring.model;

public enum OliveName {

    KALAMATA("Kalamata"), LIGURIAN("Ligurian");

    private String name;

    OliveName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
