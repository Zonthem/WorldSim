package com.zonthem.WorldSim.Bean.LivingEntities;

import com.zonthem.WorldSim.Util.Etat;

public class Individual extends LivingEntity{

    private int age;

    private int timeBeforEat;

    private int timeBeforeSleep;

    public Individual() {
        age = 0;
        etat = Etat.ALIVE;
    }



}
