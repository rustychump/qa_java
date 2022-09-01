package com.example;

import java.util.List;

public class Lion{

    boolean hasMane;
    private Kittens kittens;
    private Food food;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public Lion(Kittens kittens, Food food) {
        this.kittens = kittens;
        this.food = food;
    }


    public int getKittens() {
        return kittens.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return food.getFood("Хищник");
    }
}