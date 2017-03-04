package com.java.tutorials.tests.testingInstanceVariableStoring.model;

public enum OliveColor {

    BLACK("Black", 0x000000), PURPLE("Purple", 0x2E0854), GREEN("Green", 0x00FF00);

    String name;
    long color;

    OliveColor(String name, long color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return name;
    }
}
