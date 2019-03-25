package com.geminysnowflake;

public class Goods {

    private String name;
    private float priceBuying;
    private float priceSelling;

    Goods(String name) {
        this.name = name;

    }


    private void setPriceBuying(float priceBuying) {
        this.priceBuying = priceBuying;
    }

    private void setPriceSelling(float priceSelling) {
        this.priceSelling = priceSelling;
    }

    public void setPrices(float buyingPrice, float sellingPrice){
        setPriceBuying(buyingPrice);
        setPriceSelling(sellingPrice);
    }


    public String getName() {
        return name;
    }

    public float getPriceBuying() {
        return priceBuying;
    }

    float getPriceSelling() {
        return priceSelling;
    }
}
