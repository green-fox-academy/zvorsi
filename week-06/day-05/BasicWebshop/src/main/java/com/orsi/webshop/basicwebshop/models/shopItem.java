package com.orsi.webshop.basicwebshop.models;

public class shopItem implements Comparable<shopItem>{

    private String name;
    private String description;
    private Double price;
    private String currency;
    private int quantityOfStock;

    public shopItem(String name, String description, double price, String currency, int quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.currency = currency;
        this.quantityOfStock = quantityOfStock;
    }

    public String getPrice2Decimal() {
        return String.format("%.2f", price);
    }

    public String getStock2Decimal() {
        return String.format("%.2f", quantityOfStock);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getQuantityOfStock() {
        return quantityOfStock;
    }

    public void setQuantityOfStock(int quantityOfStock) {
        this.quantityOfStock = quantityOfStock;
    }

    @Override
    public int compareTo(shopItem o) {
        return this.price.compareTo(o.price);
    }
}
