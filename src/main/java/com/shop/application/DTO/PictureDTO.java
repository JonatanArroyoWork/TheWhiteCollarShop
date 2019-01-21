package com.shop.application.DTO;

import com.google.gson.annotations.Expose;
import com.shop.domain.Picture;
import com.shop.domain.Shop;


import java.util.Calendar;

public class PictureDTO {

    @Expose
    private int id;
    @Expose
    private String name, author;
    @Expose
    private double price;
    @Expose
    private Calendar date;
    @Expose
    private Shop shop;

    public PictureDTO(Picture picture) throws Exception {
        if (picture == null)
            throw new Exception();

        this.id = picture.getId();
        this.name = picture.getName();
        this.author = picture.getAuthor();
        this.price = picture.getPrice();
        this.date = picture.getDate();
        this.shop = picture.getShop();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        if (name == null)
            return "";
        return name;
    }

    public String getAuthor() {
        if (author == null || author.equals(""))
            return "Anonimo";
        return author;
    }

    public double getPrice() {
        return price;
    }

    public Calendar getDate() {
        return date;
    }

    public Shop getShop() {
        return shop;
    }
}
