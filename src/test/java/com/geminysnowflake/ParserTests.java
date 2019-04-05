package com.geminysnowflake;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ParserTests {
    ParserTests() throws FileNotFoundException {}

    private DataParser dp = new DataParser("SC_Trading_Test.txt");


    @Test
     void getAllStations() throws IOException {
        assertEquals("Port Olisar, GrimHex, Lyra", dp.getStations());
    }

    @Test
     void getPortOlisarGoods() throws IOException {
        assertEquals("Agricium(0,25.6); Agricultural Supplies(0,0); Altruciatoxine(0,0);", dp.getStationGoods("Port Olisar"));
    }
    @Test
    void getGrimHexGoods() throws IOException {
        assertEquals("Agricium(0,25.6); Agricultural Supplies(0,0); Altruciatoxine(0,11.64); Medical Supplies();", dp.getStationGoods("GrimHex"));
    }

    @Test
    void getLyraGoods() throws IOException {
        assertEquals("Chlorine; Beryl; Corundum; Gold; Iodine;", dp.getStationGoods("Lyra"));
    }
}
