package com.shop;

import java.util.HashMap;
import java.util.Map;

public class ShopRepository
{
    private Map<String, Shop> shops = new HashMap<>();

    private void addShop(String name, Shop shop)
    {
        shops.put(name, shop);
    }

    private void deleteAllShops(String name)
    {
        shops.clear();
    }
}