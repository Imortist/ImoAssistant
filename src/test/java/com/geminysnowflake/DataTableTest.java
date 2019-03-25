package com.geminysnowflake;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class DataTableTest {

    @Test
     void dataLoadedSuccessfully() throws IOException {
        CSVData dataTable = new CSVData();
        dataTable.loadCSVData();
        assertNotNull(dataTable.getCSVData());
    }

}