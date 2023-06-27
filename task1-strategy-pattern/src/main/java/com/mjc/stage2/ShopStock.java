package com.mjc.stage2;

import java.lang.Object.*;
import java.util.ArrayList;
import java.util.List;

public class ShopStock {
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> executeFilteringStrategy(FilteringStrategy filteringStrategy){
        List<Product> result = new ArrayList<>();
        for (Product product: productList) {
            Boolean res = (filteringStrategy.filter(product));
            if (res){
                result.add(product);
            }
        }
        return result;
    }
}
