package com.example;

import java.util.ArrayList;
import java.util.List;

public class LionAlex extends Lion{

    public LionAlex() throws Exception {
        super("Самец");
    }

    public List<String> getFriends() {
        return List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
