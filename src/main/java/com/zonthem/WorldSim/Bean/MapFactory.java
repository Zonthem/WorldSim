package com.zonthem.WorldSim.Bean;

public class MapFactory {

    public Map createMap(int size) throws MapException {

        if (size > 0) {
            return new Map(size);
        } else {
            throw new MapException("Size not supported");
        }
    }

}
