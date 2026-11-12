package com.shopeasy;

public class PriceService {

    public double applyDiscount(double price, int percent) {
        return price - (price * percent / 100);
    }
}
