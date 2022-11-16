package com.pattern.create.prototype;

public class Client {
    public static void main(String[] args) {
        // 创建原型羊
        Sheep sheep = new Sheep(30.0D, "白色");
        System.out.println("原型羊：" + sheep);

        // 根据原型羊进行克隆得到克隆羊
        Sheep cloneSheep = sheep.clone();
        System.out.println("克隆羊：" + cloneSheep);
    }
}
