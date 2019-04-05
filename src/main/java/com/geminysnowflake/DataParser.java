package com.geminysnowflake;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class DataParser {
    private BufferedReader br;

    DataParser(String file) throws FileNotFoundException {
        br = new BufferedReader(new FileReader(file));
    }


    String getStations() throws IOException {
        StringBuilder result = new StringBuilder();
        String s;
        while ((s = br.readLine()) != null) {
            result.append(s.substring(0, s.indexOf('-')).trim()).append(", ");
        }
        return result.substring(0, result.length() - 2);
    }

    String getStationGoods(String location) throws IOException {
        StringBuilder result = new StringBuilder();

        for(String line : getLinesFromFile().toString().split("\\R")){
            if(line.contains(location)){
                result.append(line.substring(line.indexOf('-')).substring(2));
            }
        }
        return  result.toString();
    }

     private StringBuilder getLinesFromFile() throws IOException {
        String s;
        StringBuilder result = new StringBuilder();
        while((s = br.readLine()) != null){
                result.append(s).append("\n");
        }
        return result;
    }
}
