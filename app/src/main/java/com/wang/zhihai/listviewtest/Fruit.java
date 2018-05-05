package com.wang.zhihai.listviewtest;

/**
 * Created by 王治海 on 2018/5/5.
 */
public class Fruit {
    private String fruitName;
    private int fruitImage;


    Fruit(String fruitName, int fruitImage) {
        this.fruitImage = fruitImage;
        this.fruitName = fruitName;
    }

    public int getFruitImage() {
        return fruitImage;
    }

//    public void setFruitImage(int fruitImage) {
//        this.fruitImage = fruitImage;
//    }

    public String getFruitName() {
        return fruitName;
    }

//    public void setFruitName(String fruitName) {
//        this.fruitName = fruitName;
//    }
}
