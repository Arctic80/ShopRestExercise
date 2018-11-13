package com.shop;

import java.time.LocalDate;


public class Painting
{
    private String authorName;
    private String name;
    private double price;
    private LocalDate enterDate;

    public Painting(String authorName, String name, double price, LocalDate enterDate)
    {
        this.authorName = authorName;
        this.name = name;
        this.price = price;
        this.enterDate = enterDate;
    }
}