package com.zonthem.WorldSim.Bean;

public class Map {

    private int size;

    private Case[][] grid;

    public Map(int _size) {

    }

    public int getSize() {
        return size;
    }

    public Case[][] getGrid() {
        return grid;
    }
}
