package com.shop;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/shops")
public class ShopRestController
{
    @RequestMapping(method = RequestMethod.GET)
    public String listShops()
    {
        return "All Shops";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addShop()
    {
        return "Add Shop";
    }

    @RequestMapping(value = "/{id}/pictures", method = RequestMethod.GET)
    public String listPaintingsFromShop(@PathVariable("id") int id)
    {
        return "Get paintings from shop " + id;
    }

    @RequestMapping(value = "/{id}/pictures", method = RequestMethod.POST)
    public String addPaintingToShop(@PathVariable("id") int id, @RequestParam("name") String name, @RequestParam("author") String author)
    {
        return "Add painting. Name: "+ name + " Author: " + author +" to shop " + id;
    }

    @RequestMapping(value = "/{id}/pictures", method = RequestMethod.DELETE)
    public String deleteAllFromShop(@PathVariable("id") int id)
    {
        return "Delete all paintings from shop " +id;
    }
}