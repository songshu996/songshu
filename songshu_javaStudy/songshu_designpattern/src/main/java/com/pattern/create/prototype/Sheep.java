package com.pattern.create.prototype;

public class Sheep implements Cloneable{

    private Double weight;
    private String color;
    public Sheep (){}

    public Sheep (Double weight, String color){
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("对象地址：%d 体重：%.2fKg 颜色：%s", hashCode(), weight, color);
    }

    @Override
    protected Sheep clone() {
        try{
            return (Sheep) super.clone();
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return new Sheep();
    }
}
