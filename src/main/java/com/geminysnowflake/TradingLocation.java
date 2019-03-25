package com.geminysnowflake;
import java.util.ArrayList;

public class TradingLocation {
    private String name;
    private ArrayList<Goods> stationGoods = new ArrayList<>();

    public TradingLocation(String tradingLocationName) {
        name = tradingLocationName;
    }

    public void addItem(String nameOfGoods){
        stationGoods.add(new Goods(nameOfGoods));
    }

    public Goods getGoodsByPosition(int position) {
        return stationGoods.get(position);
    }

}
