package com.geminysnowflake;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class DataTableTest {

    @Test
    public void dataLoadedSuccessfully() throws IOException {
        CSVData dataTable = new CSVData();
        dataTable.loadCSVData("loadCSVTable(\"D:\\\\Coding\\\\Java\\\\Projects\\\\ImoAssistant\\\\tradingTable.csv\")");
        assertNotNull(dataTable.getCSVData());
    }

}