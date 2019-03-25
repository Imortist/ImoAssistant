package com.geminysnowflake;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

class CSVData {

    private List csvData;

     void loadCSVData() throws IOException {
         String FILE_PATH = "D:\\Coding\\Java\\Projects\\ImoAssistant\\tradingTable.csv";
         CSVReader reader = new CSVReader(new FileReader(FILE_PATH));
         csvData = reader.readAll();
     }

     List getCSVData(){
         return csvData;
     }
}
