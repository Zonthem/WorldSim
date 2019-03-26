package com.zonthem.WorldSim.Bean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapFactoryTest {

    @Test
    void testCreateMapBasic() throws MapException {
        //Given
        MapFactory mf = new MapFactory();

        //When
        Map map = mf.createMap(10);

        //Then
        assertEquals(new Map(10).getSize(), map.getSize());
    }

    @Test
    void testCreateMapNegativeSize() {
        //Given
        MapFactory mf = new MapFactory();

        //WhenThen
        MapException mapEx = assertThrows(MapException.class , () -> mf.createMap(-10));
        assertEquals("Size not supported", mapEx.getMessage());
    }
}