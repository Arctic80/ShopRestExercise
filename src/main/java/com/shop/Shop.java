package com.shop;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class Shop
{
    private static int lastId = 1;
    private int id;
    private String name;
    private int maxCapacity;

    private Map<String, Painting> paintings = new HashMap<>();

    public Shop(String name, int maxCapacity)
    {
        this.id = lastId;
        lastId++;
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    public void addPainting(String name, String author) throws Exception
    {
        if (name == null || name.equals("")) throw new Exception();

        Painting painting = new Painting(author, name, 10, LocalDate.now());
        paintings.put(name, painting);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMaxCapacity()
    {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity)
    {
        this.maxCapacity = maxCapacity;
    }
}
