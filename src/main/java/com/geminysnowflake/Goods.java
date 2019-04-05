package com.geminysnowflake;

 class Goods {

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

     void setPrices(float buyingPrice, float sellingPrice){
        setPriceBuying(buyingPrice);
        setPriceSelling(sellingPrice);
    }


     String getName() {
        return name;
    }

     float getPriceBuying() {
        return priceBuying;
    }

    float getPriceSelling() {
        return priceSelling;
    }
}
