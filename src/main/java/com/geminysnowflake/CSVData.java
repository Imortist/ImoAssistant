package com.geminysnowflake;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

class CSVData {

     private static String FILE_PATH = "D:\\Coding\\Java\\Projects\\ImoAssistant\\tradingTable.csv";
     private List csvData;

     List loadCSVData(String filePath) throws IOException {
         CSVReader reader = new CSVReader(new FileReader(FILE_PATH));
         return csvData = reader.readAll();
     }

     List getCSVData(){
         return csvData;
     }
}
