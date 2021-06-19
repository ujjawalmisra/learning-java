package me.ujjawal.learning_java.annotations.custom;

public class QProduct {

    private String name;
    private String brand;
    private float price;

    public String getName() {
        return name;
    }

    @BuilderProperty
    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    @BuilderProperty
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    @BuilderProperty
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "QProduct{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
