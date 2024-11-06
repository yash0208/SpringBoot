package com.rajaryan;

public class Product {
    String name;
    String id;
    int price;

    public Product(String name, String id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public Product() {
        name="Demo";
        price=0;
        id="1";
        System.out.println("Object Created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}
