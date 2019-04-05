package com.geminysnowflake;
import java.util.ArrayList;

 class TradingLocation {
    private String name;
    private ArrayList<Goods> stationGoods = new ArrayList<>();

     TradingLocation(String tradingLocationName) {
        name = tradingLocationName;
    }

     void addItem(String nameOfGoods){
        stationGoods.add(new Goods(nameOfGoods));
    }

     Goods getGoodsByPosition(int position) {
        return stationGoods.get(position);
    }

}
