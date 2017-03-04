package com.java.tutorials.tests.testingInstanceVariableStoring.model;

public abstract class Olive {


    private OliveName name;
    private OliveColor color;
    private int oil = 3;

    public Olive(){}

    public Olive(OliveName name, OliveColor color, int oil){
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public OliveColor getColor() {
        return color;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }

    public int crush() {
        StringBuilder stringBuilder = new StringBuilder(name.toString())
                .append(", from ")
                .append(getOrigin())
                .append(": ")
                .append(oil)
                .append(" units");
        System.out.println(stringBuilder.toString());
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public OliveName getName() {

        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public abstract String getOrigin();

    @Override
    public String toString() {
        return name.toString();
    }
}
