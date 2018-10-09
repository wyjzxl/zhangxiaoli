package com.baidu;

public abstract class jiaqin {
    private String name;
    private String strain;
    private String food;
    private String action;

    public jiaqin(String name, String strain, String food, String action) {
        this.name = name;
        this.strain = strain;
        this.food = food;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    protected abstract void showInfor();
}
